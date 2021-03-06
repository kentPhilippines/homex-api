package homex.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import homex.bean.UserEntity;
import homex.bean.UserEntityExample;
import homex.bean.UserEntityExample.Criteria;
import homex.common.bean.Common;
import homex.common.bean.Result;
import homex.common.framework.BaseService;
import homex.mapper.QueryMapEntityMapper;
import homex.mapper.UserEntityMapper;
import homex.util.GenerateOrderNo;
import homex.util.HashKit;
import homex.util.ImageBase64Utils;

@Component
public class UserService extends BaseService{
	@Autowired UserEntityMapper userDao;
	@Autowired QueryMapEntityMapper queryMapEntityDao;

	/**
	 *	<p>用户修改密码</p>
	 * @param name					用户名
	 * @param password				密码
	 * @return
	 */
	public Result reset(String email, String password) {
		
		UserEntity user = userDao.findUserByEmail(email);
		Result encodePassword = HashKit.encodePassword(email, password, user.getUserSlat());
		if(!encodePassword.isSuccess())
			return Result.buildFailMessage("密钥生成失败");
		Integer a = userDao.updatePassword(email,encodePassword.getResult().toString());
		if(a == 1)
			return Result.buildSuccessMessage("密码修改成功");
		return Result.buildFailMessage("密码修改失败");
	}
	/**
	 * <p>修改用户数据</p>
	 * @param userID
	 * @param userName				
	 * @param userAvtar			用户头像
	 * @param userEmail
	 * @param userPhone
	 * @param password
	 * @return
	 */
	public Result editAccount(String userID, String userName, String userAvtar, String userEmail, String userPhone,
			String password) {
		UserEntity user = new UserEntity();
		user.setUserName(userName);
		user.setUserEmail(userEmail);
		user.setUserPhone(userPhone);
		String no = Common.Path.IMG_PATH+GenerateOrderNo.imgNo()+".kent";
		try {
			ImageBase64Utils.Base64ToImage(userAvtar,no);
		} catch (IOException e) {
			e.printStackTrace();
		}
		user.setUserAvtar(no);
		UserEntityExample example = new UserEntityExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userID);
		int i = userDao.updateByExampleSelective(user, example);
		if(i==1)
			return Result.buildSuccessMessage("edit is success");
		return Result.buildFailMessage("edit is error");
	}
	public List<UserEntity> findUserByCraeteBy(String userID) {
		return userDao.findUserByCraeteBy(userID);
	}
	public Result deleteUser(String receptionID) {
		return userDao.deleteUser(receptionID);
	}
	/**
	 * 修改tower查询地图数据
	 * @param id
	 * @param tower
	 * @return
	 */
	public Result editTower(String id, String tower) {
		int  i  = queryMapEntityDao.editTower(id,tower);
		if(i> 0)
			return Result.buildSuccess();
		return Result.buildFail();
	}
}
