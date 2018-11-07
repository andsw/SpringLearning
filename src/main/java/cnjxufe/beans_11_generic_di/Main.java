package cnjxufe.beans_11_generic_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hsw
 * @create 2018-11-07  11:18
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cnjxufe/beans_11_generic_di/beans_generic_di.xml");
        UserRepository userRepository = (UserRepository) context.getBean("userRepository");
        userRepository.add();
    }
}
