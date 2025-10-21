package oop2.methods;

public class Ex9Player {
    private String name;
    private int age;
    private int score;
    private int positionX;
    private int positionY;

    public Ex9Player() {}

    public  Ex9Player(String name, int age, int score, int positionX, int positionY) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getPositionX() {
        return positionX;
    }
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }
    public int getPositionY() {
        return positionY;
    }
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
    public void increaseScore() { score++; }
    public void decreaseScore() { score--; }
    public void increaseScore(int n) { score += n; }
    public void decreaseScore(int n) { score -= n; }

    public boolean isWinner() { return score >= 100; }

    @Override
    public String toString() {
        return "Player{name='" + name + "', age=" + age + ", score=" + score +
                ", positionX=" + positionX + ", positionY=" + positionY + "}";
    }
    public static void main(String[] args) {
        Ex9Player p = new Ex9Player("John", 20, 95, 0, 0);
        p.increaseScore(10);
        System.out.println(p);
        System.out.println("Có thắng không? " + p.isWinner());
    }
}

