package part3.switchcase;

import java.util.Scanner;

public class Ex2IdentifyGender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giới tính (0-Nam, 1-Nữ.2-khác): ");
        int n = sc.nextInt();

        if (n == 0) System.out.println("Nam");
        else if (n == 1) System.out.println("Nữ");
        else if (n == 2) System.out.println("Khác");
        else System.out.println("Không hợp lệ!");
    }
}
