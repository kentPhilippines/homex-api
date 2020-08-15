package homex.mapper;

import homex.bean.QueryMapEntity;
import homex.bean.UnitEntity;
import homex.bean.UnitEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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

    /**
     * <p>查询物业下的所有房子</p>
     * @param userId
     * @return
     */
    @Select("select * from home_unit where condo_id = #{userId}")
	List<UnitEntity> findUnitByCondoId(@Param("userId")  String userId);
    /**
     * <p>查询物业下的楼栋的所有房子</p>
     * @param userId
     * @return
     */
    @Select("select * from home_unit where condo_id = #{condoId}  and tower_id = #{towerId}")
	List<UnitEntity> findUnitCondoAndTower(@Param("condoId") String condoId, @Param("towerId") String towerId);

    
    
    /**
     * <p>查询个人的所有房子</p>
     * @param condoId
     * @param towerId
     * @param unitId
     * @return
     */
  //  @Select("select * from home_unit where condo_id = #{condoId}  and tower_id = #{towerId} and ")
	//List<UnitEntity> findUnitByUnit(@Param("condoId") String condoId,@Param("towerId") String towerId, @Param("unitId") String unitId);

    
    
   // @Select("select * from home_unit where condo_id = #{condoId}  and tower_id = #{towerId} and ")
	List<UnitEntity> findUnitByUnit(@Param("mapList") List<QueryMapEntity> mapList);
}