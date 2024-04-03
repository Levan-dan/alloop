import java.util.Arrays;

public class HamXoaPhanTuDauMang {
    public static void main(String[] args) {
        int[] mang = {1, 2, 3, 4, 5, 6, 7};
        xoaPhanTuDau(mang);
    }

    public static void xoaPhanTuDau(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            array[i] = array[i + 1];
        }
        array = Arrays.copyOf(array, array.length - 1);
        for (int a : array){
            System.out.print(a + " ");
        }

    }
}
