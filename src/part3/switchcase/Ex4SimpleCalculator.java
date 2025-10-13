package part3.switchcase;
import java.util.Scanner;
public class Ex4SimpleCalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập a: ");
            int a = sc.nextInt();
            System.out.print("Nhập b: ");
            int b = sc.nextInt();
            System.out.print("Nhập phép tính (+, -, *, /, %): ");
            char op = sc.next().charAt(0);

            if (op == '+')
                System.out.println(a + b);
            else
                if (op == '-')
                    System.out.println(a - b);
            else
                if (op == '*')
                    System.out.println(a * b);
            else
                if (op == '/')
                    System.out.println(b != 0 ? (a / b) : "Lỗi chia 0");
            else
                if (op == '%')
                    System.out.println(a % b);
            else System.out.println("Phép tính không hợp lệ!");
        }
}

