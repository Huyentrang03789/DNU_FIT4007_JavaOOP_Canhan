package part2.conditional.statements;

import java.util.Scanner;

public class Ex3EvenNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên N: ");
        int N = scanner.nextInt();

        if (N % 2 == 0) {
            System.out.println(N + " là số chẵn.");
        } else {
            System.out.println(N + " là số lẻ.");
        }
    }

}
