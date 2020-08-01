package homex.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.hutool.core.util.StrUtil;
import homex.common.bean.Result;
import homex.common.framework.BaseController;
import homex.service.CondoService;

/**
 * <p>关于condo的操作</p>
 * @author kent
 *
 */
@RestController
@RequestMapping("/condo")
public class CondoApi extends BaseController{
	
	@Autowired CondoService condoServiceImpl;
	/**
	 * <p>添加一个condo账号</p>	
	 * @param email					邮箱
	 * @param password				密码
	 * @param condoName				condoName
	 * @param phone					电话号码
	 * @param tower					tower【栋】
	 * @return
	 */
	
	@GetMapping("/getCondoList")
	public Result getCondoList(String userID, String condoName   ) {
		startPage();
		Result findCondo = condoServiceImpl.findCondo(userID,condoName);
		return findCondo;
	}
	
	
	@PostMapping("/add")
	public Result login(String email, String password , String condoName ,String phone , String tower) {
		log.info("【进入添加condo方法】");
		if(StrUtil.isBlank(tower))
			return Result.buildFailMessage("tower数据为空");
		Result isConfo = condoServiceImpl.addCondo(email,password,condoName,phone,tower);
		log.info("【进入添加condo方法】");
		return isConfo;
	}
		
}
