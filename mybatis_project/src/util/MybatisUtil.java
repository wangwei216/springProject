package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {

    //这个是得到sqlsessionFactory工厂
    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        /*
         * 1.先得到xml文件源*/

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }
    //这个是得到sqlsession会话
    public static SqlSession getSession() throws IOException {
        SqlSessionFactory sqlSessionFactory= getSqlSessionFactory();
        return sqlSessionFactory.openSession();
    }
}
