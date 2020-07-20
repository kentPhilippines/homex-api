package homex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import homex.bean.User;
import homex.common.Bean.Result;
import homex.common.framework.BaseController;
import homex.common.framework.BaseService;
import homex.mapper.UserMapper;
import homex.util.HashKit;

@Component
public class LoginService extends BaseService{
	@Autowired UserMapper userDao;
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
		User user = userDao.findUserByEmail(username);
		if(ObjectUtil.isNull(user)) {
			String msg = "当前用户不存在";
			log.info("【"+msg+"】");
			return Result.buildFailMessage(msg);
		}
		Result encodePassword = HashKit.encodePassword(user.getEmail(), password, user.getSalt());
		String encodepassword = "";
		if(encodePassword.isSuccess())
			encodepassword = encodePassword.getResult().toString();
		if(StrUtil.isBlank(encodepassword)) {
			String msg = "加密错误，请联系技术人员处理";
			log.info("【"+msg+"】");
			return Result.buildFailMessage(msg);
		}
		if(encodepassword.equals(user.getPassword()));	
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
		if(
				StrUtil.isBlank(role)
				||StrUtil.isBlank(name)
				||StrUtil.isBlank(mobile)
				||StrUtil.isBlank(email)
				||StrUtil.isBlank(password)
				)
			return Result.buildFailMessage("必传参数为空");
		User user = new User();
		user.setNick_name(name);
		user.setEmail(email);
		String randomNumbers = RandomUtil.randomNumbers(10);
		user.setSalt(randomNumbers);
		user.setRole(role);
		Result encodePassword = HashKit.encodePassword(email, password, user.getSalt());
		if(!encodePassword.isSuccess())
			return Result.buildFailMessage("密钥生成失败");
		password = encodePassword.getResult().toString();
		user.setPassword(password);
		user.setUser_name(getUserName());
		int insertSelective = userDao.insertSelective(user);
		if(insertSelective == 1)
			return Result.buildSuccessMessage("注册成功");
		return  Result.buildFailMessage("注册失败");
	}
	
	String getUserName(){
		String username = RandomUtil.randomNumbers(12);
		if( userDao.findUserName(username)>1) {
			return username;
		} else {
			getUserName();
		}
		return username;
	}
	
	
}

