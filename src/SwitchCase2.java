import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so.");
        int number = scanner.nextInt();
        int KetQua = number%2;
        switch (KetQua){
            case 0:
                System.out.println(number + " la so chan");
                break;
            default:
                System.out.println(number + " la so le");
                break;
        }
    }
}
