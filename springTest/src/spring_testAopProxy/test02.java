package spring_testAopProxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test02 {

    public static void main(String[] args){

        ApplicationContext context= new ClassPathXmlApplicationContext("spring-aopProxy.xml");

        TestServiceInterface testServiceInterface = (TestServiceInterface) context.getBean("TestServiceInterface");

        testServiceInterface.sayHello();

    }
}
