package cnjxufe.beans_2_collection;

/**
 * @author hsw
 * @create 2018-10-17  9:17
 */
public class Car {

    private String name;
    private String localtion;
    private int max_speed;

    public Car() {
    }

    public Car(String name, String localtion, int max_speed) {
        this.name = name;
        this.localtion = localtion;
        this.max_speed = max_speed;
    }

    public Car(Car car) {
        this.localtion = car.getLocaltion();
        this.max_speed = car.max_speed;
        this.name = car.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocaltion() {
        return localtion;
    }

    public void setLocaltion(String localtion) {
        this.localtion = localtion;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", localtion='" + localtion + '\'' +
                ", max_speed=" + max_speed +
                '}';
    }
}
