package cn.itcast.ssm.mapper;

        import cn.itcast.ssm.po.User;

public interface UserMapper {

    //用mapper实现代理的目的就是最直接的就是可以不用写之前的那种UserDao那样的时间接口的方法

    //根据id查询用户信息
    public User findUserById(int id) throws Exception;


}
