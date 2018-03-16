package spring_testAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void execute(){
        System.out.println("测试模仿controller层。。。。");
        userService.add();
    }
}
