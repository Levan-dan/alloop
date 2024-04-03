package ChuyenDoiNhietDo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap do C.");
        double doC = scanner.nextDouble();
        NhietDo nhietDo = new NhietDo(doC);
       nhietDo.doF();
       nhietDo.kenvin();
    }
}
