package part4.loops;
import java.util.Scanner;

public class Ex6FindSmallestNWithSumLE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập S: ");
        int S = sc.nextInt();
        int sum = 0, N = 0;
        while (sum + N + 1 <= S) {
            N++;
            sum += N;
        }
        System.out.println("N nhỏ nhất = " + N);
    }
}
