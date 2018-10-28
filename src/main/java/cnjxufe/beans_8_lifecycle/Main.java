package cnjxufe.beans_8_lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hsw
 * @create 2018-10-28  13:12
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cnjxufe/beans_8_lifecycle/beans_lifecycle.xml");
        Car car = (Car) context.getBean("car");
        ((ClassPathXmlApplicationContext) context).close();
    }
}
