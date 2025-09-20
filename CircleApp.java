import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bán kính hình tròn: ");
        double r = sc.nextDouble();

        double chuVi = 2 * Math.PI * r;
        double dienTich = Math.PI * r * r;

        System.out.printf("Chu vi hình tròn = %.2f\n", chuVi);
        System.out.printf("Diện tích hình tròn = %.2f\n", dienTich);
    }
}
