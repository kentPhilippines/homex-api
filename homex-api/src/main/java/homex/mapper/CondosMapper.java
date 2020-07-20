package homex.mapper;

import homex.bean.Condos;
import homex.bean.CondosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CondosMapper {
    int countByExample(CondosExample example);

    int deleteByExample(CondosExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Condos record);

    int insertSelective(Condos record);

    List<Condos> selectByExampleWithBLOBs(CondosExample example);

    List<Condos> selectByExample(CondosExample example);

    Condos selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Condos record, @Param("example") CondosExample example);

    int updateByExampleWithBLOBs(@Param("record") Condos record, @Param("example") CondosExample example);

    int updateByExample(@Param("record") Condos record, @Param("example") CondosExample example);

    int updateByPrimaryKeySelective(Condos record);

    int updateByPrimaryKeyWithBLOBs(Condos record);

    int updateByPrimaryKey(Condos record);
}