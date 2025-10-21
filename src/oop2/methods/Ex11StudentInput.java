package oop2.methods;
import java.util.Scanner;

public class Ex11StudentInput {
    private String masv;
    private String name;
    private int age;

    public  Ex11StudentInput() {}

    public  Ex11StudentInput(String masv, String name, int age) {
        this.masv = masv;
        this.name = name;
        this.age = age;
    }
    public String getMasv() {
        return masv;
    }
    public void setMasv(String masv) {
        this.masv = masv;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã SV: ");
        masv = sc.nextLine();
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Student{masv='" + masv + "', name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        Ex11StudentInput s = new Ex11StudentInput();
        s.input();
        System.out.println(s);
    }
}


