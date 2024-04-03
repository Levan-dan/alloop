package XayDungLopDate;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ngay di");
        int day = scanner.nextInt();
        System.out.println("Nhap thang di");
        int month = scanner.nextInt();
        System.out.println("Nhap nam nua");
        int year = scanner.nextInt();

        MyDate date = new MyDate(day, month, year);
        date.disPlay();

        date.setDay(22);
        date.setMonth(12);
        date.setYear(2005);
        date.disPlay();
    }
}
