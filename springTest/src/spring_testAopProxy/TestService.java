package spring_testAopProxy;
/*

一、这个是测试如何使用aop来实现代理模式，并且植入前置通知和后置通知(这个就是我要被代理的对象)
    1.
*
*
* */
public class TestService implements TestServiceInterface , TestServiceInterface2 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello" + name);
    }

    @Override
    public void sayBye() {
        System.out.println("ByeBye" +name);
    }
}

