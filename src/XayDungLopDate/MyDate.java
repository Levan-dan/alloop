package XayDungLopDate;

public class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void disPlay(){
        System.out.println("Ngay thang nam la : " + day + "/" + month + "/" + year);
    }



    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
}
