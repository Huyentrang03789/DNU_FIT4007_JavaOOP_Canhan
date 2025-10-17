package part7.methods;
import java.util.Scanner;

public class Ex7SayHelloName {
    public static void sayHelloName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        sayHelloName();
    }
}
