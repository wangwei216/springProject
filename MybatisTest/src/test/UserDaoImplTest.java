package test;

import helloMybatis_po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import testMybatisDao.UserDao;
import testMybatisDao.UserDaoImpl;

import java.io.InputStream;

public class UserDaoImplTest {

    private SqlSessionFactory sqlSessionFactory;


    @Before
    public void setUp() throws Exception{
        //需要在测试之前先得到SQLSessionFactory
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
         sqlSessionFactory = new  SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
    }
    @After
    public void findUserById(int id) throws Exception {
        //然后需要先创建一个
        UserDao userDao = new UserDaoImpl(sqlSessionFactory);

//        User user = new User();
//        user.setId(10);
//        user.setName("李宏梅");
//        user.setPassword("20170825");
//        user.setEmail("163@QQ.com");


        User user = userDao.findUserById(2);
        System.out.println(user);
    }
}
