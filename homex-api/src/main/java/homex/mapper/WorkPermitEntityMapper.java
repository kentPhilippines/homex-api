package homex.mapper;

import homex.bean.WorkPermitEntity;
import homex.bean.WorkPermitEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WorkPermitEntityMapper {
    int countByExample(WorkPermitEntityExample example);

    int deleteByExample(WorkPermitEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(WorkPermitEntity record);

    int insertSelective(WorkPermitEntity record);

    List<WorkPermitEntity> selectByExampleWithBLOBs(WorkPermitEntityExample example);

    List<WorkPermitEntity> selectByExample(WorkPermitEntityExample example);

    WorkPermitEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WorkPermitEntity record, @Param("example") WorkPermitEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") WorkPermitEntity record, @Param("example") WorkPermitEntityExample example);

    int updateByExample(@Param("record") WorkPermitEntity record, @Param("example") WorkPermitEntityExample example);

    int updateByPrimaryKeySelective(WorkPermitEntity record);

    int updateByPrimaryKeyWithBLOBs(WorkPermitEntity record);

    int updateByPrimaryKey(WorkPermitEntity record);
}