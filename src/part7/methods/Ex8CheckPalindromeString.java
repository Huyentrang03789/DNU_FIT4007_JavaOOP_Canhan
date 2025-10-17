package part7.methods;

public class Ex8CheckPalindromeString {
    static boolean isPalindrome(String s) {
        String r = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(r);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }
}
