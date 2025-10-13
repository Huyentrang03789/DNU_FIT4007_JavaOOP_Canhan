import java.util.Scanner;

public class Ex8StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String ten = scanner.nextLine();

        System.out.println("Độ dài tên của bạn là: " + ten.length());
    }
}