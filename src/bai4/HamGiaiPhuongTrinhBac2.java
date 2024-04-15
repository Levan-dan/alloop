package bai4;

import java.util.Scanner;

public class HamGiaiPhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap cac gia tri cho phuong trinh:");
        System.out.println("Nhap a.");
        double a = scanner.nextDouble();
        System.out.println("Nhap b.");
        double b = scanner.nextDouble();
        System.out.println("Nhap c");
        double c = scanner.nextDouble();
        String giaiPhuongTrinh = phuongTrinhBac2(a, b, c);
        System.out.println(giaiPhuongTrinh);

    }

    public static String phuongTrinhBac2(double a, double b, double c) {
        if (a == 0) {
            if (b != 0 && c != 0) {
                System.out.println("Ta co phuong trinh bac nhat la: " + b + "x" + " + " + c + " = 0");
                double x = -c / b;
                return "Phuong trinh bac nhat co gia tri la: " + x;
            } else if (b == 0 && c == 0) {
                return "Phuong trinh bac nhat vo so nghiem.";
            } else if (b == 0 && c != 0) {
                return "phuong trinh bac nhat vo nghiem.";
            }
        }
        if(a > 0 || a < 0) {
            System.out.println("Ta co phuong trinh bac hai : " + a + "x^2 + " + b + "x + " + c + " = 0");
            double denTa = (b * b) - (4 * a * c);
            System.out.println("Phuong trinh bac hai co so denta bang: " + denTa);
            if (denTa < 0) {
                return "Phuong trinh bac hai vo nghiem.";
            } else if (denTa == 0) {
                double nghiemKep = -b / (2 * a);
                return "Phuong trinh bac hai co nghiem kep la: x1 = x2 = " + nghiemKep;
            } else {
                double nghiem1 = (-b + Math.sqrt(denTa)) / (2 * a);
                double nghiem2 = (-b - Math.sqrt(denTa)) / (2 * a);
                return "Phuong trinh bac hai co hai nghiem phan biet la : x1= " + nghiem1 + " x2= " + nghiem2;
            }
        }
        return "Phuong trinh khong hop le";
    }
}
