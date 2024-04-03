import java.util.Scanner;

public class VungOiMoRa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passWord;
        System.out.println("Nhap PassWord:");
        do{
           passWord = scanner.nextLine();
        } while (!passWord.equals("vung oi mo ra"));
    }
}
