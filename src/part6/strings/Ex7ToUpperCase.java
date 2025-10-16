package part6.strings;
import java.util.Scanner;

public class Ex7ToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        System.out.println("Chuỗi in hoa: " + str.toUpperCase());
    }
}
