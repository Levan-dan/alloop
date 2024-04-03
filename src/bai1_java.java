import java.util.Scanner;

public class bai1_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap vao chieu rong cua hinh chu nhat: ");
        float weight = scanner.nextFloat();
        System.out.println("Hay nhap vao chieu cao cua hinh chu nhat: ");
        float height = scanner.nextFloat();
        float dienTich = height * weight;
        System.out.println("Dien tich cua hinh chu nhat do la: " + dienTich);
    }
}
