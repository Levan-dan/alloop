import java.util.Scanner;

public class kyTuChar {
    public static void main(String[] args) {
        char kyTu = 'a';
//        Khi khởi tạo một ký tự chúng ta phải đặt trong ' ' thay vì " " vì " " chỉ dùng cho chuỗi.
        System.out.println("Ky tu ban vua nhap la: " + kyTu);


//        So sánh ký tự
        System.out.println(Character.compare('a','a'));



//        Lấy ký tự từ người nhập. cach1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ky tu ban muon ");
        String word = scanner.nextLine();
        char kyTuMoi = word.charAt(0);
        System.out.println("Ky tu ban vua nhap la: " + kyTuMoi);



//      Lấy ký tự từ người nhập. cach2
        char kyTuTiep = scanner.next().charAt(0);
        System.out.println("ky tu tiep theo ban vua nhap la : " + kyTuTiep);




//        Kiểm tra ký tự
        char kt1 = 'a';
        char kt2 = 'A';
        char kt3 = ' ';
        char kt4 = '1';
        System.out.println(Character.isDigit(kt4));
        System.out.println(Character.isWhitespace(kt3));
        System.out.println(Character.isLetter(kt1));
        System.out.println(Character.isLowerCase(kt1));
        System.out.println(Character.isUpperCase(kt2));


    }
}
