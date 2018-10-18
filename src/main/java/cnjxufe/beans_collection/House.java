package cnjxufe.beans_collection;

/**
 * @author hsw
 * @create 2018-10-17  15:13
 */
public class House {
    private String location;
    private int size;

    public House() {
    }

    public House(String location, int size) {
        this.location = location;
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "House{" +
                "location='" + location + '\'' +
                ", size=" + size +
                '}';
    }
}
