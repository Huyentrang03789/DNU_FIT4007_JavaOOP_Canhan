package part7.methods;

public class Ex12PrintStringNTimes {
    public   static void printN(String s, int n) {
        for (int i = 0; i < n; i++)
            System.out.println(s);
    }

    public static void main(String[] args) {
        printN("PTIT", 3);
    }
}
