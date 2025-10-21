package oop2.methods;

import java.util.*;

public class Ex13BookList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Ex12Book> books = new ArrayList<>();

        System.out.print("Nhập số lượng sách: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin sách thứ " + (i + 1) + ":");
            Ex12Book b = new Ex12Book();
            b.input();
            books.add(b);
        }

        double max = books.stream()
                .mapToDouble(Ex12Book::getPrice)
                .max()
                .orElse(0);
        System.out.println("\nSách giá cao nhất:");
        books.stream()
                .filter(b -> b.getPrice() == max)
                .forEach(System.out::println);

        System.out.println("\nSách có tên 'Java OOP':");
        books.stream()
                .filter(b -> b.getName().equalsIgnoreCase("Java OOP"))
                .forEach(System.out::println);

        books.sort(Comparator.comparingInt(Ex12Book::getQuantity));
        System.out.println("\nSắp xếp tăng dần theo số lượng:");
        books.forEach(System.out::println);

        books.sort((Ex12Book b1, Ex12Book b2) -> Double.compare(b2.getPrice(), b1.getPrice()));
        System.out.println("\nSắp xếp giảm dần theo giá:");
        books.forEach(System.out::println);

        sc.close();
    }
}
