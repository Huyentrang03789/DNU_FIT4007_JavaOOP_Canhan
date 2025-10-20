package oop2.methods;
import java.time.Year;

public class Ex7Car {
    private  String color;
    private String name;
    private int seatingCapacity;
    private int year;

    public Ex7Car() {}

    public Ex7Car(String color, String name, int seatingCapacity, int year) {
        this.color = color;
        this.name = name;
        this.seatingCapacity = seatingCapacity;
        this.year = year;
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
    public int getSeatingCapacity() {
        return seatingCapacity;
    }
    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getAge() {
        return Year.now().getValue() - year;
    }
     public String toString() {
         return "Car [name=" + name + ", color=" + color +
                 ", seatingCapacity=" + seatingCapacity + ", year=" + year + "]";
     }

    public static void main(String[] args) {
        Ex7Car car = new Ex7Car("Red", "Toyota Camry", 5, 2019);
        System.out.println(car);
        System.out.println("Tuổi của xe: " + car.getAge() + " năm");
    }
}