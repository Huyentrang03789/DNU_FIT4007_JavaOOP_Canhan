package part3.switchcase;
import java.util.Scanner;
public class Ex5DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập năm: ");
        int year = sc.nextInt();
        System.out.print("Nhập tháng: ");
        int month = sc.nextInt();

        int days;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            days = 31;
        else
            if (month == 4 || month == 6 || month == 9 || month == 11)
            days = 30;
        else
            if (month == 2)
            days = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
        else {
            System.out.println("Tháng không hợp lệ!");
            return;
        }
        System.out.println("Tháng " + month + " năm " + year + " có " + days + " ngày.");
    }
}
