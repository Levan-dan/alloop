package bai2;

public class In20SoNguyenTo {
    public static void main(String[] args) {
                int count = 0;
                int number = 2;

                System.out.println("20 số nguyên tố đầu tiên là:");
                while (count < 20) {
                    boolean isPrime = true;
                    for (int i = 2; i <= Math.sqrt(number); i++) {
                        if (number % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.print(number + " ");
                        count++;
                    }
                    number++;
                }
            }
        }



