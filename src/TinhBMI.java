import java.util.Scanner;

public class TinhBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        float weight = scanner.nextFloat();
        System.out.println("Enter your height: ");
        float height = scanner.nextFloat();
        double BMI = weight / Math.pow(height, 2);
        System.out.println( " bmi la : " + BMI);
        if(BMI==20){
            System.out.println("You are fine.");

        }else if(BMI<20){
            System.out.println("You are old");

        }else{
            System.out.println("You are fat");
        }
    }
}
