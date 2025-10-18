package oop1.constructors;

public class Ex1Student {

    private String masv;
    private String name;
    private int age;

    public Ex1Student() {
    }

    public Ex1Student(String masv, String name, int age) {
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

    @Override
    public String toString() {
        return "Mã SV: " + masv + ", Tên: " + name + ", Tuổi: " + age;
    }
}


