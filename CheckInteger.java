import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số thực: ");
        float a = scanner.nextFloat();

        if (a == (int)a) {
            System.out.println(a + " là số nguyên.");
        } else {
            System.out.println(a + " không phải là số nguyên.");
        }
    }
}