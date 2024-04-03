import java.util.Scanner;

public class TimUocChung {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a:");
        a = Math.abs(scanner.nextInt());
        System.out.println("Nhap vao so b:");
        b = Math.abs(scanner.nextInt());
        if (a == 0 || b == 0) {
            System.out.println("khong co uoc chung.");
            return;
        }

        int uocChung = 1;
        for (int i = 1; i < a && i < b; i++) {
            if (a % i == 0 && b % i == 0) {
                uocChung = i;
            }
        }
        System.out.println("Uoc chung cua hai so " + a + " va " + b + " la:" + uocChung);
    }
}
