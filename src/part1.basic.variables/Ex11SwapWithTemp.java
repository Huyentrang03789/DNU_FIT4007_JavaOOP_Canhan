import java.util.Scanner;

public class Ex11SwapWithTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("Sau khi hoán đổi: a = " + a + ", b = " + b);
    }
}