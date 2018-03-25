package test;

        import cn.itcast.ssm.dao.UserDao;
        import cn.itcast.ssm.po.User;
        import org.junit.Before;
        import org.junit.Test;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImplTest {

    private ApplicationContext applicationContext;
    @Before
    public void setUp() throws Exception {

        //这里是测试类，因为你需要把你的bean都交给spring来去管理，所以你需要得到spring的容器,也就是需要得到spring的全局配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void findUserById() throws Exception {
        //然后就开始
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = userDao.findUserById(1);
        System.out.println(user.toString());

    }
}