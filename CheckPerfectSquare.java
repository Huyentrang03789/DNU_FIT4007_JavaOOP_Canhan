import java.util.Scanner;

public class CheckPerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = scanner.nextInt();

        if (N > 0) {
            double can = Math.sqrt(N);
            if (can == (int)can) {
                System.out.println(N + " là số chính phương.");
            } else {
                System.out.println(N + " không phải là số chính phương.");
            }
        } else {
            System.out.println("Vui lòng nhập số nguyên dương.");
        }
    }
}