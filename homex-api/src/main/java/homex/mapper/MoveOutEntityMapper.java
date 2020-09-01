package homex.mapper;

import homex.bean.MoveOutEntity;
import homex.bean.MoveOutEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MoveOutEntityMapper {
    int countByExample(MoveOutEntityExample example);

    int deleteByExample(MoveOutEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(MoveOutEntity record);

    int insertSelective(MoveOutEntity record);

    List<MoveOutEntity> selectByExample(MoveOutEntityExample example);

    MoveOutEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MoveOutEntity record, @Param("example") MoveOutEntityExample example);

    int updateByExample(@Param("record") MoveOutEntity record, @Param("example") MoveOutEntityExample example);

    int updateByPrimaryKeySelective(MoveOutEntity record);

    int updateByPrimaryKey(MoveOutEntity record);
}