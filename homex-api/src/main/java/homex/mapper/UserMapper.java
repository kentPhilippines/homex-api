package homex.mapper;

import homex.bean.User;
import homex.bean.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
    int countByExample(UserExample example);
    int deleteByExample(UserExample example);
    int deleteByPrimaryKey(Long user_id);
    int insertSelective(User record);
    List<User> selectByExample(UserExample example);
    User selectByPrimaryKey(Long user_id);
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);
    int updateByPrimaryKeySelective(User record);
    /**
     * <p>根据邮箱查询用户</p>
     * @param email			邮箱
     * @return
     */
    @Select("select * from sys_user where email = #{email}")
	User findUserByEmail(@Param("email") String username);
    /**
     * <p>根据用户名查询用户</p>
     * @param username			用户名
     * @return
     */
    @Select("select count(1) from sys_user where user_name = #{user_name}")
    Integer findUserName(@Param("email")  String user_name);
    @Update("update sys_user set password = #{password} where email = #{email}")
	Integer updatePassword(@Param("email")String email, @Param("password") String password);
}