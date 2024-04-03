import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tuy y");

        int number = scanner.nextInt();
        switch(number) {
            case 1:
                System.out.println("Bạn đã chọn lựa chọn 1");
                break;
            case 2:
                System.out.println("Bạn đã chọn lựa chọn 2");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
    }
}
