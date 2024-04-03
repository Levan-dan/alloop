package LopHinhTron;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh cua hinh tron.");
        double banKinh = scanner.nextDouble();
        System.out.println("Nhap mau sac cua hinh tron.");
        String mauSac = new Scanner(System.in).nextLine();

        HinhTron circle = new HinhTron(banKinh, mauSac);
        circle.getRadius();
        circle.getAre();

    }
}
