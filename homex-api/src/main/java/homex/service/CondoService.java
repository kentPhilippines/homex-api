package homex.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import homex.bean.CondoEntity;
import homex.bean.CondoTowerEntity;
import homex.bean.UserEntity;
import homex.bean.UserEntityExample;
import homex.bean.UserEntityExample.Criteria;
import homex.common.bean.Common;
import homex.common.bean.Result;
import homex.common.framework.BaseService;
import homex.config.exception.OtherErrors;
import homex.mapper.CodeEntityMapper;
import homex.mapper.CondoEntityMapper;
import homex.mapper.CondoTowerEntityMapper;
import homex.mapper.UserEntityMapper;
@Component
public class CondoService extends BaseService{
	@Autowired CondoEntityMapper condoEntityDao;
	@Autowired LoginService loginServiceImpl;
	@Autowired CondoTowerEntityMapper condoTowerEntityDao;
	@Autowired QueryMapService queryMapServiceImpl;
	@Autowired UserEntityMapper userDao;
	
	
	/**
	 * <p>分页查询condo</p>
	 * @param condoName				公寓名称模糊匹配
	 * @param userID				目前不知道是什么意思
	 * @return
	 */
	public List<UserEntity> findCondo(String userID ,  String condoName ) {
		UserEntityExample example = new UserEntityExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserRoleEqualTo(Integer.valueOf(Common.Role.CONDO));
		if(StrUtil.isNotBlank(userID))
			criteria.andUserIdEqualTo(userID);
		if(StrUtil.isNotBlank(condoName))
			criteria.andUserNameLike(condoName);
		List<UserEntity> userList = userDao.selectByExample(example);
		return userList;
	}
	
	/**
	 * <p>修改公寓数据</p>
	 * @param condoId 修改主键
	 * 可供修改数据：
			condoName
			phone
			email
			tower
	 * @return
	 */
	@Transactional(rollbackFor=Exception.class) 
	Result updateCondo(String condoId ,String condoName,String phone,String email,String tower){
		if(StrUtil.isBlank(condoId))
			return Result.buildFailMessage("condoId is null");
		UserEntity findUserByEmail = userDao.findUserByEmail(email);
		if(ObjectUtil.isNotNull(findUserByEmail))
			return Result.buildFailMessage("email 重复");
		//1,修改账户数据
		//2,修改标签数据
		UserEntityExample example = new UserEntityExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(condoId);
		UserEntity user = new UserEntity();
		if(StrUtil.isNotBlank(condoName))
			user.setUserName(condoName);
		if(StrUtil.isNotBlank(phone))
			user.setUserPhone(phone);
		if(StrUtil.isNotBlank(email))
			user.setUserEmail(email);
		int result = userDao.updateByExampleSelective(user, example);
		if(result == 0)
			return Result.buildFailMessage("数据修改失败");
		int i = condoTowerEntityDao.updateCondoName(  condoId ,   condoName);
		if(i==0)
			throw new OtherErrors("修改失败");
		int j = condoEntityDao.updateCondoName(  condoId ,   condoName);
		if(j==0)
			throw new OtherErrors("修改失败");
		return Result.buildSuccess();
	}
	
	/**
	 * <p>删除公寓数据</p>
	 * @param condoId			公寓系统ID
	 * @return
	 */
	Result deleteCondo(String condoId){
		/**
		 * <p>删除公寓逻辑</p>
		 * 1,删除登录表数据
		 * 2,删除condo表数据
		 * 3,删除tower标签库数据
		 * 4,删除todo数据
		 * 5,删除房屋数据
		 * 6,删除与之有关的所有数据
		 */
		return Result.buildFail();
	}
	
	
	/**
	 * <p>添加公寓</p>
	 * @param email					邮箱
	 * @param password				密码
	 * @param condoName				昵称
	 * @param phone					电话号码
	 * @param tower					TOWER【栋】【不同的公寓有不同的tower别称】
	 * @return
	 */
	@Transactional(rollbackFor=Exception.class) 
	public Result addCondo(String email, String password, String condoName, String phone, String tower) {
		if(StrUtil.isBlank(tower))
			return Result.buildFailMessage("tower数据为空");
		int nameCount = condoEntityDao.findCondoName(condoName);
		if(nameCount>0)
			return Result.buildFailMessage("当前condoName已存在，请更换");
		/**
		 * #################################################
		 * 1,生成公寓账号数据
		 * 2,生成公寓标签数据
		 * 3,生成该公寓tower数据【做condo的tower字典使用】
		 * 4,生成公寓查询地图数据
		 * #################################################
		 */
		//1,生成公寓账号数据
		Result resiger = loginServiceImpl.resiger(condoName, phone, email, password, Common.Role.CONDO, "", "");
		if(!resiger.isSuccess())
			throw new OtherErrors("生成账户数据错误");
		//2,生成公寓标签数据
		CondoEntity condo = new CondoEntity();
		String condoId = getCondoName();
		condo.setCondoId(condoId);
		condo.setCondoName(condoName);
		int insertSelective = condoEntityDao.insertSelective(condo);
		if(insertSelective < 1)
			throw new OtherErrors("生成账户数据错误");
		log.info("【当前传入condo的tower数据为："+tower+"】");
		String[] split = tower.split(",");
		for(String towerName : split) {
			//ThreadUtil.execAsync(()->{
				CondoTowerEntity condoTower = new CondoTowerEntity();
				condoTower.setCondoId(condoId);
				condoTower.setCondoName(condoName);
				condoTower.setTowerId(getTowerName());
				condoTower.setTowerName(towerName);
				int insertSelective2 = condoTowerEntityDao.insertSelective(condoTower);
				if(insertSelective2 < 1);
					throw new OtherErrors("生成账户数据错误");
		//	});
		}
		//生成查询地图
		Result addMapByCondo = queryMapServiceImpl.addMapByCondo(condoId, condoId );
		if(addMapByCondo.isSuccess())
			return Result.buildSuccess();
		throw new OtherErrors("生成账户数据错误");
	}
	String getCondoName(){
		String username = RandomUtil.randomNumbers(15);
		if( condoEntityDao.findCondoId(username)>1) 
			getCondoName();
		return username;
	}
	String getTowerName(){
		String condotower = RandomUtil.randomNumbers(8);
		if( condoTowerEntityDao.findCondoTowerId(condotower)>1) 
			getTowerName();
		return condotower;
	}
}
