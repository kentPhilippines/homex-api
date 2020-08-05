package homex.api;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import homex.bean.UserEntity;
import homex.common.bean.Result;
import homex.common.framework.BaseController;
import homex.common.page.TableDataInfo;
import homex.service.UserService;

@RestController
@RequestMapping("/reception")
public class ReceptionApi extends BaseController{
	@Autowired UserService userServiceImpl; 
	@GetMapping("/getReceptionList")
	public TableDataInfo getReceptionList(String userID) {
		startPage();
		List<UserEntity> userList =  userServiceImpl.findUserByCraeteBy(userID);
		return getDataTable(userList);
	}
	///dev-api/deleteReception
	
	@PostMapping("/deleteReception")
	public Result deleteReception(String receptionID) {
		Result result = userServiceImpl.deleteUser(receptionID);
		return result;
	}
	@PostMapping("/editReception")
	public Result editReception(String name ,String mobile , String email ,String  tower,String id) {
		Result editAccount = userServiceImpl.editAccount(id, name, "", email, mobile, "");
		if(editAccount.isSuccess()) {
			Result result = userServiceImpl.editTower(id,tower);
		}
		return null;
	}
}
