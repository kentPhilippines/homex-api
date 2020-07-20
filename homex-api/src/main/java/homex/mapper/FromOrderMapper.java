package homex.mapper;

import homex.bean.FromOrder;
import homex.bean.FromOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FromOrderMapper {
    int countByExample(FromOrderExample example);
    int deleteByExample(FromOrderExample example);
    int deleteByPrimaryKey(Long id);
    int insert(FromOrder record);
    int insertSelective(FromOrder record);
    List<FromOrder> selectByExample(FromOrderExample example);
    FromOrder selectByPrimaryKey(Long id);
    int updateByExampleSelective(@Param("record") FromOrder record, @Param("example") FromOrderExample example);
    int updateByExample(@Param("record") FromOrder record, @Param("example") FromOrderExample example);
    int updateByPrimaryKeySelective(FromOrder record);
    int updateByPrimaryKey(FromOrder record);
}