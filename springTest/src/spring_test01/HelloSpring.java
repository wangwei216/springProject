package spring_test01;
/*
一、实现IOC需要用到的底层技术有哪些？
    1. XML的配置文件
    2. dom4j解决XML
    3. 工厂的设计模式
    4. 反射机制
二、IOC原理流程：
    1. 需要先配置一下xml文件，前面id就是当你直接用的时候直接把配置好的id传进去，后面就是你创建的类名的路径<bean id="test01" class="spring_test01.HelloSpring">
    2. 创建工厂类使用dom4j + 反射 来实现
三、如何从IOC容器中获取bean的实例（ ApplicationContext）(记得在new ClassPathXmlApplicationContext后面一定要加xml的包名)
    1. HelloSpring bean = context.getBean(HelloSpring.class);直接在getBean后面加上类名.class
    2. HelloSpring bean = context.getBean("helloSpring"); 也就是在getBean后面加上你在xml文件中自己定义的的那个id名也可以
四、如何用xml配置文件给相应的类进行设置属性，而且怎么能够区分重名不同参数的构造方法
    1. 可以使用相对应的type类型，或者是每个位置对应参数的下标，再或者两者中和使用，也是可以的(constructor-arg)
    2. 还可以使用value直接使用对属性去赋值
    3. 还可以使用ref 直接去引用另外一个已经定义好的bean类型的值，如<constructor-arg index="2" ref="car"/>

* */
public class HelloSpring {

    private String name;

    public HelloSpring(String s, String s2, String s23) {
    }

    public void setName(String name){
        this.name=name;
    }
    public void sayHello(String name){

        System.out.println(name+"Hello  Spring");
    }

}
