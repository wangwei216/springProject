package testMybatisDao;

import helloMybatis_po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class UserMapperTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setup() throws Exception{

        /*
    1. 先得到xml的全局配置信息保存到string
    2. 把这个得到的配置信息字符串转换成一个文件流
    3. 用SqlSessionFactoryBuilder创建一个会话工厂
    4. 用这个会话工厂得到sqlSession
    5. 然后通过sqlSession来得到一个mapper的代理对象
        */
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findUserById() throws Exception {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);//这个传进来的参数就是你要代理的接口mapper的类
        //然后通过userMapper来直接调用你要代理的那个接口的方法，并传入参数就可以了
        User user = userMapper.findUserById(8);
        System.out.println(user);

    }
    @Test
    public void testFindUserById() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);//这个传进来的参数就是你要代理的接口mapper的类
        User user = userMapper.findUserById(8);
        System.out.println(user);
    }
}