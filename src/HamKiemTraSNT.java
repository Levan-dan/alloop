import java.util.Scanner;

public class HamKiemTraSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap so can kiem tra");
        int number = scanner.nextInt();
        String kq = kiemTraSoNguyenTo(number);
        System.out.println(kq);
    }

    public static String kiemTraSoNguyenTo(int checkNumber) {
        if (checkNumber < 2) {
            return "Khong phai so nguyen to";
        } else {
            for (int i = 2; i <= Math.sqrt(checkNumber); i++) {
                if (checkNumber % i == 0) {
                    return "khong phai so nguyen to";
                }
            }
        }
        return "la so nguyen to";
    }
}

