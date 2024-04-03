public class TimMaxTrongMang2Chieu {
    public static void main(String[] args) {
        int[][] mangHaiChieu = {
                {1, 4, 7, 2},
                {2, 5, 8, 4},
                {11, 24, 10, 5}
        };
int max = mangHaiChieu[0][0];
        for (int i = 0; i < mangHaiChieu.length; i++) {
            for (int j = 0; j < mangHaiChieu[i].length; j++) {
                if(mangHaiChieu[i][j] > max){
                    max = mangHaiChieu[i][j];
                }

            }

        }
        System.out.println("Gia tri lon nhat trong mang hai chieu la:");
        System.out.println(max + " ");
    }
}

