package part2.conditional.statements;

import java.util.Scanner;

public class Ex12CheckUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ký tự: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Ký tự là chữ cái in hoa");
        } else {
            System.out.println("Ký tự KHÔNG phải chữ cái in hoa");
        }
    }
}
