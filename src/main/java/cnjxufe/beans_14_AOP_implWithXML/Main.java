package cnjxufe.beans_14_AOP_implWithXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hsw
 * @create 2018-11-09  22:13
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new
        ClassPathXmlApplicationContext("classpath:cnjxufe/beans_14_AOP_implWithXML/beans_AOPImplXML.xml");
        CalculatorInterface calculator = context.getBean(CalculatorInterface.class);
        calculator.add(1, 3);
        calculator.div(5, 0);
    }
}
