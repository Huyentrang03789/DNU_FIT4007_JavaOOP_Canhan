package oop3.encapsulation;

public class Ex4_EncapsulationGetterSetter {
    public static void main(String[] args) {
        A4 obj = new A4();
        obj.setA(20);
        System.out.println("Giá trị của a là: " + obj.getA());
    }
}

class A4 {
    private int a;

    public void setA(int value) {
        a = value;
    }

    public int getA() {
        return a;
    }
}
