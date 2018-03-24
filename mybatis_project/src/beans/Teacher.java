package beans;

import java.util.List;

public class Teacher {


    private  int id;
    private String name;


    //这个是一对多需要的，谁主动去去找另外一个就得在这个实体类里面建立一个链接的桥梁
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
