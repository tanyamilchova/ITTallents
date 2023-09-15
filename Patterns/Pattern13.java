public class Pattern13 {
    public static void main(String[] args) {
        /*           1
                     2 4
                     7 11 16
                     22 29 37 46
                     56 67 79 92 106
                       */
        int rows=5;
        int stars=1;
        int start=1;
        int add=0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < stars; j++) {
                start=start+add;
                add++;

                System.out.print(start+" ");
            }
            System.out.println();
            stars++;
        }
    }
}
