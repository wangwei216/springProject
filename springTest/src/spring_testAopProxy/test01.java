package spring_testAopProxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {

public static void main(String[] args){

    ApplicationContext context = new ClassPathXmlApplicationContext("spring_testAopProxy/spring-aopProxy.xml");
    //这个地方不能get被代理的对象（testService），因为你要是这样写的话，那就完全没有用到aop的东西，而是需要用到代理的对象
    TestService testService = (TestService) context.getBean("testService");
    //而且返回的类型也不是TestService 类型的，而是TestService要实现的接口类的TestServiceInterface类型
    TestServiceInterface2 testServiceInterface = (TestServiceInterface2) context.getBean("proxyFactoryBean");
    TestServiceInterface testServiceInterface2 = (TestServiceInterface) context.getBean("proxyFactoryBean");

    testService.sayHello();
    System.out.println("======================");
    testServiceInterface2.sayHello();
    System.out.println("======================");

    testServiceInterface.sayBye();


    }
}
