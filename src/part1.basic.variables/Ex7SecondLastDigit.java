import java.util.Scanner;

public class Ex7SecondLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên N
        System.out.print("Nhập vào một số nguyên N (ít nhất 2 chữ số): ");
        int n = scanner.nextInt();

        if (Math.abs(n) < 10) {
            System.out.println("Số phải có ít nhất 2 chữ số!");
            return;
        }
        int ganCuoi = Math.abs((n / 10) % 10);

        System.out.println("Chữ số gần cuối của " + n + " là: " + ganCuoi);
    }
}

