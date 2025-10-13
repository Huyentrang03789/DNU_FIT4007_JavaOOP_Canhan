package part2.conditional.statements;

import java.util.Scanner;

public class Ex5CheckValidScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm: ");
        double score = scanner.nextDouble();

        if (score >= 0 && score <= 10) {
            System.out.println("Điểm hợp lý.");
        } else {
            System.out.println("Điểm không hợp lý.");
        }
    }

}
