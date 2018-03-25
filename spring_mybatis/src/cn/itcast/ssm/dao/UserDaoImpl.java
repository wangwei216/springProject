package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

//这个还是实现原生DAO方法的接口实现类,还需要继承SqlSessionDaoSupport这个类
public class UserDaoImpl  extends SqlSessionDaoSupport implements UserDao {



    //实现通过id来查询用户信息的实现接口
    @Override
    public User findUserById(int id) throws Exception {
        //因为这里继承了SqlSessionDaoSupport这个接口，所以可以直接用它自己封装的getSqlSession()方法来得到sqlsession
        SqlSession sqlSession = this.getSqlSession();
        User user = sqlSession.selectOne("test.findUserById", id);
        //因为sqlsession也直接都交给了spring来管理了，所以这里也不需要在自己手动去关闭sqlsession了
            return user;
    }
    //实现来增加用户信息的实现接口


}
