package part4.loops;
import java.util.Scanner;
public class Ex3PrintFromNTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int N = sc.nextInt();
        for (int i = N; i >= 1; i--){
             System.out.println(i);
        }
    }
}
