import java.util.Scanner;

public class Ex6LastDigitOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên N: ");
        int n = scanner.nextInt();

        int chuSoCuoi = Math.abs(n % 10);

        System.out.println("Chữ số cuối cùng của " + n + " là: " + chuSoCuoi);
    }
}