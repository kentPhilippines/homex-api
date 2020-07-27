package homex.mapper;

import homex.bean.CondoEntity;
import homex.bean.CondoEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CondoEntityMapper {
    int countByExample(CondoEntityExample example);

    int deleteByExample(CondoEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CondoEntity record);

    int insertSelective(CondoEntity record);

    List<CondoEntity> selectByExampleWithBLOBs(CondoEntityExample example);

    List<CondoEntity> selectByExample(CondoEntityExample example);

    CondoEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CondoEntity record, @Param("example") CondoEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") CondoEntity record, @Param("example") CondoEntityExample example);

    int updateByExample(@Param("record") CondoEntity record, @Param("example") CondoEntityExample example);

    int updateByPrimaryKeySelective(CondoEntity record);

    int updateByPrimaryKeyWithBLOBs(CondoEntity record);

    int updateByPrimaryKey(CondoEntity record);
}