package bai4;

import java.util.Arrays;

public class HamXoaPhanTuCuoiTrongMang {
    public static void main(String[] args) {
        int[] mang = {1, 2, 3, 4, 5, 6, 7};
        xoaPhanTuCuoi(mang);
    }

    public static void xoaPhanTuCuoi(int[] array) {
        array = Arrays.copyOf(array, array.length - 1);
        for (int a: array){
            System.out.print(a + " ");
        }
    }
}
