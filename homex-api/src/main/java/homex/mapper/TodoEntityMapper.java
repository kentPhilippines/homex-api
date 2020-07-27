package homex.mapper;

import homex.bean.TodoEntity;
import homex.bean.TodoEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}