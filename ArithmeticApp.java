import java.util.Scanner;

public class ArithmeticApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuongNguyen = a / b;
        double thuongThuc = (double)a / b;

        System.out.println("Tổng = " + tong);
        System.out.println("Hiệu = " + hieu);
        System.out.println("Tích = " + tich);
        System.out.println("Thương (nguyên) = " + thuongNguyen);
        System.out.println("Thương (thực) = " + thuongThuc);
    }
}

