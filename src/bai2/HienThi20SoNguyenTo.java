package bai2;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        int times = 0;
        int start = 2;

        while (times < 20) {

            boolean check = true;
            for (int i = 2; i <= Math.sqrt(start); i++) {
                if (start % i == 0) {
                    check = false;
                    break;
                }

            }

                if (check) {
                    if (times == 19){
                        System.out.println(start);

                    }
                    times++;
                }
                start++;



        }
    }
}
