import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
//        Khai bao bien so nguyen RANDOM co gia tri tra ve bat ky trong khoang 50<x<60.
//        Neu chung ta de 1 gia tri trong RANDOM.NEXTINT(VALUE) thi se tra ve gia tri bat ky tu 0<x<value.
        int soNguyen = random.nextInt(50,60);
        System.out.println(soNguyen);
    }
}
