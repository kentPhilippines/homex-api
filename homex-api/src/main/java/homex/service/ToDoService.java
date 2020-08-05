package homex.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import homex.bean.NoticeEntity;
import homex.bean.QueryMapEntity;
import homex.bean.TodoEntity;
import homex.bean.UserEntity;
import homex.common.bean.Common;
import homex.common.bean.Result;
import homex.common.framework.BaseService;
import homex.common.util.IdUtil;
import homex.mapper.TodoEntityMapper;
import homex.mapper.UserEntityMapper;

@Component
public class ToDoService  extends BaseService{
	@Autowired TodoEntityMapper todoEntityDao; 
	@Autowired UserEntityMapper userDao;
	@Autowired QueryMapService queryMapServiceImpl;
	/**
	 * <p>新增一个todo</p>
	 * 1,当前condo可以新增自己condo范围内的所有用户,并可以选取权限
	 * 2,当前tower管理员可以新增,并可以选择不同unit的用户可见
	 * @return
	 */
	/**
	 * 参数情况
	 * @param toTower			接收方的tower
	 * @param toUnit			接收方的unit【可选,数据用‘ - ’ 隔开】
	 * @param subject			标题
	 * @param content			内容
	 * @param userID			作者
	 * @return
	 */
	public Result addTodo(String toTower,String toUnit ,String  subject ,String content , String userID ) {
		if(StrUtil.isBlank(userID)) 
			return Result.buildFailMessage("author is null");
		if(StrUtil.isBlank(subject)) 
			return Result.buildFailMessage("subject is null");
		if(StrUtil.isBlank(content)) 
			return Result.buildFailMessage("content is null");
		log.info("【进入添加todo方法：添加主题："+subject+"，作者："+userID+"，condo："+content+"】");
		TodoEntity  todo = new TodoEntity();
		todo.setAuthorId(userID);
		todo.setCondoId(userID);
		todo.setToTower(toTower);
		todo.setSubject(subject);
		todo.setContent(content);
		todo.setTodoId(IdUtil.getTodo());
		int insertSelective = todoEntityDao.insertSelective(todo);
		if(insertSelective> 0)
			return Result.buildSuccess();
		return Result.buildFail();
	}
	
	
	/**
	 * <p>根据自己的账号查询自己的notice</p>
	 * @param userId
	 * @return
	 */
	public Result  getTodo(String userId) {
		if(StrUtil.isBlank(userId)) 
			return Result.buildFailMessage("userId is null");
		UserEntity user = userDao.findUserId(userId);
		//首先任何账号都可以看到自己为作者的notice
		List <TodoEntity> todoList  = todoEntityDao.findTodoByAuthor(userId);
		
		
		/**
		 * #########################
		 * 1,如果是condo账号可以看到所有的数据
		 * 2,如果是tower账号可以看到发布有自己的notice 
		 * 3,如果是unit账号,可以看到有自己权限的 数据
		 */
		List <TodoEntity> todoListCondo = new ArrayList<TodoEntity>();
		List <TodoEntity> todoListTower = new ArrayList<TodoEntity>();
		List <TodoEntity> todoListUnit = new ArrayList<TodoEntity>();
		if(user.getUserRole().toString().equals(Common.Role.CONDO))
			todoListCondo  =	todoEntityDao.findTodoByCondo(user.getUserId());
		Result queryMap = queryMapServiceImpl.findQueryMap(user.getUserId());
		QueryMapEntity map = new QueryMapEntity();
		if(queryMap.isSuccess()) {
			List<QueryMapEntity> result =(List) queryMap.getResult();
			map = result.get(0);
		}
		if(user.getUserRole().toString().equals(Common.Role.RECEPTION))
			todoListTower = todoEntityDao.findTodoByTower(user.getUserId(),map.getCondo(),map.getTower());
		if(user.getUserRole().toString().equals(Common.Role.OWNER) || user.getUserRole().toString().equals(Common.Role.TENANT)) 
			todoListUnit = todoEntityDao.findTodoByUnit(map.getCondo(),map.getTower());
		if(CollUtil.isNotEmpty(todoListCondo)) {
			return Result.buildSuccessResult(CollUtil.addAll(todoListCondo, CollUtil.isEmpty(todoListTower)?todoListUnit:todoListTower));
		}else {
			return Result.buildSuccessResult(CollUtil.isEmpty(todoListTower)?todoListUnit:todoListTower);
		}
	}
	
	/**
	 * <p>删除一个todo</p>
	 * @param noticeID			notice系统编号
	 * @param userID			用户编号
	 * @return
	 */
	public Result deleteTodo(String noticeID , String userID) {
		log.info("【进入删除todo方法：删除todo系统唯一编号："+noticeID+"，操作人："+userID+"】");
		//这里要记录日志
		int i = todoEntityDao.deleteTodoId(noticeID);
		if(i>0)
			return Result.buildSuccessResult();
		return Result.buildFail();
	}

	
	
	
}
