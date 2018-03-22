package dao;

import beans.Student;
import org.apache.ibatis.session.SqlSession;
import util.MybatisUtil;

import java.io.IOException;
import java.util.List;

public class StudentDao {

    public List<Student> getAll() throws IOException {
        SqlSession sqlSession = MybatisUtil.getSession();
        //sqlsession调用方法传进去的是xml的命名空间+书写SQL语句的id
        List<Student> list = sqlSession.selectList("StudentMapper.getStudent");
        sqlSession.close();
        return list;
    }
}
