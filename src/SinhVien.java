public class SinhVien {
    //    các thuộc tính
    private String hoTen;
    private int age;

    //contrucstor để truyền du liệu
    public SinhVien() {
        hoTen = "Dan";
        age = 18;
    }

    public SinhVien(String hoTen, int age) {
        this.hoTen = hoTen;
        this.age = age;
    }

    //    get/set tronh OOP
//    get : dùng để thấy được thông tin ở dạng private.
    public String getHoTen() {
        return hoTen;
    }

    public int getAge() {
        return age;
    }

    //    set : dùng để thay đổi giá trị của biến
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }

    //    phương thức
    public void hienThiThongTin() {
        System.out.println(hoTen + " : " + age);
    }

    public int hienThi(int a, int b) {
        return a + b;
    }

    //    check diem
    private boolean checkDiem() {
        return this.age > 50;
    }

    public void inRaKetQua() {
        if (checkDiem()) {
            System.out.println("ban da gia");
        } else {
            System.out.println("ban con non lam");
        }
    }

    public double tinhTong(double... arr) {
        double tongDiem = 0.0;
        for (double x : arr) {
            tongDiem += x;
        }
        return tongDiem;
    }
}
