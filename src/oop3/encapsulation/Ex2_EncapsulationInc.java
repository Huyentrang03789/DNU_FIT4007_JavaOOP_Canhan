package oop3.encapsulation;

public class Ex2_EncapsulationInc {
    public static void main(String[] args) {
        A2 obj = new A2();
        obj.showA();
        obj.inc();
        obj.showA();
    }
}

class A2 {
    private int a = 5;

    void inc() {
        a++;
    }

    void showA() {
        System.out.println("Giá trị hiện tại của a: " + a);
    }
}
