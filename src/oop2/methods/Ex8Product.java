package oop2.methods;

public class Ex8Product {
    private String name;
    private double price;
    private int quantity;


    public Ex8Product() {}

    public Ex8Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getTotalPrice() {
        return price * quantity;
    }

    public void increaseQuantity() { quantity++; }
    public void decreaseQuantity() { if (quantity > 0) quantity--; }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", quantity=" + quantity + "}";
    }

    public static void main(String[] args) {
        Ex8Product p = new Ex8Product("Laptop", 1500, 3);
        System.out.println(p);
        System.out.println("Tổng giá trị: " + p.getTotalPrice());
        p.increaseQuantity();
        System.out.println("Sau khi tăng SL: " + p);
    }
}