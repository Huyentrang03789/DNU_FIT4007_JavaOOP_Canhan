import java.util.Scanner;

public class CheckTriangleAngles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập góc a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập góc b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập góc c: ");
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b + c == 180) {
            System.out.println("Ba góc này có thể tạo thành một tam giác.");
        } else {
            System.out.println("Ba góc này không thể tạo thành một tam giác.");
        }
    }
}