package part4.loops;
import java.util.Scanner;

public class Ex4SumFrom1ToN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) sum += i;
        System.out.println("Tổng = " + sum);
    }
}
