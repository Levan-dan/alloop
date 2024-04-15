package bai4;

import java.util.Scanner;

public class Ham {
    /** Main method */
    public static void main(String[] args) {
        // Declare and initialize variables
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before invoking the swap method, num1 is " +
                num1 + " and num2 is " + num2);

        // Invoke the swap method to attempt to swap two variables
        swap(num1, num2);

        System.out.println("After invoking the swap method, num1 is " +
                num1 + " and num2 is " + num2);
    }

    /** Swap two variables */
    public static void swap(int n1, int n2) {
        System.out.println("\tInside the swap method");
        System.out.println("\t\tBefore swapping, n1 is " + n1
                + " and n2 is " + n2);

        // Swap n1 with n2
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\t\tAfter swapping, n1 is " + n1
                + " and n2 is " + n2);
    }

    public static class HamChuyenDoiCF {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int tuyChon;
            do {
                System.out.println("MeNu:");
                System.out.println("0. Exit.");
                System.out.println("1. Chuyen tu do F sang do C.");
                System.out.println("2. Chuyen tu do C sang do F.");
                System.out.println("Vui long chon phuong thuc chuyen.");
                 tuyChon = scanner.nextInt();
                switch (tuyChon) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        System.out.println("Vui long nhap do F.");
                        double soDoF = new Scanner(System.in).nextDouble();
                        double kq = doC(soDoF);
                        System.out.println(soDoF + " do F = " + kq + " do C");
                        break;
                    case 2:
                        System.out.println("Vui long nhap do C.");
                        double soDoC = new Scanner(System.in).nextDouble();
                        double kq1 = doF(soDoC);
                        System.out.println(soDoC + " do C = " + kq1 + " do F.");
                        break;
                }
            }while (tuyChon != 0);

        }

        public static double doC(double doF) {
            double celsius = (5.0 / 9) * (doF - 32);
            return celsius;
        }

        public static double doF(double doC) {
            double fahrenheit = (9.0 / 5) * doC + 32;
            return fahrenheit;
        }
    }
}
