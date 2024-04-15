package bai2;

import java.util.Scanner;

public class MenuSanPham {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Hien hinh tan giac.");
        System.out.println("2.Hien hinh vuong");
        System.out.println("3.hien hinh chu nhat.");
        System.out.println("xin moi chon");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("hinh tam giac");
                System.out.println("* * * * * *");
                System.out.println("* * * * ");
                System.out.println("* * ");
                System.out.println("* ");
                break;
            case 2:
                System.out.println("hinh vuong");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                break;
            case 3:
                System.out.println("hinh chu nhat");
                System.out.println("* * * * * * * * * *");
                System.out.println("* * * * * * * * * *");
                System.out.println("* * * * * * * * * *");
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("chon khong phu hop");
                break;


        }
    }
}