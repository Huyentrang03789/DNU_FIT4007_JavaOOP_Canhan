package oop1.constructors;

public class Ex10Game {
    private int id;
    private Ex9Player player1;
    private Ex9Player player2;

    public  Ex10Game() {
        this.id = 0;
        this.player1 = new Ex9Player();
        this.player2 = new Ex9Player();
    }
    public  Ex10Game(int id, Ex9Player player1, Ex9Player player2) {
        this.id = id;
        this.player1 = player1;
        this.player2 = player2;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Ex9Player getPlayer1() {
        return player1;
    }
    public void setPlayer1(Ex9Player player1) {
        this.player1 = player1;
    }
    public Ex9Player getPlayer2() {
        return player2;
    }
    public void setPlayer2(Ex9Player player2) {
        this.player2 = player2;
    }

    public String tostring() {
        return "Game [id=" + id + ", player1=" + player1 + ", player2=" + player2 + "]";

    }
}
