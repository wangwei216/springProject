package test;

import beans.User;
import dao.UserDao;

import java.io.IOException;
import java.util.List;

public class TestRowBounds {

    public static void main(String[] args) throws IOException {
        UserDao userDao = new UserDao();
        List<User> list = userDao.getAllRowBounds(1, 3);
        for (User user : list) {
            System.out.println(user.toString());
        }
    }
}
