package part2.conditional.statements;

import java.util.Scanner;

public class Ex10CheckDivMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Nhập a: ");
        a = sc.nextInt();
        System.out.print("Nhập b: ");
        b = sc.nextInt();
        System.out.print("Nhập c: ");
        c = sc.nextInt();

        if (a % b == 0 && b % c == 0) {
            System.out.println("b là ước của a và đồng thời là bội của c");
        } else {
            System.out.println("b KHÔNG thỏa điều kiện");
        }
    }
}
