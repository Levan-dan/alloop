package bai2;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int number = 2;
        while (number < 100) {
            if (checkPrime(number)) {
                System.out.println("Lan lap thu "  + ": " + number);
            }
            number++;
        }
    }

    private static boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
