package homex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import homex.bean.UserEntity;
import homex.common.bean.Result;
import homex.common.framework.BaseController;
import homex.common.framework.BaseService;
import homex.mapper.UserEntityMapper;
import homex.util.HashKit;

@Component
public class LoginService extends BaseService{
	@Autowired UserEntityMapper userDao;
	/**
	 * <p>登录校验</p>
	 * @param username			账户名【初版为邮箱】
	 * @param password			密码
	 * @return
	 */
	public Result check(String username, String password) {
		if(StrUtil.isBlank(username)||StrUtil.isBlank(password)) {
			String msg = "当前传入用户名或者密码为空";
			log.info("【"+msg+"】");
			return Result.buildFailMessage(msg);
		}
		UserEntity user = userDao.findUserByEmail(username);
		if(ObjectUtil.isNull(user)) {
			String msg = "当前用户不存在";
			log.info("【"+msg+"】");
			return Result.buildFailMessage(msg);
		}
		Result encodePassword = HashKit.encodePassword(user.getUserEmail(), password, user.getUserSlat());
		String encodepassword = "";
		if(encodePassword.isSuccess())
			encodepassword = encodePassword.getResult().toString();
		if(StrUtil.isBlank(encodepassword)) {
			String msg = "加密错误，请联系技术人员处理";
			log.info("【"+msg+"】");
			return Result.buildFailMessage(msg);
		}
		if(encodepassword.equals(user.getUserPassword()));	
			return Result.buildSuccessResult("登录成功", user);
	}
	/**
	 * <p>注册用户</p>
	 * @param name				用户名
	 * @param mobile			电话号码
	 * @param email				邮箱
	 * @param password			密码
	 * @param role				角色
	 * @return
	 */
	public Result resiger(String name, String mobile, String email, String password, String role) {
		if( 	StrUtil.isBlank(role)
				||StrUtil.isBlank(name)
				||StrUtil.isBlank(mobile)
				||StrUtil.isBlank(email)
				||StrUtil.isBlank(password)
				)
			return Result.buildFailMessage("必传参数为空");
		UserEntity user = new UserEntity();
		user.setUserId(getUserName());
		user.setUserName(name);
		user.setUserEmail(email);
		String randomNumbers = RandomUtil.randomNumbers(10);
		user.setUserSlat(randomNumbers);
		user.setUserRole(Integer.valueOf(role));
		Result encodePassword = HashKit.encodePassword(email, password, user.getUserSlat());
		if(!encodePassword.isSuccess())
			return Result.buildFailMessage("密钥生成失败");
		password = encodePassword.getResult().toString();
		user.setUserPassword(password);
		int insertSelective = userDao.insertSelective(user);
		if(insertSelective == 1)
			return Result.buildSuccessMessage("注册成功");
		return  Result.buildFailMessage("注册失败");
	}
	
	String getUserName(){
		String username = RandomUtil.randomNumbers(12);
		if( userDao.findUserName(username)>1) 
			getUserName();
		return username;
	}
	
	
}

