import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        String[] sanPham;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap size cho mang: ");
        int sizeMang = scanner.nextInt();
        System.out.println("Nhap cac san pham vao mang: ");
        sanPham = new String[sizeMang];
        for (int i = 0; i < sizeMang; i++) {
            System.out.println("Nhap san pham thu " + (i + 1));
            sanPham[i] = new Scanner(System.in).nextLine();
        }
        System.out.println("Ta co mang sau.");
        for (String mangMoi : sanPham) {
            System.out.print(mangMoi + " ");
        }
        System.out.println(" ");
        System.out.println("Ban co muon them phan tu vao mang khong ? va them vao vi tri nao?");
        System.out.println("Neu dong y nhan Y con khong nhan X.");
        String yourChoose = new Scanner(System.in).nextLine();
        if (yourChoose.equals("X") || yourChoose.equals("x")) {
            System.out.println("Dung chuong trinh.");

        } else if (yourChoose.equals("Y") || yourChoose.equals("y")) {
            sanPham = Arrays.copyOf(sanPham, sanPham.length + 1);
            System.out.println("Vui long nhap ten san pham: ");
            String product = new Scanner(System.in).nextLine();
            System.out.println("Vui long nhap vi tri cua san pham moi:");
            int indexProduct = scanner.nextInt();
//            chuyen cac phan tu ve sau
            for (int j = sanPham.length - 1; j > indexProduct; j--) {
                sanPham[j] = sanPham[j - 1];
            }
//            add phan tu vao vi tri can them
//
            sanPham[indexProduct] = product;

            for (String newArray : sanPham) {
                System.out.print(newArray + " ");
            }
        }
    }
}
