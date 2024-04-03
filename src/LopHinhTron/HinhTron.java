package LopHinhTron;

public class HinhTron {
    private double bankinh;
    private String mauSac;

    public HinhTron(double bankinh, String mauSac){
        this.bankinh = bankinh;
        this.mauSac = mauSac;
    }


    public void getRadius(){
        System.out.println("Hinh tron co mau " + mauSac + " va ban kinh la: " + bankinh );
    }

    public void getAre(){
        System.out.println("dien tich hinh tron la: " + (Math.PI*Math.pow(bankinh,2)) );
    }

}
