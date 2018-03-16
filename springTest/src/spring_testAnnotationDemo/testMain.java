package spring_testAnnotationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMain {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_testAnnotationDemo/spring-testAnnotationDemo.xml");

        ArithmethicCalculator arithmethicCalculator = (ArithmethicCalculator) context.getBean("arithmethicCalculator");
        int result = arithmethicCalculator.add(2, 3);
        System.out.println(result);
    }

}
