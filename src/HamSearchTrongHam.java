import java.util.Scanner;

public class HamSearchTrongHam {
    public static void main(String[] args) {
        int[] mang ={1, 2, 3, 4, 5, 6, 7};
        searchGiaTri(mang);
    }
    public static void searchGiaTri(int[] array) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap gia tri can tim trong mang.");
            int giaTriCanTim = scanner.nextInt();
            boolean check = false;
            for (int i = 0; i < array.length; i++) {
                if(giaTriCanTim == array[i]){
                    check = true;
                    break;
                }

            }
            if (check) {
                System.out.println(giaTriCanTim + " co trong mang.");
            } else {
                System.out.println("Gia tri ban tim khong co trong mang.");
            }

        }
    }

}
