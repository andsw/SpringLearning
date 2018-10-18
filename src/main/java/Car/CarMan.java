package Car;

import java.util.List;
import java.util.Map;

/**
 * @author hsw
 * @create 2018-10-16  15:02
 */
public class CarMan {
    private String name;
    private int age;
    //    private List<CarClass> cars;
    private Map<Integer, CarClass> cars;

    public CarMan() {

    }

    public CarMan(String name, int age, Map<Integer, CarClass> cars) {
        this.name = name;
        this.age = age;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<Integer, CarClass> getCars() {
        return cars;
    }

    public void setCars(Map<Integer, CarClass> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "CarMan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
