package oop1.constructors;

public class Ex10GameMain {
    public static void main(String[] args) {
        Ex9Player p1 = new Ex9Player("Alice", 22, 5, 8);
        Ex9Player p2 = new Ex9Player("Bob", 23, 7, 9);
        Ex10Game g = new Ex10Game(1, p1, p2);
        System.out.println(g);
    }
}
