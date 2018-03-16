package spring_testAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
@Order(1)//这个可以设置切面的 优先级
@Service
public class UserService {

    //这个就是如何在各个层次之间建立一个联系，那么传统的话在这里需要自己new出来一个DAO层的对象出来，但是现在使用注解的方法可以直接装配
    @Autowired
    private UserRepository userRepository;
    public void add(){

        System.out.println("这个是模仿service层的方法调用。。。。");
        userRepository.save();
    }
}
