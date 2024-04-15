package bai3;

import java.util.Scanner;

public class DemKyTuChuoiTrongMang {
    public static void main(String[] args) {
        String studrent = "Xin chao da den voi Viet Nam";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui long nhap ky tu can dem.");

//        int doDai = studrent.length();
//        System.out.println("do dai cua chuoi la : " + doDai);

        char kyTu = scanner.next().charAt(0);
        int soLan = 0;
        for (int i = 0; i < studrent.length(); i++) {
            System.out.print(studrent.charAt(i) + " ");
            if (studrent.charAt(i) == kyTu) {
                soLan++;
            }

        }
        System.out.println(" ");
        System.out.println("So lan hien ky tu " + kyTu + " trong chuoi la : " + soLan);
    }
}
