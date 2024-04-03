package ChuyenDoiNhietDo;

public class NhietDo {
    private double doC;
    private double doF;
    private double kenvin;

    public NhietDo(double doC){
        this.doC = doC;
    }

    public void doF(){
        doF =  9/5.0 * this.doC + 32;
        System.out.println(doC + " do C bang : " + doF + " do F.");
    }
    public void kenvin(){
        kenvin  = this.doC + 273.15;
        System.out.println(doC + " do C bang : " + kenvin + " kevin.");
    }
}
