public class HamTongCotTrongMang {
    public static void main(String[] args) {
        int[][] mang = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        tongCotTrongMang(mang);
    }
    public static void tongCotTrongMang(int[][] array){
        int sumCot = 0;
    for(int i = 0; i < array.length; i++){
        sumCot += array[i][0];
    }
        System.out.println("Tong cua cot dau tien trong mang la: " + sumCot);
    }
}
