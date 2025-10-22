package oop4.inheritance;
import java.util.Scanner;

class Rectangle {
    protected double length;
    protected double width;

    public Rectangle() {}

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        length = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        width = sc.nextDouble();
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String classifyShape() {
        if (length == width)
            return "Hình vuông";
        else
            return "Hình chữ nhật";
    }

    @Override
    public String toString() {
        return "Chiều dài = " + length + ", Chiều rộng = " + width +
                ", Chu vi = " + getPerimeter() + ", Diện tích = " + getArea();
    }
}

class Square extends Rectangle {

    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh hình vuông: ");
        length = width = sc.nextDouble();
    }

    public String toString() {
        return "Hình vuông có cạnh = " + length +
                ", Chu vi = " + getPerimeter() +
                ", Diện tích = " + getArea();
    }
}

public class Example4_Rectangle_Square {
    public static void main(String[] args) {
        System.out.println("Nhập thông tin hình chữ nhật");
        Rectangle rect = new Rectangle();
        rect.input();
        System.out.println("\n" + rect);
        System.out.println("Phân loại: " + rect.classifyShape());

        System.out.println("\nNhập thông tin hình vuông");
        Square sq = new Square();
        sq.input();
        System.out.println("\n" + sq);
    }
}
