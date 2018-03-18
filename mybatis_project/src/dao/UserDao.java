package dao;

import beans.User;
import org.apache.ibatis.session.SqlSession;
import util.MybatisUtil;

import java.io.IOException;
import java.util.List;

public class UserDao {

    //通过id来得到用户信息
    public User getById(int id) throws IOException {

        SqlSession sqlSession = MybatisUtil.getSession();
        User user = sqlSession.selectOne("UserMapper.selectUser", 1);
        System.out.println("姓名" + user.getName() + "密码：" + user.getPassword());
        sqlSession.close();
        return user;
    }

    //增加用户信息，也就是插入用户信息
    public int addUser(User user) throws IOException {
        SqlSession sqlSession = MybatisUtil.getSession();
        int result = sqlSession.insert("UserMapper.addUser",user);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
    //通过id删除用户信息
    public int deleteUser(int id) throws IOException {
        SqlSession sqlSession = MybatisUtil.getSession();
        int result = sqlSession.delete("UserMapper.deleteUser",id);
        //在写执行方法的时候第一个参数是命名空间+执行映射的id，第二个参数是传进来的具体参数
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
    //通过用户的id来修改用户的信息
    public int updateUser(User user) throws IOException {
        SqlSession sqlSession = MybatisUtil.getSession();
        int result = sqlSession.update("UserMapper.updateUser", user);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    //这个是查询到所有用户信息的全部集合
    public List<User> selectAllUser() throws IOException {
        SqlSession  sqlSession = MybatisUtil.getSession();
        List<User> list = sqlSession.selectList("UserMapper.selectAllUser");
        sqlSession.close();
        return list;
    }


}
