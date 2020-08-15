package homex.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import homex.bean.CondoTowerEntity;
import homex.bean.QueryMapEntity;
import homex.bean.UnitEntity;
import homex.bean.UnitEntityExample;
import homex.bean.UnitEntityExample.Criteria;
import homex.bean.UserEntity;
import homex.common.bean.Common;
import homex.common.bean.Result;
import homex.mapper.CondoTowerEntityMapper;
import homex.mapper.UnitEntityMapper;
import homex.mapper.UserEntityMapper;

/***
 * <p>房间操作实体</p>
 * @author kent
 */
@Component
public class UnitService {
	@Autowired UserEntityMapper  userEntityDao;
	@Autowired UnitEntityMapper unitEntityDao;
	@Autowired CondoTowerEntityMapper condoTowerEntityDao;
	@Autowired QueryMapService queryMapServiceImpl;
	/**
	 * <p>根据账号获取所属房屋</p>
	 * 1,condo获取时,获取属性为condo的所有房屋
	 * 2,tower获取时,获取属性为condo和tower下的所有房屋
	 * 3,租客,屋主,经纪人  都可直接获取 属于自己管辖范围的 房屋信息
	 * @param userId
	 * @return
	 */
	public List<UnitEntity> getUnitList(String userId) {
		List<UnitEntity> uList = new ArrayList<UnitEntity>();
		UserEntity user = userEntityDao.findUserId(userId);
		if(Common.Role.CONDO.equals(user.getUserRole().toString())) //查询当前物业下所有的房子
			uList = unitEntityDao.findUnitByCondoId(user.getUserId());
		else if(Common.Role.RECEPTION.equals(user.getUserRole().toString())){//查询当前物业，当前楼栋下所有的房子
			CondoTowerEntity findTowerId = condoTowerEntityDao.findTowerId(userId);
			uList = unitEntityDao.findUnitCondoAndTower(findTowerId.getCondoId(),findTowerId.getTowerId());
		} else if(Common.Role.OWNER.equals(user.getUserRole().toString()) || Common.Role.TENANT.equals(user.getUserRole().toString()) ) {//查询自己所属的所有房子
			Result findQueryMap = queryMapServiceImpl.findQueryMap(userId);
			if(!findQueryMap.isSuccess())
				return new ArrayList<UnitEntity>();
			List<QueryMapEntity> result =(List) findQueryMap.getResult();
			uList = unitEntityDao.findUnitByUnit(result);//查询账号为个人时候
		}
		return uList;
	}
	/**
	 * <P>获取某个unit的 具体信息</P>
	 * @param unitId
	 * @return
	 */
	public List<UnitEntity> getUnitDetail(String unitId) {
		UnitEntityExample example = new UnitEntityExample();
		Criteria criteria = example.createCriteria();
		criteria.andUnitIdEqualTo(unitId);
		List<UnitEntity> unitList = unitEntityDao.selectByExample(example);
		return unitList;
	}
	/**
	 * <p></p>
	 * @param unit
	 * @return
	 */
	public Result editUnitOwner(UnitEntity unit) {
		int updateByPrimaryKey = unitEntityDao.updateByPrimaryKey(unit);
		return updateByPrimaryKey>0?Result.buildFail():Result.buildSuccess();
	}
}
