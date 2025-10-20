package oop2.methods;

import java.time.Year;

public class Ex6Animal {
    private String name;
    private String color;
    private int age;

    public Ex6Animal(){}

    public Ex6Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getYearOfBirth() {
        int currentYear = Year.now().getValue();
        return currentYear - age;
    }
    public boolean equalsColor(Ex6Animal a) {
        return this.color.equalsIgnoreCase(a.color);
    }
    public void increaseAge(){
        this.age++;
    }
    public String toString(){
        return "Animal{name='" + name + "', color='" + color + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        Ex6Animal dog = new Ex6Animal("Dog", "Brown", 2);
        Ex6Animal cat = new Ex6Animal("Cat", "Brown", 1);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println("Năm sinh: " + dog.getYearOfBirth());
        System.out.println("Cùng màu với mèo không? " + dog.equalsColor(cat));
        dog.increaseAge();
        cat.increaseAge();
        System.out.println("Tuổi sau khi tăng: " + dog.getAge());
        System.out.println("Tuổi sau khi tăng: " + cat.getAge());


    }
}
