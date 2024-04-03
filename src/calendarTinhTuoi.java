import java.util.Calendar;
import java.util.Scanner;

public class calendarTinhTuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ngay,thang,nam,tuoi;
        System.out.println("Vui long nhap ngay sinh.");
        ngay = scanner.nextInt();
        System.out.println("Vui long nhap thang sinh.");
        thang = scanner.nextInt();
        System.out.println("Vui long nhap nam sinh.");
        nam = scanner.nextInt();


        Calendar birthday = Calendar.getInstance();
        birthday.set(nam, thang - 1, ngay);
//        birthday.set(Calendar.YEAR,nam);
//        birthday.set(Calendar.MONTH,thang - 1 );
//        birthday.set(Calendar.DAY_OF_MONTH,ngay);
        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);
        int thangSinh = birthday.get(Calendar.MONTH);
        int namSinh = birthday.get(Calendar.YEAR);
        System.out.println("Ngay thang nam sinh la: " + ngaySinh + "/" + (thangSinh + 1) + "/" + namSinh);

        Calendar now = Calendar.getInstance();
        int namHienTai = now.get(Calendar.YEAR);
        tuoi = namHienTai - namSinh;
        System.out.println("Nam nay ban "+ tuoi + " tuoi.");


        }

    }

