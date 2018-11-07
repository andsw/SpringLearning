package cnjxufe.beans_12_AOP;

/**
 * @author hsw
 * @create 2018-11-07  16:05
 */
public class OriginalCalculator implements CalculatorInterface {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }
}
