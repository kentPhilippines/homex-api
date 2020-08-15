package homex.mapper;

import homex.bean.UserEntity;
import homex.bean.UserEntityExample;
import homex.common.bean.Result;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
@Mapper
public interface UserEntityMapper {
    int countByExample(UserEntityExample example);

    int deleteByExample(UserEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record); 

    List<UserEntity> selectByExampleWithBLOBs(UserEntityExample example);

    List<UserEntity> selectByExample(UserEntityExample example);

    UserEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserEntity record, @Param("example") UserEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") UserEntity record, @Param("example") UserEntityExample example);

    int updateByExample(@Param("record") UserEntity record, @Param("example") UserEntityExample example);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKeyWithBLOBs(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

    
    @Select("select id as id ,"
    		+ "user_id as userId , "
    		+ "user_name as userName "
    		+ ",user_email as  userEmail "
    		+ ",user_phone as  userPhone "
    		+ ",user_role as userRole "
    		+ ",user_slat as userSlat "
    		+ ",user_password as userPassword "
    		+ ",create_by as createBy "
    		+ "  from home_user where user_email = #{email}")
	UserEntity findUserByEmail(@Param("email") String email);

    @Select("select count(1) from home_user where user_id = #{username}")
	int findUserName(@Param("username") String username);

    @Update("updata  home_user set  user_password = #{password} where user_email  = #{email}")
	Integer updatePassword(@Param("email") String email, @Param("password") String password);

    @Select("select "
    		+ "user_id as userId , " + 
    		" user_name as userName " + 
    		"  ,user_email as  userEmail " + 
    		" ,user_phone as  userPhone " + 
    		" ,user_role as userRole " + 
    		" ,user_slat as userSlat" + 
    		" ,user_password as userPassword" + 
    		" ,create_by as createBy  from home_user where user_id = #{userId}")
	UserEntity findUserId( @Param("userId")String  userId);

    @Select("select "
    		+ "user_id as userId , " + 
    		" user_name as userName " + 
    		"  ,user_email as  userEmail " + 
    		" ,user_phone as  userPhone " + 
    		" ,user_role as userRole " + 
    		" ,user_slat as userSlat" + 
    		" ,user_password as userPassword"  
    		+ " from home_user where create_by = #{userID}")
	List<UserEntity> findUserByCraeteBy(@Param("userID") String userID);

    @Delete("delete from home_user where user_id = #{userId}")
	Result deleteUser(@Param("userId")  String receptionID);
}