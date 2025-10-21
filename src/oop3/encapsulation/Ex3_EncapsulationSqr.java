package oop3.encapsulation;

public class Ex3_EncapsulationSqr {
    public static void main(String[] args) {
        C obj = new C();
        obj.setA3(4);
        System.out.println("Bình phương của a là: " + obj.sqr());
    }
}

class A3 {
    private int a;

    protected int sqr() {
        return a * a;
    }

    protected void setA3(int value) {
        a = value;
    }
}

class C extends A3 {
}

