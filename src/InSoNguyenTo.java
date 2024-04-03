public class InSoNguyenTo {
    public static void main(String[] args) {
        int number = 1;
        int number1 = 2;
        while (number <= 20) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number1); i++) {
                if (number1 % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number1 + " ");
                number++;
            }
            number1++;
        }
    }
}
