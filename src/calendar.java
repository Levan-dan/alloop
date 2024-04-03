import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class calendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int nam = calendar.get(Calendar.YEAR);
        // tháng luôn hiển thị từ 0-11 lên khi hiển thị ra màn hình bạn phải cộng thêm 1 để về tháng chuẩn.
        int thang = calendar.get(Calendar.MONTH);
        int ngay = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngay thang nam hien tai la: ");
        System.out.println(nam);
        System.out.println(thang + 1);
        System.out.println(ngay);


        System.out.println("Ngay thang nam sinh cua ban la: ");
        //Thành lập một mộc thời gian cố định bằng calendar.set
        calendar.set(Calendar.YEAR,2005);
        calendar.set(Calendar.MONTH,7);
        calendar.set(Calendar.DAY_OF_MONTH,8);
        //lấy giá trị ngày tháng năm bằng calendar.get giá trị sẽ đc lấy ở phần mk mới đặt lại.
        int namSinh = calendar.get(Calendar.YEAR);
        int thangSinh = calendar.get(Calendar.MONTH);
        int ngaySinh = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(ngaySinh + "/" + (thangSinh + 1) + "/" + namSinh);

        //hiển thị ngày tháng năm theo kiểu định dạng.
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        Date d = calendar.getTime();
        String s = dinhDang.format(d);
        System.out.println(s);


    }
}
