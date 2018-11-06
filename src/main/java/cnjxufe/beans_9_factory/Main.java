package cnjxufe.beans_9_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hsw
 * @create 2018-11-06  21:04
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cnjxufe/beans_9_factory/beans_factory.xml");
        Person man = (Person) context.getBean("manFromStaticFactory");
        System.out.println(" manFromStaticFactory : " + man);

        Person man1 = (Person) context.getBean("manFromInstanceFactory");
        System.out.println(" manFromInstanceFactory : " + man1);

        Person man2 = (Person) context.getBean("manFromAPIFactory");
        System.out.println("manFromApiFactory : " + man2);
    }
}
