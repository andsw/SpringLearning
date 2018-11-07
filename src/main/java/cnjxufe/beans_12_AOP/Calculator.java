package cnjxufe.beans_12_AOP;

/**
 * @author hsw
 * @create 2018-11-07  15:37
 */
public class Calculator implements CalculatorInterface {

    @Override
    public int add(int a, int b) {
        System.out.println("add方法被调用，参数 : a = " + a + ", b = " + b);
        int result = a + b;
        System.out.println("a + b = " + result);
        return result;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("sub方法被调用，参数 : a = " + a + ", b = " + b);
        int result = a - b;
        System.out.println("a - b = " + result);
        return result;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("mul方法被调用，参数 : a = " + a + ", b = " + b);
        int result = a * b;
        System.out.println("a * b = " + result);
        return result;
    }

    @Override
    public int div(int a, int b) throws ArithmeticException{
        System.out.println("div方法被调用，参数 : a = " + a + ", b = " + b);
        int result = a / b;
        System.out.println("a / b = " + result);

        return result;
    }
}
