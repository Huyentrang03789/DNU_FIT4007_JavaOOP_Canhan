package part4.loops;
import java.util.Scanner;

public class Ex5PrintEvenNumbersToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int N = sc.nextInt();
        for (int i = 2; i <=N; i+=2)
            System.out.println(i);
    }
}
