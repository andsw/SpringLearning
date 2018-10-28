package cnjxufe.beans_2_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author hsw
 * @create 2018-10-15  16:31
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cnjxufe/beans_2_collection/beans_collection.xml");
        Person person = (Person) context.getBean("person");
        System.out.println("person's information is " + person);

        DataSource dataSource = (DataSource) context.getBean("dataSourse");
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
