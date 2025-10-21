package oop2.methods;
import java.util.Scanner;

public class Ex12Book {
    private String name;
    private double price;
    private int quantity;

    public Ex12Book() {
        this.name = "";
        this.price = 0.0;
        this.quantity = 0;
    }

    public Ex12Book(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sách: ");
        name = sc.nextLine();
        System.out.print("Nhập giá sách: ");
        price = sc.nextDouble();
        System.out.print("Nhập số lượng: ");
        quantity = sc.nextInt();
    }

    @Override
    public String toString() {
        return String.format("Book{name='%s', price=%.2f, quantity=%d}", name, price, quantity);
    }

    public static void main(String[] args) {
        Ex12Book b = new Ex12Book();
        b.input();
        System.out.println("Thông tin sách: " + b);
    }
}
