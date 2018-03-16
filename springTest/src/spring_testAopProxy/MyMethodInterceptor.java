package spring_testAopProxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/*
        这是一个环绕通知的类,
*/
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕通知调用方法前。。。");
        Object obj = methodInvocation.proceed();//这个意思是要调用你要执行的核心代码，需要环绕打印出来的就写在这个方法前后，而且需要返回一个对象
        System.out.println("环绕通知调用方法后。。。");
        return obj;
    }
}
