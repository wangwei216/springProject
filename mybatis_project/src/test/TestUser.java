package test;

import beans.User;
import dao.UserDao;

import java.io.IOException;
import java.util.List;


public class TestUser {


    public static void main(String[] args) throws IOException {
        UserDao userDao = new UserDao();
        //这个传进来的第一个参数是你要显示第几页的数据，第二是你需要没页显示几条记录
        List<User> list = userDao.getAll(2, 3);
        for (User user : list) {
            System.out.println(user.toString());
        }
//        List<User> list = userDao.selectAllUser();
//        for (User user : list) {
//            System.out.println(user.toString());
//        }

//        User user = userDao.getById(5);
//        user.setName("小话");
//        int result = userDao.updateUser(user);
//        System.out.println(result);


//        int result = userDao.deleteUser(4);
//        System.out.println(result);


//        user.setId(9);
//        user.setName("小姐姐");
//        user.setPassword("123123123");
//        user.setEmail("123123123@163.com");
//        int result = userDao.addUser(user);
//        System.out.println(result);
    // 这个是通过id来得到用户信息的功能
//        User user = userDao.getById(1);
//        System.out.println(user.toString());
    }
}
