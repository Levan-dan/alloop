public class HamTimMinTrongMang {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 1, 7, 6, 3, -7};
        int soMin = timMin(arr);
        System.out.println("Gia tri nho nhat trong mang la: " + soMin);
    }

    public static int timMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
