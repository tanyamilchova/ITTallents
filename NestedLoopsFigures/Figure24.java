public class Figure24 {
    public static void main(String[] args) {
/*        1 2 3 4 3 2 1
          1 2 3   3 2 1
          1 2       2 1
          1           1
 */
        int rows=8;
        int stars=rows;
        int spaces=-1;

        for (int i = 0; i < rows; i++) {
            int start = 1;
            for (int j = 0; j < stars; j++) {
                System.out.print(start + " ");
                start++;
            }

            for (int j = 0; j < spaces; j++) {
                System.out.print(". ");
            }
            for (int j = 0; j < stars; j++) {
                if (i == 0 && j == 0) {
                    start--;

                } else {
                    start--;
                    System.out.print(start + " ");
                }
            }

            System.out.println();
            stars--;
            spaces += 2;
        }
    }
}
