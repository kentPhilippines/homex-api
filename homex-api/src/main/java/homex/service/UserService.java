package homex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import homex.bean.User;
import homex.common.Bean.Result;
import homex.common.framework.BaseService;
import homex.mapper.UserMapper;
import homex.util.HashKit;

@Component
public class UserService extends BaseService{
	@Autowired UserMapper userDao;

	/**
	 *	<p>用户修改密码</p>
	 * @param name					用户名
	 * @param password				密码
	 * @return
	 */
	public Result reset(String email, String password) {
		
		User user = userDao.findUserByEmail(email);
		Result encodePassword = HashKit.encodePassword(email, password, user.getSalt());
		if(!encodePassword.isSuccess())
			return Result.buildFailMessage("密钥生成失败");
		Integer a = userDao.updatePassword(email,encodePassword.getResult().toString());
		if(a == 1)
			return Result.buildSuccessMessage("密码修改成功");
		return Result.buildFailMessage("密码修改失败");
	}
	
	
}
