package bai3;

public class HamDaoNguocTrongMang2 {
    public static void main(String[] args) {

        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        daoNguoc(mang);

    }

    public static void daoNguoc(int[] array) {
        System.out.println("Ta co mang dao nguoc la: ");

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}

