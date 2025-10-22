package oop4.inheritance;
import java.util.Scanner;
import java.time.Year;

class Person {
    protected String name;
    protected int age;
    protected String address;

    public Person() {}

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();
    }

    public int getYearOfBirth() {
        return Year.now().getValue() - age;
    }

    public String getUpperName() {
        return name.toUpperCase();
    }

    public boolean checkAge(int n) {
        return age >= n;
    }

    @Override
    public String toString() {
        return "Họ tên: " + name + ", Tuổi: " + age + ", Địa chỉ: " + address;
    }
}

class Student extends Person {
    private String studentId;
    private String nameSchool;

    public Student() {}

    public Student(String name, int age, String address, String studentId, String nameSchool) {
        super(name, age, address);
        this.studentId = studentId;
        this.nameSchool = nameSchool;
    }

    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getNameSchool() {
        return nameSchool;
    }
    public void setNameSchool(String nameSchool) { this.nameSchool = nameSchool; }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        studentId = sc.nextLine();
        System.out.print("Nhập tên trường: ");
        nameSchool = sc.nextLine();
    }

    public String toString() {
        return super.toString() + ", Mã SV: " + studentId + ", Trường: " + nameSchool;
    }

    public boolean checkStudentId() {
        return studentId.startsWith("23IT");
    }
}

public class Example3_Person_Student {
    public static void main(String[] args) {
        System.out.println(" Nhập thông tin sinh viên ");
        Student st = new Student();
        st.input();

        System.out.println("\nThông tin sinh viên ");
        System.out.println(st);

        System.out.println("\nNăm sinh: " + st.getYearOfBirth());
        System.out.println("Tên in hoa: " + st.getUpperName());

        if (st.checkAge(18))
            System.out.println("Sinh viên đủ 18 tuổi.");
        else
            System.out.println("Sinh viên chưa đủ 18 tuổi.");

        if (st.checkStudentId())
            System.out.println("Mã sinh viên hợp lệ (bắt đầu bằng 23IT).");
        else
            System.out.println("Mã sinh viên KHÔNG hợp lệ.");
    }
}

