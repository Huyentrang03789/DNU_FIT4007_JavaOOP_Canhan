package oop4.inheritance;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class User {
    protected String userId;
    protected String username;
    protected String password;
    protected String email;

    public User() {}

    public User(String userId, String username, String password, String email) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void input(Scanner sc) {
        System.out.print("Nhập userId: ");
        this.userId = sc.nextLine();
        System.out.print("Nhập username: ");
        this.username = sc.nextLine();
        System.out.print("Nhập password: ");
        this.password = sc.nextLine();
        System.out.print("Nhập email: ");
        this.email = sc.nextLine();
    }
    public String toString() {
        return "UserID: " + userId +
                ", Username: " + username +
                ", Email: " + email;
    }
}
class Customer extends User {
    private String shippingAddress;

    public Customer() {}

    public Customer(String userId, String username, String password, String email, String shippingAddress) {
        super(userId, username, password, email);
        this.shippingAddress = shippingAddress;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    public void input(Scanner sc) {
        System.out.println("Nhập thông tin Customer");
        super.input(sc);
        System.out.print("Nhập địa chỉ giao hàng: ");
        this.shippingAddress = sc.nextLine();
    }

    public String toString() {
        return "[Customer] " + super.toString() +
                ", Shipping Address: " + shippingAddress;
    }
}
class Admin extends User {
    private ArrayList<String> permissions = new ArrayList<>();

    public Admin() {}

    public Admin(String userId, String username, String password, String email, ArrayList<String> permissions) {
        super(userId, username, password, email);
        this.permissions = permissions;
    }

    public ArrayList<String> getPermissions() {
        return permissions;
    }
    public void setPermissions(ArrayList<String> permissions) {
        this.permissions = permissions;
    }
    public void input(Scanner sc) {
        System.out.println(" Nhập thông tin Admin");
        super.input(sc);
        System.out.print("Nhập số lượng quyền: ");
        int n = Integer.parseInt(sc.nextLine());
        permissions = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Quyền " + (i+1) + ": ");
            permissions.add(sc.nextLine());
        }
    }
    public String toString() {
        return "[Admin] " + super.toString() +
                ", Permissions: " + permissions;
    }
}
public class Example5_UserSystem {
    static ArrayList<User> users = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nMENU QUẢN LÝ USER");
            System.out.println("1. Thêm 1 User");
            System.out.println("   1.1. Thêm 1 Customer");
            System.out.println("   1.2. Thêm 1 Admin");
            System.out.println("2. In ra danh sách tất cả User");
            System.out.println("3. Sắp xếp: Admin trước, Customer sau");
            System.out.println("4. Đăng nhập");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addUserMenu();
                    break;
                case 2:
                    printAllUsers();
                    break;
                case 3:
                    sortUsers();
                    break;
                case 4:
                    login();
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }
    static void addUserMenu() {
        System.out.println("1. Thêm Customer");
        System.out.println("2. Thêm Admin");
        System.out.print("Chọn loại user: ");
        int ch = Integer.parseInt(sc.nextLine());

        if (ch == 1) {
            Customer c = new Customer();
            c.input(sc);
            users.add(c);
        } else if (ch == 2) {
            Admin a = new Admin();
            a.input(sc);
            users.add(a);
        } else {
            System.out.println("Không hợp lệ!");
        }
    }
    static void printAllUsers() {
        System.out.println("\n DANH SÁCH USER");
        for (User u : users) {
            System.out.println(u.toString());
        }
    }
    static void sortUsers() {
        Collections.sort(users, (u1, u2) -> {
            if (u1 instanceof Admin && u2 instanceof Customer) return -1;
            if (u1 instanceof Customer && u2 instanceof Admin) return 1;
            return 0;
        });
        System.out.println("Đã sắp xếp xong!");
    }
    static void login() {
        System.out.print("Nhập username: ");
        String u = sc.nextLine();
        System.out.print("Nhập password: ");
        String p = sc.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(u) && user.getPassword().equals(p)) {
                System.out.println("Đăng nhập thành công!");
                System.out.println("Người dùng: " + user);
                return;
            }
        }
        System.out.println("Sai tên đăng nhập hoặc mật khẩu!");
    }
}
