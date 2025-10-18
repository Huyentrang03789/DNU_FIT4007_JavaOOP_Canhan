package oop1.constructors;

public class Ex6Animal {
    private String name;
    private String color;
    private int age;

    public Ex6Animal(){
        this.name = "";
        this.color = "";
        this.age = 0;
    }
    public Ex6Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return "Animal{" + "name=" + name + ", color=" + color + ", age=" + age + '}';
    }
}
