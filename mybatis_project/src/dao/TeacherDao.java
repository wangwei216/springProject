package dao;

import beans.Teacher;
import org.apache.ibatis.session.SqlSession;
import util.MybatisUtil;

import java.io.IOException;

public class TeacherDao {

    //这个是得到Teacher的实体类的方法
   public Teacher getTeacher(int id) throws IOException {
        SqlSession sqlSession = MybatisUtil.getSession();
        //这部分就是用sqlSession去得到映射，返回的是Teacher类型
        Teacher teacher = sqlSession.selectOne("TeacherMapper.getTeacher",id);
        sqlSession.close();
        return teacher;
    }
}
