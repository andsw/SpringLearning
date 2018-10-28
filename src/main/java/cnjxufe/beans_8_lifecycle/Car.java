package cnjxufe.beans_8_lifecycle;

/**
 * @author hsw
 * @create 2018-10-17  20:17
 */
public class Car {
    private String name;
    private int price;
    private String color;

    public Car() {
    }

    public Car(String name, int price, String color) {
        System.out.println("constructor method in car");
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public void inite() {
        System.out.println("init method in car");
    }

    public void destroy() {
        System.out.println("destroy method in car");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
