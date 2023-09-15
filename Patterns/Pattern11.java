public class Pattern11 {

    public static void main(String[] args) {
        /* 1                 1
           1 2             2 1
           1 2 3         3 2 1
           1 2 3 4     4 3 2 1
           1 2 3 4 5 5 4 3 2 1

         */
        int rows=5;
        int stars=1;
        int spaces=2*rows-2;
        int start=1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < stars; j++) {
                System.out.print(start+" ");
                start++;
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(". ");
            }
            for (int j = 0; j < stars; j++) {
                start--;
                System.out.print(start+" ");

            }
            System.out.println();

            stars++;
            spaces-=2;
        }

    }
}
