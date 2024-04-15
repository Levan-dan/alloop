package bai4;

import java.util.Scanner;

public class HamTimMaxTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mang = new int[6];
        System.out.println("Vui long nhap cac phan tu cho mang");
        for(int i = 0; i < mang.length ; i++){
            System.out.println("Nhap phan tu thu " + (i+1));
            mang[i] = scanner.nextInt();
        }
        int kq = max(mang);
        System.out.println("Gia tri lon nhat trong mang la " + kq);
    }
    public static int max(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
}
