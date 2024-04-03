public class PhuongThuc {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int sum = add(x, y);  // Gọi phương thức add và gán kết quả cho biến sum
        System.out.println("Tổng của " + x + " và " + y + " là: " + sum);
    }
}
