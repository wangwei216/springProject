package spring_testAnnotationDemo;

public class ArithmethicCalculatorImpl implements ArithmethicCalculator {


    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }
}
