public class Pattern12 {
    public static void main(String[] args) {
        /*      1
                2 6
                3 7 10
                4 8 11 13
                5 9 12 14 15

      */

        int rows=5;
        int stars=1;


        for (int i = 0; i < rows; i++) {
            int start=i+1;
            int add=4;
            for (int j = 0; j < stars; j++) {
                System.out.print(start+" ");
                start+=add;
                add--;
            }
            System.out.println( );
            stars++;

            }

    }
}
