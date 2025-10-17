package part7.methods;

public class Ex9FindGCD {
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(12, 18));
    }
}
