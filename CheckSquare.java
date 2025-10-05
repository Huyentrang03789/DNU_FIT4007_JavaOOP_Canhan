import java.util.Scanner;

public class CheckSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        int dai = scanner.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int rong = scanner.nextInt();

        if (dai == rong) {
            System.out.println("Đây là hình vuông.");
        } else {
            System.out.println("Đây không phải là hình vuông.");
        }
    }
}

