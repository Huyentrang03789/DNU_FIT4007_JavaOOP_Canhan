package part7.methods;

public class Ex15SumArray {
    public static int sumArray(int[] a) {
        int sum = 0;
        for (int x : a) sum += x;
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(sumArray(a));
    }
}
