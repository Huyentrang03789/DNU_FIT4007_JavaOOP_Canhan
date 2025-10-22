package oop4.inheritance;

import java.util.Scanner;
import java.time.Year;

class Animal {
    protected String name;
    protected int age;

    public Animal() {}

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên động vật: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
        sc.nextLine();
    }

    public int getYearOfBirth() {
        return Year.now().getValue() - age;
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", Tuổi: " + age;
    }
}

class Cat extends Animal {
    private String color;
    private String breed;

    public Cat() {}

    public Cat(String name, int age, String color, String breed) {
        super(name, age);
        this.color = color;
        this.breed = breed;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập màu lông: ");
        color = sc.nextLine();
        System.out.print("Nhập giới tính (Đực/Cái): ");
        breed = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", Màu lông: " + color + ", Giới tính: " + breed;
    }

    public boolean equalBreed(Cat c) {
        return this.breed.equalsIgnoreCase(c.breed);
    }
}

public class Example2_Animal_Cat {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        System.out.println("Nhập thông tin mèo 1 ");
        c1.input();

        Cat c2 = new Cat();
        System.out.println("\nNhập thông tin mèo 2 ");
        c2.input();

        System.out.println("\n--- Thông tin hai con mèo ---");
        System.out.println("Mèo 1: " + c1);
        System.out.println("Mèo 2: " + c2);

        System.out.println("\nNăm sinh của mèo 2: " + c2.getYearOfBirth());
        if (c1.equalBreed(c2))
            System.out.println("Hai con mèo cùng giới tính.");
        else
            System.out.println("Hai con mèo KHÁC giới tính.");
    }
}

