import javax.swing.plaf.ViewportUI;
import java.util.Scanner;

public class HamPhepTinh {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao gia tri thu nhat: ");
            int a = scanner.nextInt();
            System.out.println("Nhap vao gia tri thu hai: ");
            int b = scanner.nextInt();
            System.out.println("Vui long nhap phep tinh: ");
            String phepTinh = new Scanner(System.in).nextLine();
            switch (phepTinh) {
                case "+":
                    int kq = cong(a, b);
                    System.out.println(kq);
                    break;
                case "-":
                    int kq1 = tru(a, b);
                    System.out.println(kq1);
                    break;
                case "*":
                    int kq2 = nhan(a, b);
                    System.out.println(kq2);
                    break;
                case "/":
                    int kq3 = chia(a, b);
                    System.out.println(kq3);
                    break;
            }
        }

    }

    public static int cong(int a, int b) {
        int tong = a + b;
        System.out.println("Ket qua cua tong hai so la: ");
        return tong;
    }

    public static int tru(int a, int b) {
        int hieu = a - b;
        System.out.println("Ket qua cua hieu hai so la: ");
        return hieu;
    }

    public static int nhan(int a, int b) {
        int tich = a * b;
        System.out.println("Ket qua cua tich hai so la: ");
        return tich;
    }

    public static int chia(int a, int b) {
        int thuong = a / b;
        System.out.println("Ket qua cua thuong hai so la: ");
        return thuong;
    }

}
