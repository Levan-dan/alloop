package bai2;

public class veHinh {
    public static void main(String[] args) {
        System.out.println("hinh vuong.");
        for (int i = 1; i <= 7; i++){
            for( int j = 1; j <= 7; j++){
                System.out.print(i +""+ j + " ");
            }
            System.out.println(" ");
        }
        System.out.println("hinh tam giac");
        for(int i = 0; i < 5 ; i++){
            for (int j = 0; j < 10 ; j ++){
                if(j <= i) {
                    System.out.print(i + "" + j + "\t");
                }
            }
            System.out.println("");
        }
    }
}
