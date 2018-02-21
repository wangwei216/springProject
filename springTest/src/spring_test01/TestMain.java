package spring_test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {
    public static void main(String[] args){
//        helloSpring.sayHello("这是我要传进来的参数的名字");

//这个是传统的正常调用对象去实现
//        HelloSpring helloSpring = new HelloSpring();
//        helloSpring.sayHello("这是我要传进来的参数的名字");


        /*这部分是利用了spring这个框架*/

        //1. 加载spring配置文件，创建一个Spring的IOC容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");//这个传进来的是你所要创建类所在的配置文件
        //2. 然后得到配置创建的对象，从IOC容器中获取这个bean对象那个
//        HelloSpring helloSpring = (HelloSpring) context.getBean("test01");//这个传进来的一定是要和你配置XML文件中的那个bean的id 是一样的
        Car bean = (Car) context.getBean(Car.class);





        //3. 直接调用你想调用的那个sayHello的方法
       System.out.println(bean);

        Object bean1 = context.getBean("person");
//        Person bean1 = context.getBean(Person.class);
        System.out.println(bean1);

        bean.shuchu();
    }
}
