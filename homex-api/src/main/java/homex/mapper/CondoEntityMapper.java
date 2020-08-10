package homex.mapper;

import homex.bean.CondoEntity;
import homex.bean.CondoEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
@Mapper
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

    
    /**
     * <p>根据公寓名查看是否存在该公寓</p>
     * @param condo
     * @return
     */
    @Select("select count(1) from home_condo where condo_id = #{condo}")
	int findCondoId(@Param("condo")  String condo);
    @Select("select count(1) from home_condo where condo_name = #{condoName}")
    int findCondoName(@Param("condoName")  String condoName);

    @Update("update home_condo set condo_name = #{condoName} where  condo_id  = #{condoId}")
	int updateCondoName(@Param("condoId") String condoId,@Param("condoName") String condoName);
}