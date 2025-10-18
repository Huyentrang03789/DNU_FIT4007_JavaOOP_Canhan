package part7.methods;

public class Ex10CheckPangramString {
    public static boolean isPangram(String s) {
        s = s.toLowerCase();
        boolean[] seen = new boolean[26];
        for (char c : s.toCharArray())
            if (c >= 'a' && c <= 'z') seen[c - 'a'] = true;

        for (boolean b : seen)
            if (!b) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
    }
}