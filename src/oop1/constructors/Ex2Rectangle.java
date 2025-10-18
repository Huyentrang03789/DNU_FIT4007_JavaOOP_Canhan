package oop1.constructors;

public class Ex2Rectangle {
    private double width;
    private double height;

    public Ex2Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public Ex2Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
}
