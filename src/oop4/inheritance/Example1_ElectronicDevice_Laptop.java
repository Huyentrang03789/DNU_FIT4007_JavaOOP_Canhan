package oop4.inheritance;

import java.util.Scanner;

class ElectronicDevice {
    protected String manufacturer;
    protected long price;

    public ElectronicDevice() {}

    public ElectronicDevice(String manufacturer, long price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public long getPrice() { return price; }
    public void setPrice(long price) { this.price = price; }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hãng sản xuất: ");
        manufacturer = sc.nextLine();
        System.out.print("Nhập giá thiết bị: ");
        price = sc.nextLong();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "Hãng: " + manufacturer + ", Giá: " + price;
    }
}

class Laptop extends ElectronicDevice {
    private String screenSize;

    public Laptop() {}

    public Laptop(String manufacturer, long price, String screenSize) {
        super(manufacturer, price);
        this.screenSize = screenSize;
    }

    public String getScreenSize() { return screenSize; }
    public void setScreenSize(String screenSize) { this.screenSize = screenSize; }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước màn hình: ");
        screenSize = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", Màn hình: " + screenSize;
    }
}

public class Example1_ElectronicDevice_Laptop {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.input();
        System.out.println("\nThông tin laptop:");
        System.out.println(laptop);
    }
}
