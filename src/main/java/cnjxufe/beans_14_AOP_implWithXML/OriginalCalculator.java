package cnjxufe.beans_14_AOP_implWithXML;

import org.springframework.stereotype.Component;

/**
 * @author hsw
 * @create 2018-11-07  16:05
 */
@Component("calculator")
public class OriginalCalculator implements CalculatorInterface {

    public int add(int a, int b) {
        System.out.println();
        System.out.println("the add method is executing!");
        System.out.println();
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
