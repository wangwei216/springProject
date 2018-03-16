package spring_testAopProxy;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class MyThrowsAdvice implements ThrowsAdvice{
    //这个是一个异常通知，当出现异常的时候，他就会抛出这个方法中所输出的东西, 然后去xml文件中去配置
    public void afterThrowing(Method method, Object[] object, Exception e){
        System.out.println("说明异常通知执行了，并打印出来出问题的地方"+ e.getMessage());

    }

}
