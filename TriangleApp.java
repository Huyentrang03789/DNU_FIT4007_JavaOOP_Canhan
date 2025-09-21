import java.util.Scanner;

public class TriangleApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh a:");
        double a = sc.nextDouble();
        System.out.print("Nhập cạnh b:");
        double b = sc.nextDouble();
        System.out.print("Nhập cạnh c:");
        double c = sc.nextDouble();

        if(a + b > c && a + c > b && b + c > a){
            double chuvi = a + b + c;
            double p = chuvi /2;
            double dientich =Math.sqrt(p* (p - a) * (p - b) * (p - c));

            System.out.println("Chu vi tam giác: " + chuvi);
            System.out.println("Diện tích tam giác: " + dientich);
        } else {
            System.out.println("Ba cạnh nhập vào có tạo thành tam giác không vậy");
        }
        sc.close();
    }
}
