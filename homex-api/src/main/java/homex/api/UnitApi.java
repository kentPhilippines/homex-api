package homex.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import homex.bean.UnitEntity;
import homex.bean.UserEntity;
import homex.common.bean.Result;
import homex.common.framework.BaseController;
import homex.common.page.TableDataInfo;
import homex.service.UnitService;

@RestController
@RequestMapping("/unit")
public class UnitApi extends BaseController{
	@Autowired UnitService unitServiceImpl;
	/**
	 * <p>获取具体房子的接口</p>
	 * 1，根据用户不同获取 不同的房屋信息
	 * @return
	 */
	@PostMapping("/getUnitList") 
	public TableDataInfo getUnitList(String userId  ) {
		startPage();
		List<UnitEntity> unitList   = unitServiceImpl.getUnitList(userId);
		return getDataTable(unitList);
	}
	
	/**
	 * <p>获取unit具体信息</p>
	 * @param unitId
	 * @return
	 */
	@PostMapping("/getUnitDetail") 
	public Result getUnitDetail(String unitId  ) {
		List<UnitEntity> unitList   = unitServiceImpl.getUnitDetail(unitId);
		return Result.buildSuccessResult(unitList);
	}
	@PostMapping("/editUnitOwner")
	public Result editUnitOwner(UnitEntity unit) {
		Result result = unitServiceImpl.editUnitOwner(unit);
		return result;
	}


	@GetMapping("/getUnitTenantList")
	public Result getTenantList(String condo, String tower, String unit){
		List<String> list = unitServiceImpl.getTenantListByUnit(condo, tower, unit);
		return Result.buildSuccessResult(list);
	}
	
	

}
