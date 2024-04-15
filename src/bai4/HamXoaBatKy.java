package bai4;

import java.util.Arrays;
import java.util.Scanner;

public class HamXoaBatKy {
    public static void main(String[] args) {
        int[] mang = {1, 2, 3, 4, 5, 6, 7};
        xoaBatKy(mang);
    }
    public static void xoaBatKy(int[] array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao vi tri can xoa.");
        int viTri = scanner.nextInt();
        for (int i = viTri - 1 ; i < array.length - 1; i++){
            array[i] = array[i+1];
        }
        array = Arrays.copyOf(array, array.length -1);
        for (int a: array){
            System.out.print(a +" ");
        }
    }
}
