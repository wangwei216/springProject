package testMybatisDao;

import helloMybatis_po.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

//这个是实现原生DAO方法的接口实现类
public class UserDaoImpl implements UserDao {

/*  为了得到SQLsession来操作数据库，所以需要先注入sqlSessionFactory工厂类(如果使用spring的时候可以使用spring来注入
    在这里我直接用构造器来注入
 */
    private SqlSessionFactory sqlSessionFactory;
//构造器注入SQLSessionFactory
    public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory=sqlSessionFactory;
    }

    //实现通过id来查询用户信息的实现接口
    @Override
    public User findUserById(int id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.findUserById", id);
        //释放资源
        sqlSession.close();
            return user;
    }
    //实现来增加用户信息的实现接口

    @Override
    public void insertUser(User user) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行插入操作
        sqlSession.insert("test.insertUser", user);
        //提交事务
        sqlSession.commit();
        sqlSession.close();

    }
    //实现通过id来删除用户信息的实现接口
    @Override
    public void deleteUser(int id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("test.deleteUser",id);
        sqlSession.commit();
        sqlSession.close();

    }
}
