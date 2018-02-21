package spring_testZhuJie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-zhujie.xml");
        Zoo zoo = (Zoo) context.getBean("zoo");
        System.out.println(zoo.toString());
    }

}
