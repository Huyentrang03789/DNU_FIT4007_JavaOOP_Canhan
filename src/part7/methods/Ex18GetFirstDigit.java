package part7.methods;

public class Ex18GetFirstDigit {
    public static int getFirstDigit(int n) {
        n = Math.abs(n);
        while (n >= 10) n /= 10;
        return n;
    }

    public static void main(String[] args) {
        System.out.println(getFirstDigit(123));
    }
}
