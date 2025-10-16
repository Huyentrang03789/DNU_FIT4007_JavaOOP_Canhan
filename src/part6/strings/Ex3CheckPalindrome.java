package part6.strings;
import java.util.Scanner;

public class Ex3CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversed))
            System.out.println("Chuỗi là đối xứng.");
        else
            System.out.println("Chuỗi không đối xứng.");
    }
}
