package spring_testAnnotation;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public void save() {
        System.out.println("这是在测试一个持久层。。。。。");
    }
}
