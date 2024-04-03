package PhuongTienGiaoThong;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class PhuongTienGT {
    Scanner scanner = new Scanner(System.in);
    private String hangXe;
    private double giaTri;
    private int bienSoXe;


    public PhuongTienGT() {
    }

    public PhuongTienGT(String hangXe, double giaTri, int bienSoXe) {
        this.hangXe = hangXe;
        this.giaTri = giaTri;
        this.bienSoXe = bienSoXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public double getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(double giaTri) {
        this.giaTri = giaTri;
    }

    public int getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(int bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public void nhapDuLieu() {
        System.out.print("Nhap hang xe cua ban.");
        hangXe = scanner.nextLine();
        System.out.print("Nhap gia tri cua xe.");
        giaTri = new Scanner(System.in).nextDouble();
        System.out.print("Nhap bien so xe cua ban.");
        bienSoXe = new Scanner(System.in).nextInt();

    }

}