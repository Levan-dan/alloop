package bai2;

import java.util.Scanner;

public class KiemTraSoNguyenTo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("khong phai so nguyen to");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % 2 == 0) {
                   check = false;
                   break;
                }
                i++;
            }
            if(check){
                System.out.println(number + " la so nguyen to.");
            }else {
                System.out.println(number + " khong la so nguyen to.");
            }
        }
    }
}
