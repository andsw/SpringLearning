package Car;

/**
 * @author hsw
 * @create 2018-10-15  16:25
 */
public class CarClass {
    private String brand;
    private String color;
    private int max;

    public CarClass() { }

    public CarClass(CarClass carClass) {
        this.brand = carClass.brand;
        this.color = carClass.color;
        this.max = carClass.max;
    }

    public CarClass(String brand, String color, int max) {
        this.brand = brand;
        this.color = color;
        this.max = max;
    }

    public CarClass(String brand, String color, double max) {
        this.brand = brand;
        this.color = color;
        this.max = (int) max;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "this is car's information is : \nbrand : " + this.brand
                + "\ncolor : " + this.color
                + "\nmax : " + this.max;
    }
}
