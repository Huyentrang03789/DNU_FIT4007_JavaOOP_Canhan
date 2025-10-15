package part5.arrays;
import java.util.Scanner;

public class Ex4SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
            sum += a[i];
        }

        System.out.println("Tổng mảng = " + sum);
    }
}
