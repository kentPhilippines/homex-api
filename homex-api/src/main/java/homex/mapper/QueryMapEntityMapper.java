package homex.mapper;

import homex.bean.QueryMapEntity;
import homex.bean.QueryMapEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface QueryMapEntityMapper {
    int countByExample(QueryMapEntityExample example);

    int deleteByExample(QueryMapEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QueryMapEntity record);

    int insertSelective(QueryMapEntity record);

    List<QueryMapEntity> selectByExampleWithBLOBs(QueryMapEntityExample example);

    List<QueryMapEntity> selectByExample(QueryMapEntityExample example);

    QueryMapEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QueryMapEntity record, @Param("example") QueryMapEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") QueryMapEntity record, @Param("example") QueryMapEntityExample example);

    int updateByExample(@Param("record") QueryMapEntity record, @Param("example") QueryMapEntityExample example);

    int updateByPrimaryKeySelective(QueryMapEntity record);

    int updateByPrimaryKeyWithBLOBs(QueryMapEntity record);

    int updateByPrimaryKey(QueryMapEntity record);

    
    @Select("select * from home_query_map where user_id = #{userId}")
	List<QueryMapEntity> findMap( @Param("userId") String userId);
}