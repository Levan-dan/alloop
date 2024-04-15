package bai4;

import java.util.Arrays;
import java.util.Scanner;

public class hamThemPhanTuVaoDauMang {
    public static void main(String[] args) {
        int[] mang = {1, 2, 3, 4, 5};
        themPhanTuVaoDauMang(mang);
    }

    public static void themPhanTuVaoDauMang(int[] array) {
        Scanner scanner = new Scanner(System.in);
//        int[] newArray = new int[array.length + 1];
        array = Arrays.copyOf(array, array.length + 1);

        for (int i = array.length -1  ; i > 0 ; i--) {
           array[i] = array[i-1];
        }

        System.out.println(" ");
        System.out.println("Nhap gia tri can them vao dau mang.");
        int phanTuMoi = scanner.nextInt();
        array[0] = phanTuMoi;
        for (int b : array){
            System.out.print(b + " ");
        }


//        System.out.println("Cho mang sau");
//        for(int a : array){
//            System.out.print(a + " ");
//        }
//        System.out.println("Chon mot phan tu de them vao dau mang");
////
//        for (int i = 0; i < array.length; i++){
//            array[array.length -1] = array[array.length-1-i];
//        }

    }
}
