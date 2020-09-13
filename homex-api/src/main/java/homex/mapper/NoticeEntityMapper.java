package homex.mapper;

import homex.bean.NoticeEntity;
import homex.bean.NoticeEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
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

    
    
     @Select("select * from home_notice where author_id = #{userId} ")
	 List<NoticeEntity> findNoticeByAuthor(@Param("userId") String userId);

	 /**
	  * 通过condo查询notice
	  * @param userId
	  * @return
	  */
	 @Select("select * from home_notice where condo_id = #{userId} ")
	List<NoticeEntity> findNoticeByCondo(@Param("userId")  String userId);

	 /**
	  * <p>前台人员查询notice,查询到自己发布的和属于自己的</p>
	  * @param userId
	  * @param condo
	  * @param tower
	  * @return
	  */
	 @Select(""
	 		+ "select * from home_notice where condo_id = #{condo} and  to_tower = #{tower} "
	 		+ "union all"
	 		+ "select * from home_notice where author_id = #{userId} "
	 		)
	List<NoticeEntity> findNoticeByTower(@Param("userId") String userId,@Param("condo") String condo,@Param("tower") String tower);

	 /**
	  * <p>unit角色查询</p>
	  * @param condo			condoId
	  * @param tower			tower
	  * @return
	  */
	 @Select("select * from home_notice where condo_id = #{condo} and  to_tower = #{tower}")
	List<NoticeEntity> findNoticeByUnit(@Param("condo")  String condo,@Param("tower")  String tower);

	@Delete("delete from home_notice  where notice_id = #{noticeId}")
	int deleteNoticeId(@Param("noticeId") String noticeId);
}