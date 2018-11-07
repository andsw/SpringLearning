package cnjxufe.beans_12_AOP;

/**
 * @author hsw
 * @create 2018-11-07  15:41
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("没有使用代理的结果：");
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(12, 10));

        System.out.println("以下是使用代理后的结果：");

        CalculatorInterface calculatorWithProxy = new OriginalCalculator();
        CalculatorInterface proxy = new DynamicProxy(calculatorWithProxy).getDynamicProxy();
        System.out.println(proxy.add(12, 10));
    }
}
