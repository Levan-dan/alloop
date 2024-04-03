import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mangOne = new int[3];
        int[] mangTwo = new int[3];
        int[] mangThree = new int[6];
        System.out.println("Vui long nhap gia tri cho mang 1");
        for (int i = 0; i < mangOne.length; i++) {
            System.out.println("Nhap 3 gia tri cho mang 1. Gia tri " + (i + 1));
            mangOne[i] = scanner.nextInt();
        }
        System.out.println("Ta co mangOne moi la: ");
        for (int mangA : mangOne) {
            System.out.print(mangA + " ");
        }
        System.out.println(" ");
        System.out.println("Vui long nhap gia tri cho mang 2");
        for (int j = 0; j < mangTwo.length; j++) {
            System.out.println("Nhap 3 gia tri cho mang 2. Gia tri " + (j + 1));
            mangTwo[j] = scanner.nextInt();
        }
        System.out.println("Ta co mangTwo moi la: ");
        for (int mangB : mangTwo) {
            System.out.print(mangB + " ");
        }
        System.out.println(" ");
        int indexBa = 0;
        for (int i = 0; i < mangOne.length; i++) {
            mangThree[indexBa] = mangOne[i];
            indexBa++;
        }
        for (int j = 0; j < mangTwo.length; j++) {
            mangThree[indexBa] = mangTwo[j];
            indexBa++;
        }
        System.out.println("Mang da gop la: ");
        for (int mangMoi : mangThree) {
            System.out.print(mangMoi + " ");
        }
    }
}
