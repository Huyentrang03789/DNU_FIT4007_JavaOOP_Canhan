package oop2.methods;

public class Ex5Square {
    private double side;
    public Ex5Square(){}
    public Ex5Square(double side){
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public double getArea(){
        return side;
    }
    public void setArea(double area){
        this.side = area;
    }
    public double getPerimeter(){
        return 4 * side;
    }
    public void setPerimeter(double perimeter){
        this.side = perimeter;
    }
    public  boolean isIntegerSquareSide(){
        return side == (int) side;}
    public String toString() {
        return "Square [side=" + side + "]";
    }

    public static void main(String[] args) {
        Ex5Square s = new Ex5Square(4.0);
        System.out.println(s);
        System.out.println("Diện tích: " + s.getArea());
        System.out.println("Chu vi: " + s.getPerimeter());
        System.out.println("Cạnh là số nguyên? " + s.isIntegerSquareSide());
    }
}
