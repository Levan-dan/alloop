public class OOP_Buoi1 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.hienThiThongTin();
        SinhVien sv2 = new SinhVien();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("khang", 22);
        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien("Hoi");
        sv4.hienThiThongTin();

//        get
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getAge());

//        set
        sv4.setHoTen("Ha");
        sv4.setAge(25);
        sv4.hienThiThongTin();
        sv4.inRaKetQua();

//        phuong thuc co gia tri tra ve
        int tong = sv4.hienThi(4, 5);
        System.out.println(tong);

//        tong so trong mang
    double ketQua = sv4.tinhTong(1, 2, 3, 4, 5, 6);
        System.out.println(ketQua);

    }


}
