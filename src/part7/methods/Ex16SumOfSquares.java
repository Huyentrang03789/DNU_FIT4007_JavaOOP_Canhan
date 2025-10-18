package part7.methods;

public class Ex16SumOfSquares {
    public static int sumSquare(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) s += i * i;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sumSquare(3));
    }
}
