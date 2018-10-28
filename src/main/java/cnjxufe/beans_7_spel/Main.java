package cnjxufe.beans_7_spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hsw
 * @create 2018-10-15  16:31
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cnjxufe/beans_7_spel/beans_spel.xml");
        Person couple = (Person) context.getBean("couple");
        System.out.println("couple's information:  " + couple + " is same with singleDog");
    }

}
