package homex.mapper;

import homex.bean.MoveInEntity;
import homex.bean.MoveInEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MoveInEntityMapper {
    int countByExample(MoveInEntityExample example);

    int deleteByExample(MoveInEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(MoveInEntity record);

    int insertSelective(MoveInEntity record);

    List<MoveInEntity> selectByExample(MoveInEntityExample example);

    MoveInEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MoveInEntity record, @Param("example") MoveInEntityExample example);

    int updateByExample(@Param("record") MoveInEntity record, @Param("example") MoveInEntityExample example);

    int updateByPrimaryKeySelective(MoveInEntity record);

    int updateByPrimaryKey(MoveInEntity record);
}