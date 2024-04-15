package bai4;

public class HamTongDuongCheoTrongMang {
    public static void main(String[] args) {
        int[][] mang = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {4, 5, 9, 2},
                {5, 1, 4, 3}
        };
        int truyenMang = tongDuongCheo(mang);
        System.out.println(truyenMang);
    }
    public static int tongDuongCheo(int[][] array){
        int sumCheo = 0;
        for(int i =0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if(i == j){
                    sumCheo += array[i][j];
                }

            }

        }
        return sumCheo;
    }
}
