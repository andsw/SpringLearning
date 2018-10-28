package cnjxufe.beans_4_relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hsw
 * @create 2018-10-15  16:31
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cnjxufe/beans_4_relation/beans_relation.xml");
        Person p = (Person) context.getBean("son");
        System.out.println(p);

        try {
            Person abstractPerson = (Person) context.getBean("abstractMan");
            System.out.println(abstractPerson);
        } catch (Exception e) {
            System.out.println("abstractPerson获取的bean被配置为抽象bean，不能被IOC容器实例化！");
        }
    }

}
