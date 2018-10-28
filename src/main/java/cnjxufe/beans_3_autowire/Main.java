package cnjxufe.beans_3_autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hsw
 * @create 2018-10-17  19:05
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cnjxufe/beans_3_autowire/beans_autowire.xml");
        Person personPropertiesSetedByName = (Person) context.getBean("person");
        System.out.println(personPropertiesSetedByName);

        Person personPropertiesSettedByType = (Person) context.getBean("person1");
        System.out.println(personPropertiesSettedByType);
    }
}
