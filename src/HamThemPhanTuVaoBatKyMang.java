import java.util.Arrays;
import java.util.Scanner;

public class HamThemPhanTuVaoBatKyMang {
    public static void main(String[] args) {

        int[] mang = {1, 2, 3, 4, 5};

        themPhanTu(mang);


    }

    public static void themPhanTu(int[] array) {

        array = Arrays.copyOf(array, array.length + 1);
        System.out.println("Ta co mang sau");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
        System.out.println("Them phan tu nu vao mang");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vi tri can them phan tu");
        int viTri = scanner.nextInt();
        System.out.println("Nhap phan tu ban muon them.");
        int phanTu = scanner.nextInt();
        for (int j = array.length - 1; j >= viTri; j--) {
            array[j] = array[j - 1];
        }


        for (int i = 0; i < array.length; i++) {
            array[viTri - 1] = phanTu;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }

    }
}
