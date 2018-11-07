package cnjxufe.beans_10_annotation;

import cnjxufe.beans_10_annotation.AllBeans.Person;
import cnjxufe.beans_10_annotation.AllBeans.Repository.PersonRepository;
import cnjxufe.beans_10_annotation.AllBeans.Services.PersonServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hsw
 * @create 2018-11-06  22:20
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cnjxufe/beans_10_annotation/beans_annotation.xml");

        Person person = (Person) context.getBean("person");
        System.out.println("person : " + person);

//        PersonServices services = (PersonServices) context.getBean("personServices");
//        System.out.println("PersonServices : " + services);

        PersonRepository repository = (PersonRepository) context.getBean("personRepository");
        System.out.println("PersonRepository : " + repository);
    }
}
