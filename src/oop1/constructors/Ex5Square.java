package oop1.constructors;

public class Ex5Square {
    private double side;

    public Ex5Square() {
        this.side = 0;
    }
    public Ex5Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    public String toString(){
        return "Ex5Square{" + "side=" + side + '}';
    }
}
