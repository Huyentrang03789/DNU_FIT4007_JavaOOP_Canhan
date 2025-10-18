package part7.methods;

public class Ex21ArrayPrintAndReverse {
    public static void printArray(int[] a) {
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }

    static int[] reverseArray(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        for (int i = 0; i < n; i++)
            b[i] = a[n - 1 - i];
        return b;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        printArray(a);
        printArray(reverseArray(a));
    }
}