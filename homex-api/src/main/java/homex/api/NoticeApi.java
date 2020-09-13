package homex.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import homex.common.bean.Result;
import homex.service.NoticeService;

@RestController
@RequestMapping("/dev-api/notice")
public class NoticeApi {
	@Autowired NoticeService noticeServiceImpl;
	/**
	 * time 		String 				原型界面上的date，格式为MM/DD/YYYY HH:mm
	   toTower      String 				接收方的tower
	   toUnit 		String 				接收方的unit
	   subject 		String 				notice的subject
	   content 		String 				notice的content
	   userID 		String 				notice 作者
	 * @return
	 */
	@PostMapping("/addNotice")
	public Result addNotice(String toTower,String toUnit ,String  subject ,String content , String userID ) {
		Result addNotice = noticeServiceImpl.addNotice(toTower, toUnit, subject, content, userID);
		return addNotice;
	}
	
	@GetMapping("/getNotice")
	public Result  getNotice(String userID) {
		return noticeServiceImpl.getNotice(userID);
	}	
	
	@PostMapping("/deleteNotice")
	public Result deleteNotice(String noticeID , String userID) {
		return noticeServiceImpl.deleteNotice(noticeID, userID);
	}
}
