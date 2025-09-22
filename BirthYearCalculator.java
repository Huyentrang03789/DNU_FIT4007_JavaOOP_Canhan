import java.util.Scanner;
public class BirthYearCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tuổi của một sinh viên tính đến năm 2025: ");
        int tuoi = sc.nextInt();

        int namsinh = 2025 - tuoi;

        System.out.println("Năm sinh của sinh viên: " + namsinh);
        sc.close();
    }
}
