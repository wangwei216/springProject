package firstMybatis;


/*这个是入门程序测试*/

import helloMybatis_po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisFirst {
@Test
    //*根据id去查询用户表的信息的方法*//*
    public void findUserByIdTest() throws IOException {

        //需要先得到mybatis的配置信息
        String resource = "SqlMapConfig.xml";
        //把这个配置文件作为流的形式给resource,得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //先创建一个会话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过sqlSession工厂得到openSession方法
        SqlSession sqlSession = sqlSessionFactory.openSession();
       // *//*通过SqlSession操作数据库
       /* 第一个参数就是映射文件中的statement的id，也就是命名空间（namespace）.statement的id*/
        User user = sqlSession.selectOne("test.findUserById", 1);
        System.out.println(user);
        //释放会话资源
        sqlSession.close();

    }

    //根据用户名称模糊查询用户列表
    @Test
    public void findUserByNameTest() throws IOException {

         String resource= "SqlMapConfig.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();//通过SQLsession工厂得到session通过openSession方法

        //这一步为SQL语句进行传参，
        // 第一个参数也就是数据库实体类的配置文件中(namespace.配置的功能方法id在实体类配置文件中的)
        //第二个参数就是你sql语句中需要注入的关键字
        List<User> list = sqlSession.selectList("test.findUserByName","王伟");
        System.out.println(list);
        sqlSession.close();

    }
//添加用户
    @Test
    public void insertUser() throws IOException {

        String resource = "SqlMapConfig.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        /*
        然后是为数据库实体类的对象的SQL语句进行穿参，因为这个是插入，所以不需要返回值但是需要创建一个插入对象

        */
        User user = new User();
        user.setId(7);
        user.setName("肖辉");
        user.setPassword("999999");
        user.setEmail("99999999@.com");
        //把你要插入的数据都先用set方法写好，然后直接把整个对象给插入进去
        sqlSession.insert("test.insertUser",user);
        //提交事务
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
    }
    /*
        通过id来删除数据库的数据
    */
    @Test
    public void deleteUserByIdTest() throws IOException {

        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //得到SQLsession
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //然后用sqlSession去调用操作数据的方法,然后还需要考虑返回值
        // 这个第一个参数的意思就是和之前配置的xml文件建立一个联系,使用的是xml的命名空间.配置的方法id
        //第二个参数你SQL语句中需要传进来的值
        sqlSession.delete("test.deleteUser",2);
        sqlSession.commit();
        sqlSession.close();

    }

    /*
    通过用户id来更新user对象的方法
    */
    @Test
    public  void updateUserByIdTest() throws IOException {

        String resource = "SqlMapConfig.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //因为在update配置文件中用的parameterType类型是User(数据库实体类)
        User user = new User();
        user.setId(2);
        user.setName("葛豪2");
        user.setPassword("666666666");
        user.setEmail("163QQ.com2");
        sqlSession.update("test.updateUser",user);
        //提交事务
        sqlSession.commit();
        sqlSession.close();


    }

}
