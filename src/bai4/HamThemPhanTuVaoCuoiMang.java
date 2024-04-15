package bai4;

import com.sun.nio.sctp.NotificationHandler;

import java.util.Arrays;
import java.util.Scanner;

public class HamThemPhanTuVaoCuoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mang = new int[5];
        System.out.println(" Hay nhap gia tri cho mang");
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhap gia tri thu " + (i + 1));
            int phanTu = scanner.nextInt();
            mang[i] = phanTu;
        }
        System.out.println("Ta co mang vua tao la");
        for (int a : mang) {
            System.out.print(a + " ");
        }
        themPHanTu(mang);
    }

    public static void themPHanTu(int[] array) {
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        array = Arrays.copyOf(array, array.length + 1);
        System.out.println("Them mot phan tu bat ky vao cuoi mang");
        int phanTuMoi = scanner.nextInt();
        System.out.println("Mang vua duoc them la:");
        for (int i = 0; i < array.length; i++) {

            array[array.length - 1] = phanTuMoi;
        }
        for (int mangMoi : array) {
            System.out.print(mangMoi + " ");
        }
    }
}
