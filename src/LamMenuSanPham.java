import java.util.Scanner;

public class LamMenuSanPham {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Print the rectangle.");
        System.out.println("2. Print the square triangle.");
        System.out.println("3. Print the isosceles triangle.");
        System.out.println("4. Exit.");
        System.out.println("Please choose.");
        int times = scanner.nextInt();
        switch (times) {
            case 1:
                System.out.println("Rectrangle.");
                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                System.out.println("Square triangle.");
                for (int q = 1; q <= 5; q++) {
                    for (int k = 1; k <= q; k++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println(" ");
                }
                break;
            case 3:
                System.out.println("Isosceles triangle.");
                for (int g = 5; g >= 1; g--) {
                    for (int h = 1; h <= g; h++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println(" ");
                }
                break;
            case 4:
                System.exit(4);
        }
    }
}
