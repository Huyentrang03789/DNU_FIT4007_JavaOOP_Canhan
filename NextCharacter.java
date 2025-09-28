import java.util.Scanner;

public class NextCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một ký tự thường từ 'a' đến 'y': ");
        char ch = scanner.next().charAt(0);

        if (ch >= 'a' && ch <= 'y') {
            char ketQua = (char)(ch + 1);
            System.out.println("Ký tự liền sau '" + ch + "' là: " + ketQua);
        } else {
            System.out.println("Vui lòng nhập ký tự thường từ 'a' đến 'y'.");
        }
    }
}