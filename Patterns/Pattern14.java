public class Pattern14 {
    public static void main(String[] args) {
        /*
         *
         * 1 *
         * 1 2 1 *
         * 1 2 3 2 1 *
         * 1 2 3 4 3 2 1 *
         * 1 2 3 4 5 4 3 2 1 *
         * 1 2 3 4 5 6 5 4 3 2 1 *
         * 1 2 3 4 5 4 3 2 1 *
         * 1 2 3 4 3 2 1 *
         * 1 2 3 2 1 *
         * 1 2 1 *
         * 1 *
         *
         */
        int rows = 11;
        if (rows % 2 == 0) {
            System.out.println(" The number for rows should be odd");
        }

        int stars = 1;
        int downStars = rows-1;
        boolean upperPart = true;
        System.out.println("* ");

        for (int i = 0; i < rows / 2 + 1; i++) {
            int start = 0;

            System.out.print("* ");

            for (int j = 0; j < stars; j++) {
                if (j < (stars / 2) + 1) {
                    start++;
                    System.out.print(start + " ");
                } else {
                    start--;
                    System.out.print(start + " ");
                }
            }
            System.out.println("* ");
            stars += 2;

        }

        for (int i = 0; i < rows / 2; i++) {
            System.out.print("* ");
            int start = 0;

            for (int j = 0; j <downStars-1; j++) {
                if (j < (downStars / 2) ) {
                    start++;
                    System.out.print(start + " ");
                } else {
                    start--;
                    System.out.print(start + " ");
                }

            }
            System.out.print("* ");
            System.out.println();
            downStars -= 2;
        }
        System.out.print("* ");
        System.out.println();
    }
}
