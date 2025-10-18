package oop1.constructors;

public class Ex1StudentMain {
    public static void main(String[] args) {
        Ex1Student sv1 = new Ex1Student("SV01", "Trang", 20);
        Ex1Student sv2 = new Ex1Student("SV02", "Thu", 16);
        Ex1Student sv3 = new Ex1Student("SV03", "Tuyet", 17);

        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
    }
}