package spring_testAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMain {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-annotation.xml");
        TestObject testObject = (TestObject) context.getBean("testObject");
        System.out.println(testObject);
    }
}
