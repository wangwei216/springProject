package test;

import beans.Student;
import beans.Teacher;
import dao.TeacherDao;

import java.io.IOException;
import java.util.List;

public class TestOneToMany {

    public static void main(String[] args) throws IOException {
        TeacherDao teacherDao = new TeacherDao();
        Teacher teacher = teacherDao.getTeacher(1);
        System.out.println("老师的姓名==="+ teacher.getName());
        List<Student> list = teacher.getStudents();
        for (Student student : list) {
            System.out.println("学生的姓名是>>>>"+student.getName());
        }
    }
}
