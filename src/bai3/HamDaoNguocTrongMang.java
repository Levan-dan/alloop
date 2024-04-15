package bai3;

public class HamDaoNguocTrongMang {
    public static void main(String[] args) {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
       daoNguoc(mang);
    }
    public static void daoNguoc(int[] array){
        for(int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
