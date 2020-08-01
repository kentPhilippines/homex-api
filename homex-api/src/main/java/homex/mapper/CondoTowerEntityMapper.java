package homex.mapper;

import homex.bean.CondoTowerEntity;
import homex.bean.CondoTowerEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CondoTowerEntityMapper {
    int countByExample(CondoTowerEntityExample example);

    int deleteByExample(CondoTowerEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CondoTowerEntity record);

    int insertSelective(CondoTowerEntity record);

    List<CondoTowerEntity> selectByExampleWithBLOBs(CondoTowerEntityExample example);

    List<CondoTowerEntity> selectByExample(CondoTowerEntityExample example);

    CondoTowerEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CondoTowerEntity record, @Param("example") CondoTowerEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") CondoTowerEntity record, @Param("example") CondoTowerEntityExample example);

    int updateByExample(@Param("record") CondoTowerEntity record, @Param("example") CondoTowerEntityExample example);

    int updateByPrimaryKeySelective(CondoTowerEntity record);

    int updateByPrimaryKeyWithBLOBs(CondoTowerEntity record);

    int updateByPrimaryKey(CondoTowerEntity record);

    @Select("select count(1) from home_condo_tower where tower_id = #{condotower} ")
	int findCondoTowerId(@Param("condotower") String condotower);

    
    @Update("update home_condo_tower  set condo_name = #{condoName} where condo_id = #{condoId}")
	int updateCondoName(@Param("condoId") String condoId,@Param("condoName")  String condoName);
}