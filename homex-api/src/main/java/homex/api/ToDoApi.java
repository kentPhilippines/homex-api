package homex.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import homex.common.bean.Result;
import homex.service.ToDoService;

@RestController
@RequestMapping("/todo")
public class ToDoApi {
	@Autowired ToDoService toDoServiceImpl;
	@PostMapping("/addTodo")
	public Result addTodo(String toTower,String toUnit ,String  subject ,String content , String userID ) {
		Result addNotice = toDoServiceImpl.addTodo(toTower, toUnit, subject, content, userID);
		return addNotice;
	}
	
	@GetMapping("/getTodo")
	public Result  getTodo(String userID) {
		return toDoServiceImpl.getTodo(userID);
	}	
	
	@PostMapping("/deleteTodo")
	public Result deleteTodo(String noticeID , String userID) {
		return toDoServiceImpl.deleteTodo(noticeID, userID);
	}
}
