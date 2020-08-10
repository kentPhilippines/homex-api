package homex.mapper;

import homex.bean.UnitEntity;
import homex.bean.UnitEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UnitEntityMapper {
    int countByExample(UnitEntityExample example);

    int deleteByExample(UnitEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UnitEntity record);

    int insertSelective(UnitEntity record);

    List<UnitEntity> selectByExample(UnitEntityExample example);

    UnitEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UnitEntity record, @Param("example") UnitEntityExample example);

    int updateByExample(@Param("record") UnitEntity record, @Param("example") UnitEntityExample example);

    int updateByPrimaryKeySelective(UnitEntity record);

    int updateByPrimaryKey(UnitEntity record);
}