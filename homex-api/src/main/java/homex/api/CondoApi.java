package homex.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import cn.hutool.core.util.StrUtil;
import homex.bean.AboutEntity;
import homex.bean.CondoTowerEntity;
import homex.bean.UserEntity;
import homex.common.bean.Result;
import homex.common.framework.BaseController;
import homex.common.page.TableDataInfo;
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
	public TableDataInfo getCondoList(String userID, String condoName   ) {
		startPage();
		List<UserEntity> findCondo = condoServiceImpl.findCondo(userID,condoName);
		return getDataTable(findCondo);
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
	
	@PostMapping("/importCondoFile")
	public Result importCondoFile(@RequestParam  MultipartFile file) {
		return condoServiceImpl.saveExcal(file);
	}
	
	@PostMapping("/getTowerList")
	public TableDataInfo getTowerList(String userId) {
		startPage(); 
		List<CondoTowerEntity> condoList = condoServiceImpl.getTowerList(userId);
		return getDataTable(condoList);
	}
	
	/**
	 * <p>获取condo的About信息</p>
	 * @param userId
	 * @return
	 */
	@PostMapping("/getCondoAbout")
	public Result getCondoAbout(String userId ) {
		AboutEntity about = condoServiceImpl.findCondoAbout(userId);
		return Result.buildSuccessResult(about);
	}
	@PostMapping("/editCondoAbout")
	public Result editCondoAbout(AboutEntity about ) {
		Result result =  condoServiceImpl.editCondoAbout(about);
		return result;
	} 
	 
		
}
