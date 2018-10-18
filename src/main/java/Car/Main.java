package Car;

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
//        哎！为了不碰到不必要的麻烦，最好把spring的配置文件放在classpath下！
//        因为其默认地址是在classpath下！至少我在stackoverflow上看到同样的问
//        题下的回答都是这种说法即将配置文件移到classpath下！
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:Car/spring.xml");
//        CarClass carClass = (CarClass) context.getBean("car1");
//        System.out.println(carClass.toString());
//        System.out.println();
//
//        CarMan carMan = (CarMan) context.getBean("carMan");
//        System.out.println(carMan);

//        test singleton

//        CarClass sCar1 = (CarClass) context.getBean("singleCar");
//        CarClass sCar2 = (CarClass) context.getBean("singleCar");
//        System.out.println(sCar1 == sCar2);
        DataSource source = (DataSource) context.getBean("dataSource");
        try {
            if (source != null)
                System.out.println(source.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
