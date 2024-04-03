import java.util.Scanner;

public class DanhGiaNangLuc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float diemChuyenCan,diemGiuaKy,diemCuoiky;
        System.out.println("Nhap vao diem chuyen can cua ban");
        diemChuyenCan = scanner.nextFloat();
        System.out.println("Nhap vao diem giu ky cua ban");
        diemGiuaKy = scanner.nextFloat();
        System.out.println("Nhap vao diem cuoi ky cua ban");
        diemCuoiky = scanner.nextFloat();
        float diemTrungBinh = (diemChuyenCan + diemGiuaKy + diemCuoiky)/3;
        if(diemTrungBinh >= 8.5){
            System.out.println("loai A");
        } else if (diemTrungBinh >= 7) {
            System.out.println("loai B");

        } else if (diemTrungBinh >= 5.5) {
            System.out.println("loai C");

        } else if (diemTrungBinh >= 4) {
            System.out.println("loai D");
        }else {
            System.out.println("loai F");
        }

    }
}
