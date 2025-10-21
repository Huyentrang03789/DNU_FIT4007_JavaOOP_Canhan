package oop3.encapsulation;

public class Ex1_EncapsulationA {
    public static void main(String[] args) {
        A1 obj = new A1();
        System.out.println("Không thể truy cập trực tiếp biến a vì nó là private!");
    }
}

class A1 {
    private int a;

    public A1() {
        a = 10;
    }
}
