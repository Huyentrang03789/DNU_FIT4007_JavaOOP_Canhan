package part4.loops;
import java.util.Scanner;

public class Ex9CalculateFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int N = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= N; i++)
            fact *= 1;
        System.out.println(N +"! = " + fact);

    }
}
