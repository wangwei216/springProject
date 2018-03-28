package test;

import cn.itcast.ssm.mapper.UserMapper;
import cn.itcast.ssm.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMapperTest {

    private ApplicationContext applicationContext;
    @Before
    public void setUp() throws Exception {

        //这里是使用mapper代理的方式的测试类，因为你需要把你的bean都交给spring来去管理，所以你需要得到spring的容器,也就是需要得到spring的全局配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void findUserById() throws Exception {
        //因为使用的是mapper代理的方式，所以也需要把要实现的UserMapper对象(里面是要实现功能接口)从spring容器中得到
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = userMapper.findUserById(1);
        System.out.println(user.toString());

    }
}
