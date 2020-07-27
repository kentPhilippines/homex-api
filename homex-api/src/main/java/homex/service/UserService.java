package homex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import homex.bean.UserEntity;
import homex.bean.UserEntityExample;
import homex.bean.UserEntityExample.Criteria;
import homex.common.bean.Result;
import homex.common.framework.BaseService;
import homex.mapper.UserEntityMapper;
import homex.util.HashKit;

@Component
public class UserService extends BaseService{
	@Autowired UserEntityMapper userDao;

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
		user.setUserAvtar(userAvtar);
		UserEntityExample example = new UserEntityExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userID);
		int i = userDao.updateByExampleSelective(user, example);
		if(i==1)
			return Result.buildSuccessMessage("修改成功");
		return Result.buildFailMessage("修改失败");
	}
	
	
}
