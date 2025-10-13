package part3.switchcase;
import java.util.Scanner;

public class Ex1ReadNumberInVietnamese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số (0-9): ");
        int n = sc.nextInt();

        if (n < 0 || n > 9) {
            System.out.println("Số không hợp lệ!");
        } else if (n == 0) System.out.println("Không");
        else if (n == 1) System.out.println("Một");
        else if (n == 2) System.out.println("Hai");
        else if (n == 3) System.out.println("Ba");
        else if (n == 4) System.out.println("Bốn");
        else if (n == 5) System.out.println("Năm");
        else if (n == 6) System.out.println("Sáu");
        else if (n == 7) System.out.println("Bảy");
        else if (n == 8) System.out.println("Tám");
        else if (n == 9) System.out.println("Chín");
    }
}
