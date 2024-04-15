package bai3;

public class TongDuongCheoTrongMang {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {1, 4, 3, 1},
                {2, 3, 1, 4},
                {2, 6, 3, 1}
        };
        System.out.println("Tren duong cheo co cac phan tu sau: ");
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(i == j ){
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println(" ");
        System.out.println("Tong cac phan tu cua duong cheo do la: ");
        int sumCheo = 0;
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(i == j ){
                   sumCheo += array[i][j];
                }
            }
        }
        System.out.println(sumCheo);
    }
}
