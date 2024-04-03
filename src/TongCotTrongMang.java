import java.util.Scanner;

public class TongCotTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] array;
        System.out.println("Nhap gia size cho mang array.");
        System.out.println("Nhap so hang cho mang .");
        int row = scanner.nextInt();
        System.out.println("Nhap so cot cho mang .");
        int colum = scanner.nextInt();
        System.out.println("ta co mang co kich thuoc la: " + row + " dong va " + colum + " cot.");
        array = new double[row][colum];
        System.out.println("Nhap gia tri cho mang.");
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap gia tri cho dong " + (i + 1));
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("nhap gia tri thu " + (j + 1));
                array[i][j] = new Scanner(System.in).nextDouble();
            }
        }
        System.out.println("Ta co mang hoan chinh la: ");
        for (int k = 0; k < array.length; k++) {
            for (int t = 0; t < array[k].length; t++) {
                System.out.print(array[k][t] + " \t");
            }
            System.out.println(" ");
        }

        System.out.println(" Nhap vi tri cot can tong hop.");
        double sum = 0;
        int sumColum = scanner.nextInt();
        if (sumColum < 0 || sumColum > colum) {
            System.out.println("vi tri cot khong co");
        } else {
            for (int m = 0; m < array.length; m++) {
                sum += array[m][sumColum];
            }
            System.out.println("Tong cac phan tu cua cot " + (sumColum + 1) + " la: ");
            System.out.print(sum + " ");
        }

    }
}
