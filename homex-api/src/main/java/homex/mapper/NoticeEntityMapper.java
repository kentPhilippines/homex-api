package homex.mapper;

import homex.bean.NoticeEntity;
import homex.bean.NoticeEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticeEntityMapper {
    int countByExample(NoticeEntityExample example);

    int deleteByExample(NoticeEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NoticeEntity record);

    int insertSelective(NoticeEntity record);

    List<NoticeEntity> selectByExampleWithBLOBs(NoticeEntityExample example);

    List<NoticeEntity> selectByExample(NoticeEntityExample example);

    NoticeEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NoticeEntity record, @Param("example") NoticeEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") NoticeEntity record, @Param("example") NoticeEntityExample example);

    int updateByExample(@Param("record") NoticeEntity record, @Param("example") NoticeEntityExample example);

    int updateByPrimaryKeySelective(NoticeEntity record);

    int updateByPrimaryKeyWithBLOBs(NoticeEntity record);

    int updateByPrimaryKey(NoticeEntity record);
}