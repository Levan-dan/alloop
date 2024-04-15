package bai3;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Xin dien vao mot so nguyen > 0.");
        int num;
        num = scanner.nextInt();
        if (num > 0) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " khong phai so nguyen to.");
                    break;
                } else {
                    System.out.println(num + " la so nguyen to.");
                }

            }
        } else {
            System.out.println("Vui long nhap dung gia tri.");
        }


    }
}
