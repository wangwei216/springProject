package spring_testAopProxy;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable {
              /*
    这个就是表示前置通知你需要加进来的东西，比如日志
        第一个参数是被调用方法的名字
        第二个参数是method方法传递的参数
        第三个是代理对象
        */
        System.out.println("记录核心代码执行前的日志"+ method.getName());
    }
}
