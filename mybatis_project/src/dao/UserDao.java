package dao;

import beans.User;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import util.MybatisUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    //这个是实现分页查询功能（用map来实现的第一种方式）
    public List<User> getAll(int currentPage,int pageSize) throws IOException {
        SqlSession  sqlSession = MybatisUtil.getSession();
        Map<String,Integer> map = new HashMap<String, Integer>();
//这个是把当
        map.put("startIndex",(currentPage-1)*pageSize);
        map.put("pageSize",pageSize);
        List<User> list = sqlSession.selectList("UserMapper.getAllMap",map);
        sqlSession.close();
        return list;
    }
    //这个是通过RowBounds来实现查询功能的分页操作
    public List<User> getAllRowBounds(int currentPage,int pageSize) throws IOException {
        SqlSession sqlSession = MybatisUtil.getSession();
        /*rowBounds需要的第一个参数就是从数据的哪个下标开始开始查，第二个就是你需要查询的条数*/
        RowBounds rowBounds= new RowBounds((currentPage-1)*pageSize,pageSize);
        List<User> list = sqlSession.selectList("UserMapper.getAllRowBounds",
                null, rowBounds);
        sqlSession.close();
        return list;
    }

}
