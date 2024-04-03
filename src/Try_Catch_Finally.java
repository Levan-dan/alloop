public class Try_Catch_Finally {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;


        try {
            int c = a/b;
            System.out.println(  "c = " + c);
        }
        catch (Exception ex){
            System.out.println("co loi nha");
            ex.printStackTrace();

        }
        System.out.println("doan code tiep theo.");
    }
}
