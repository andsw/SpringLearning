package cnjxufe.beans_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hsw
 * @create 2018-10-15  16:31
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("src/main/cnjxufe/beans_1/beans_3_autowire.xml");
        Hello hello = (Hello) context.getBean("hello");
        Car car = (Car) context.getBean("car");
        Car car1 = (Car) context.getBean("car1");
        Person person = (Person) context.getBean("person");
        Person person11 = (Person) context.getBean("person1");
        hello.sayHello();
        System.out.println("car's information is " + car);
        System.out.println("car1's information is " + car1);
        System.out.println("person's info is " + person);
        System.out.println("person1's information is " + person11);
    }

}
