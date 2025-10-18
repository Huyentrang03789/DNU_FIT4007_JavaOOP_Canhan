package oop1.constructors;

public class Ex3Circle {
    private double radius;

    public Ex3Circle() {
        this.radius = 0;
    }

    public Ex3Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}

