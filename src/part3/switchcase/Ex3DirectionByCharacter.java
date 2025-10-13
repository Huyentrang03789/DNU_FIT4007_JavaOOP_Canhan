package part3.switchcase;
import java.util.Scanner;
public class Ex3DirectionByCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ký tự (N/S/E/W): ");
        char c = sc.next().charAt(0);

        if (c == 'N')
            System.out.println("Bắc");
        else
            if (c == 'S')
                System.out.println("Nam");
        else
            if (c == 'E')
                System.out.println("Đông");
        else
            if (c == 'W')
                System.out.println("Tây");
        else System.out.println("Không hợp lệ!");
    }
}

