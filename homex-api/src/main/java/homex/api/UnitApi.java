package homex.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import homex.common.bean.Result;
import homex.common.framework.BaseController;

@RestController
@RequestMapping("/unit")
public class UnitApi extends BaseController{
	
	/**
	 * <p>获取具体房子的接口</p>
	 * 1，根据用户不同获取 不同的房屋信息
	 * @return
	 */
	@PostMapping("/getCondoAbout")
	public Result getCondoAbout(  ) {
		
		
		
		
		
		
		return null;
	}
	
	
	
	

}
