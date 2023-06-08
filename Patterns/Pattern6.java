public class Pattern6 {
    public static void main(String[] args) {
        /* 1
           0 1
           0 1 0
           1 0 1 0
           1 0 1 0 1
         */

        int rows=5;
        int stars=1;
        int start=1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < stars; j++) {
                if (start == 0) {
                    System.out.print(start);
                    start++;
                }
                else  {
                    System.out.print(start);
                        start--;
                    }
                }
            stars++;
            System.out.println();
            }
    }
}

