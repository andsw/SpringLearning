package cnjxufe.beans_12_AOP;

/**
 * @author hsw
 * @create 2018-11-07  16:05
 */
public class OriginalCalculator implements CalculatorInterface {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}
