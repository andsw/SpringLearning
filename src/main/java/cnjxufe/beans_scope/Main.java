package cnjxufe.beans_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hsw
 * @create 2018-10-15  16:31
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cnjxufe/beans_scope/beans_scope.xml");
        Person singleDog1 = (Person) context.getBean("singleDog");
        Person singleDog2 = (Person) context.getBean("singleDog");
        System.out.println("singleDog1 is equal to dingleDog2?  " + singleDog1.equals(singleDog2));

        Person couple1 = (Person) context.getBean("couple");
        Person couple2 = (Person) context.getBean("couple");
        System.out.println("couple is equal to couple2?    " + couple1.equals(couple2));
    }

}
