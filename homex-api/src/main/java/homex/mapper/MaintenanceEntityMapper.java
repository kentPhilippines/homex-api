package homex.mapper;

import homex.bean.MaintenanceEntity;
import homex.bean.MaintenanceEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MaintenanceEntityMapper {
    int countByExample(MaintenanceEntityExample example);

    int deleteByExample(MaintenanceEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(MaintenanceEntity record);

    int insertSelective(MaintenanceEntity record);

    List<MaintenanceEntity> selectByExampleWithBLOBs(MaintenanceEntityExample example);

    List<MaintenanceEntity> selectByExample(MaintenanceEntityExample example);

    MaintenanceEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MaintenanceEntity record, @Param("example") MaintenanceEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") MaintenanceEntity record, @Param("example") MaintenanceEntityExample example);

    int updateByExample(@Param("record") MaintenanceEntity record, @Param("example") MaintenanceEntityExample example);

    int updateByPrimaryKeySelective(MaintenanceEntity record);

    int updateByPrimaryKeyWithBLOBs(MaintenanceEntity record);

    int updateByPrimaryKey(MaintenanceEntity record);
}