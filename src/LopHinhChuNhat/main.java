package LopHinhChuNhat;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap chieu rong hinh chu nhat.");
        double weight = scanner.nextDouble();
        System.out.println("Vui long nhap chieu dai hinh chu nhat.");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(weight, height);
        rectangle.disPlay();

        System.out.println("hinh chu nhat co dien tich la : " + rectangle.getArea());
        System.out.println(("hinh chu nhat co chu vi la : " + rectangle.getPerimeter()));


    }
}
