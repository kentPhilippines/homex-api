package homex.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.hutool.core.util.RandomUtil;
import homex.common.bean.Result;
import homex.common.framework.BaseController;
import homex.service.LoginService;
import homex.service.UserService;

@RestController
@RequestMapping("/dev-api")
public class UserApi extends BaseController{
	@Autowired LoginService LoginServiceImpl;
	@Autowired UserService userServiceImpl; 
	@PostMapping("/login")
	public Result login(String email, String password) {
		log.info("【进入登入方法】");
		Result check = LoginServiceImpl.check(email, password);
		return check;
	}
	/**
		name			BODY		String				用户名
		mobile			BODY		String				手机号
		email			BODY		String				邮箱		
		code			BODY		String				code			
		password		BODY		String				密码
		role			BODY		Number				1表示公司后台，4表示物业，5表示前台，6表示房东，7表示租客
	 * @return
	 */
	@PostMapping("/resiger")
	public Result resiger(String  name  ,String mobile ,String email ,String code ,String password ,String role ,String tower,
			String userID) {
		log.info("【进入用户注册方法】");
		Result check = LoginServiceImpl.resiger( 
				name  
				, mobile 
				, email 
				, password 
				, role ,tower,userID);
		return check;
	}
	/**
	 * <p>密码重置</p>
	 */
	@PutMapping("/reset")
	public Result reset(String  email  ,String code ,String password ) {
		log.info("【进入用户密码重置方法】");
		Result reset = userServiceImpl.reset(email,password);
		return Result.buildFailMessage("登录失败");
	}
	
	/**
	 * <p>修改用户数据</p>
	 * @param userID				用户唯一标识			
	 * @param userName				用户名
	 * @param userAvtar				用户头像，base64文件
	 * @param userEmail				用户邮箱
	 * @param userPhone				用户手机号
	 * @param password				密码
	 * @return
	 */
	@PutMapping("/editAccount")
	public Result editAccount(
			String userID 
			, String userName 
			, String userAvtar 
			, String userEmail 
			, String userPhone 
			, String password 
			) {
		Result user = userServiceImpl.editAccount(userID,userName,userAvtar,userEmail,userPhone,password);
		return user;
	}
	
	@PostMapping("/getCode")
	public Result getCode() {
		return Result.buildSuccessResult(RandomUtil.randomNumbers(6));
	}
	
}
