package test;

import beans.Student;
import dao.StudentDao;

import java.io.IOException;
import java.util.List;

public class TestManyToOne {


    public static void main(String[] args) throws IOException {

        StudentDao studentDao = new StudentDao();
        List<Student> list = studentDao.getAll();
        for (Student student : list) {
            System.out.println("学生的姓名是>>>>"+student.getName()+"     学生的老师的姓名>>>>"
                    +student.getTeacher().getName());
        }
    }
}
