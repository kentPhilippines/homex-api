package homex.mapper;

import homex.bean.RoomByUser;
import homex.bean.RoomByUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomByUserMapper {
    int countByExample(RoomByUserExample example);

    int deleteByExample(RoomByUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RoomByUser record);

    int insertSelective(RoomByUser record);

    List<RoomByUser> selectByExample(RoomByUserExample example);

    RoomByUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RoomByUser record, @Param("example") RoomByUserExample example);

    int updateByExample(@Param("record") RoomByUser record, @Param("example") RoomByUserExample example);

    int updateByPrimaryKeySelective(RoomByUser record);

    int updateByPrimaryKey(RoomByUser record);
}