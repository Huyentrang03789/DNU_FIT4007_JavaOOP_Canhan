package oop2.methods;

public class Ex3Circle {
    private double radius;

    public Ex3Circle(){}

    public Ex3Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public String toString(){
        return "Ex3Circle [radius= " + radius + "]";
    }

    public static void main(String[] args) {
        Ex3Circle c = new Ex3Circle(3);
        System.out.println(c);
        System.out.println("Diện tích: " + c.getArea());
        System.out.println("Chu vi: " + c.getPerimeter());
    }
}
