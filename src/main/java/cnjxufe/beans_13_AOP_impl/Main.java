package cnjxufe.beans_13_AOP_impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hsw
 * @create 2018-11-09  22:13
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cnjxufe/beans_13_AOP_impl/beans_AOPImpl.xml");
//        OriginalCalculator calculator = (OriginalCalculator) context.getBean("calculator");
//        因为生成的已经不是OriginalCalculator类对象而是其代理类对象了，根据代理模式只是可以知道，代理类是和被代理的对象是继承
//        同一接口的，所以可以直接用CalculatorInterface承接
        CalculatorInterface calculator = (CalculatorInterface) context.getBean("calculator");
        int result = calculator.add(1, 1);
        System.out.println(result);

    }
}
