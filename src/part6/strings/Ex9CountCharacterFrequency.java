package part6.strings;
import java.util.Scanner;
import java.util.HashMap;
public class Ex9CountCharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char key : map.keySet()) {
            System.out.println(key + " xuất hiện " + map.get(key) + " lần");
        }
    }
}