package part2.conditional.statements;

import java.util.Scanner;

public class Ex15TimeAfterOneMinute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m;

        System.out.print("Nhập giờ (0-23): ");
        h = sc.nextInt();
        System.out.print("Nhập phút (0-59): ");
        m = sc.nextInt();

        m++;

        if (m == 60) {
            m = 0;
            h++;
            if (h == 24) {
                h = 0;
            }
        }

        System.out.printf("Thời gian sau 1 phút nữa là: %02d:%02d\n", h, m);
    }
}
