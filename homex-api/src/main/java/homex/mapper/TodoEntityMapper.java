package homex.mapper;

import homex.bean.TodoEntity;
import homex.bean.TodoEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TodoEntityMapper {
    int countByExample(TodoEntityExample example);

    int deleteByExample(TodoEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TodoEntity record);

    int insertSelective(TodoEntity record);

    List<TodoEntity> selectByExampleWithBLOBs(TodoEntityExample example);

    List<TodoEntity> selectByExample(TodoEntityExample example);

    TodoEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TodoEntity record, @Param("example") TodoEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") TodoEntity record, @Param("example") TodoEntityExample example);

    int updateByExample(@Param("record") TodoEntity record, @Param("example") TodoEntityExample example);

    int updateByPrimaryKeySelective(TodoEntity record);

    int updateByPrimaryKeyWithBLOBs(TodoEntity record);

    int updateByPrimaryKey(TodoEntity record);

    @Select("select * from home_todo where author_id = #{userId}")
	List<TodoEntity> findTodoByAuthor(@Param("userId") String userId);

    @Select("select * from home_todo where condo_id = #{userId}")
	List<TodoEntity> findTodoByCondo(@Param("userId") String userId);
    /**
	  * <p>前台人员查询todo,查询到自己发布的和属于自己的</p>
	  * @param userId
	  * @param condo
	  * @param tower
	  * @return
	  */
	 @Select(""
	 		+ "select * from home_todo where condo_id = #{condo} and  to_tower = #{tower} "
	 		+ "union all"
	 		+ "select * from home_todo where author_id = #{userId} "
	 		)
	List<TodoEntity> findTodoByTower(@Param("userId")  String userId,@Param("condo")   String condo,@Param("tower")String tower);
	 @Select("select * from home_todo where condo_id = #{condo} and  to_tower = #{tower} ")
	List<TodoEntity> findTodoByUnit(@Param("condo")String condo,@Param("tower") String tower);
	@Delete("delete from home_todo  where todo_id = #{todoId}")
	int deleteTodoId(@Param("todoId") String todoId);
}