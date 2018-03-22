package dao;

import beans.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDaoIntface {

    @Select("select * from user")
    public List<User> getList();

    @Insert("insert into user(id,name,password,email) values(#{id},#{name},#{password},#{values})")
    public int insertUser(User user);

}
