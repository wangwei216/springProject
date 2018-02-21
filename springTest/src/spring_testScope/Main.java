package spring_testScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-spel.xml");
        Address address =  context.getBean(Address.class);
        System.out.println(address);

        Car car = context.getBean(Car.class);
        System.out.println(car);

        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}
