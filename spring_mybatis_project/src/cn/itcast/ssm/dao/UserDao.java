package cn.itcast.ssm.dao;

        import cn.itcast.ssm.po.User;

//这个是使用原始的dao开发技术来写的接口，然后再去实现
public interface UserDao {


    //根据id查询用户信息
    public User findUserById(int id) throws Exception;


}
