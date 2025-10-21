package oop2.methods;

public class Ex10Game {
    private int id;
    private Ex9Player player1;
    private Ex9Player player2;

    public Ex10Game() {}

    public Ex10Game(int id, Ex9Player p1, Ex9Player p2) {
        this.id = id;
        this.player1 = p1;
        this.player2 = p2;
    }

    public Ex9Player getWinner() {
        if (player1.isWinner() && !player2.isWinner()) return player1;
        if (player2.isWinner() && !player1.isWinner()) return player2;
        if (player1.isWinner() && player2.isWinner()) return player1;
        return null;
    }

    public void resetGame() {
        player1.setScore(0);
        player2.setScore(0);
    }
    public void swapPlayers() {
        Ex9Player temp = player1;
        player1 = player2;
        player2 = temp;
    }

    public String toString() {
        return "Game{id=" + id + ", player1=" + player1 + ", player2=" + player2 + "}";
    }

    public static void main(String[] args) {
        Ex9Player a = new Ex9Player("Alice", 20, 120, 0, 0);
        Ex9Player b = new Ex9Player("Bob", 22, 80, 0, 0);
        Ex10Game g = new Ex10Game(1, a, b);
        System.out.println(g);
        System.out.println("Người thắng: " + g.getWinner());
        g.resetGame();
        System.out.println("Sau khi reset: " + g);
    }
}
