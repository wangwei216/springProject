package spring_testZhuJie;

import org.springframework.beans.factory.annotation.Autowired;

public class Zoo {

    @Autowired

    private Tiger tiger;
    @Autowired

    private Monkey monkey;

    public Zoo() {

    }

    @Override
    public String toString() {
        return "Zoo{" +
                "tiger=" + tiger +
                ", monkey=" + monkey +
                '}';
    }
}
