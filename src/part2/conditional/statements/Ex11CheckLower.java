package part2.conditional.statements;

import java.util.Scanner;

public class Ex11CheckLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ký tự: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Ký tự là chữ cái in thường");
        } else {
            System.out.println("Ký tự KHÔNG phải chữ cái in thường");
        }
    }
}
