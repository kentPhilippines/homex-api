package homex.mapper;

import homex.bean.AboutEntity;
import homex.bean.AboutEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface AboutEntityMapper {
    int countByExample(AboutEntityExample example);

    int deleteByExample(AboutEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AboutEntity record);

    int insertSelective(AboutEntity record);

    List<AboutEntity> selectByExampleWithBLOBs(AboutEntityExample example);

    List<AboutEntity> selectByExample(AboutEntityExample example);

    AboutEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AboutEntity record, @Param("example") AboutEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") AboutEntity record, @Param("example") AboutEntityExample example);

    int updateByExample(@Param("record") AboutEntity record, @Param("example") AboutEntityExample example);

    int updateByPrimaryKeySelective(AboutEntity record);

    int updateByPrimaryKeyWithBLOBs(AboutEntity record);

    int updateByPrimaryKey(AboutEntity record);
    @Select("select * from home_about where user_id = #{userId}")
	AboutEntity findMeAbout(@Param("userId")  String userId);
}