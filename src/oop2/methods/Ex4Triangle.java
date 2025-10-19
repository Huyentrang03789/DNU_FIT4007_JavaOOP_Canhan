package oop2.methods;

public class Ex4Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Ex4Triangle(){}

    public Ex4Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
    }
    public double getSideA() {
        return sideA;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public double getSideC() {
        return sideC;
    }
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
    public boolean isIsoscelesTriangle(){
        return sideA == sideB || sideB == sideC || sideA == sideC;
    }
    public boolean isEquilateralTriangle() {
        return sideA == sideB && sideB == sideC;
}
    public boolean isRightTriangle() {
        double[] s = {sideA, sideB, sideC};
        java.util.Arrays.sort(s);
        return Math.abs(s[2]*s[2] - (s[0]*s[0] + s[1]*s[1])) < 1e-6;
    }

    @Override
    public String toString() {
        return "Triangle [a=" + sideA + ", b=" + sideB + ", c=" + sideC + "]";
    }

    public static void main(String[] args) {
        Ex4Triangle t = new Ex4Triangle(3, 4, 5);
        System.out.println(t);
        System.out.println("Diện tích: " + t.getArea());
        System.out.println("Chu vi: " + t.getPerimeter());
        System.out.println("Cân: " + t.isIsoscelesTriangle());
        System.out.println("Đều: " + t.isEquilateralTriangle());
        System.out.println("Vuông: " + t.isRightTriangle());
    }
}
