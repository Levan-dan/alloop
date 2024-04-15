package bai4;

import java.util.Scanner;

public class HamGiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Vui long nhap gia tri cho phuong trinh.");
            System.out.println("Nhap gia tri a.");
            double a = scanner.nextDouble();
            System.out.println("Nhap gia tri b.");
            double b = scanner.nextDouble();
            String kq = phuongTrinhBacNhat(a, b);
            System.out.println(kq);
        }

    }

    public static String phuongTrinhBacNhat(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                return "Phuong trinh bac nhat vo so nghiem.";
            } else {
                return "Phuong trinh bac nhat vo nghiem.";
            }
        } else {
            if (b != 0) {
                double x = (-b / a);
                return "Phuong trinh bac nhat " + a + "x + " + b + " = 0" + " co nghiem la: " + x;
            } else {
                double x1 = (0 / a);
                return "Phuong trinh bac nhat " + a + "x + " + b + " = 0" + " co nghiem la: " + x1;
            }
        }
    }
}
