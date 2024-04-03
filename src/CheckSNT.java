import java.util.Scanner;

public class CheckSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        while(true){
            System.out.println("Moi dien vao mot so nguyen.");
            a = scanner.nextInt();
            while (a <= 0) {
                System.out.println("nhap lai a");
                a = scanner.nextInt();
            }
            System.out.println("ban da nhap a thanh cong a = " + a);
            int demUoc = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    demUoc ++;
                }
            }

                if(demUoc == 2){
                    System.out.println(a + " la so nguyen to.");
                }else{
                    System.out.println(a + " khong phai la so nguyen to.");
                }


            System.out.println("ban co muon hoat khong, bam y de thoat.");
            String traLoi = new Scanner(System.in).nextLine();
            if(traLoi.equals("y") || traLoi.equals("Y")){
                break;
            }

        }
    }
}
