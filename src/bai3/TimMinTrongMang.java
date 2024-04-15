package bai3;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class TimMinTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap size cho mang array ");
        int[] array;
        int size = scanner.nextInt();
        array = new int[size];
        System.out.println("Nhap " + size + " cho mang array.");
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap gia tri thu " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.println("Ta co mang hoan chinh la: ");
        for (int mangMoi : array) {
            System.out.print(mangMoi + " ");
        }
        System.out.println(" ");
        System.out.println("Gia tri nho nhat trong mang la: ");
        int min = array[0];

        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.print(min + " ");
    }
}
