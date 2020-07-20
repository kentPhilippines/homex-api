package homex.mapper;

import homex.bean.Rooms;
import homex.bean.RoomsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomsMapper {
    int countByExample(RoomsExample example);
    int deleteByExample(RoomsExample example);
    int deleteByPrimaryKey(Long id);
    int insertSelective(Rooms record);
    List<Rooms> selectByExample(RoomsExample example);
    Rooms selectByPrimaryKey(Long id);
    int updateByExampleSelective(@Param("record") Rooms record, @Param("example") RoomsExample example);
    int updateByExample(@Param("record") Rooms record, @Param("example") RoomsExample example);
    int updateByPrimaryKeySelective(Rooms record);
    int updateByPrimaryKey(Rooms record);
}