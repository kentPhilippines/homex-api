package homex.mapper;

import homex.bean.GatePassEntity;
import homex.bean.GatePassEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
public interface GatePassEntityMapper {
    int countByExample(GatePassEntityExample example);

    int deleteByExample(GatePassEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(GatePassEntity record);

    int insertSelective(GatePassEntity record);

    List<GatePassEntity> selectByExampleWithBLOBs(GatePassEntityExample example);

    List<GatePassEntity> selectByExample(GatePassEntityExample example);

    GatePassEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GatePassEntity record, @Param("example") GatePassEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") GatePassEntity record, @Param("example") GatePassEntityExample example);

    int updateByExample(@Param("record") GatePassEntity record, @Param("example") GatePassEntityExample example);

    int updateByPrimaryKeySelective(GatePassEntity record);

    int updateByPrimaryKeyWithBLOBs(GatePassEntity record);

    int updateByPrimaryKey(GatePassEntity record);
}