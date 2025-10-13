import java.util.Scanner;

public class Ex12SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Sau khi hoán đổi: a = " + a + ", b = " + b);
    }
}