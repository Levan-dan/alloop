public class stringBuilderJava {
    public static void main(String[] args) {
        StringBuilder chuoi = new StringBuilder();
//        ta them gia tri vao "chuoi" co the viet luon trong new StringBuilder(" ...") roi them cung dc. Nhu o tren la "chuoi" cua chung ta dang khong co gia tri.
        chuoi.append("Xin chao cac ban, ");
        chuoi.append("cac ban co khoe khong.");
        System.out.println(chuoi);


//        chèn gia trị vao chuoi.
        chuoi.insert(2,"dumamay");
        System.out.println(chuoi);


//        Xoá giá trị trong chuoi. Chuỗi sẽ đc xóa từ start cho đến end - 1.
        chuoi.delete(4,9);
        System.out.println(chuoi);


//        in ra độ dài của chuỗi.
        System.out.println(chuoi.length());
    }
}
