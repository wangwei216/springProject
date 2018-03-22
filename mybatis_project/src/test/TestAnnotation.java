package test;

import beans.User;
import dao.UserDaoIntface;
import org.apache.ibatis.session.SqlSession;
import util.MybatisUtil;

import java.io.IOException;

public class TestAnnotation {

    public static void main(String[] args) throws IOException {
        /*
        * 1. 获取SQLsession
        * 2. 通过SQLsession得到你代理的那个接口类
        * 3. 然后通过那个接口对象来调用接口定义的方法名
        * */
//直接查询全部的用户信息
       /* SqlSession sqlSession = MybatisUtil.getSession();
        UserDaoIntface mapper = sqlSession.getMapper(UserDaoIntface.class);
        List<User> list = mapper.getList();
        for (User user : list) {
            System.out.println(user.toString());
        }*/
        SqlSession sqlSession = MybatisUtil.getSession();
        UserDaoIntface mapper = sqlSession.getMapper(UserDaoIntface.class);
        User user = new User();
        user.setId(10);
        user.setName("俞兆林");
        user.setPassword("3211564");
        user.setEmail("yuzhaoling@qq.com");
        mapper.insertUser(user);

    }
}
