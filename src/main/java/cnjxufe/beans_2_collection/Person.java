package cnjxufe.beans_2_collection;

import java.util.List;
import java.util.Map;

/**
 * @author hsw
 * @create 2018-10-17  9:43
 */
public class Person {
    private String name;
    private String age;
    private List<Car> cars;
    private Map<Integer, House> houses;

    public Person() {
    }

    public Person(String name, String age, List<Car> car, Map<Integer, House> houses) {
        this.name = name;
        this.age = age;
        this.cars = car;
        this.houses = houses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<Car> getCar() {
        return cars;
    }

    public void setCar(List<Car> cars) {
        this.cars = cars;
    }

    public Map<Integer, House> getHouses() {
        return houses;
    }

    public void setHouses(Map<Integer, House> houses) {
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", car=" + cars +
                ", houses=" + houses +
                '}';
    }
}