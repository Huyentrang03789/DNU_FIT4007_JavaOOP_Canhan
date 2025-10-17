package part7.methods;
import java.util.Scanner;

public class Ex7SayHelloName {
    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sayHello(sc.nextLine());
    }
}
