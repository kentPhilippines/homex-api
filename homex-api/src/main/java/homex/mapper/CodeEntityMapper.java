package homex.mapper;

import homex.bean.CodeEntity;
import homex.bean.CodeEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeEntityMapper {
    int countByExample(CodeEntityExample example);

    int deleteByExample(CodeEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CodeEntity record);

    int insertSelective(CodeEntity record);

    List<CodeEntity> selectByExampleWithBLOBs(CodeEntityExample example);

    List<CodeEntity> selectByExample(CodeEntityExample example);

    CodeEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CodeEntity record, @Param("example") CodeEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") CodeEntity record, @Param("example") CodeEntityExample example);

    int updateByExample(@Param("record") CodeEntity record, @Param("example") CodeEntityExample example);

    int updateByPrimaryKeySelective(CodeEntity record);

    int updateByPrimaryKeyWithBLOBs(CodeEntity record);

    int updateByPrimaryKey(CodeEntity record);
}