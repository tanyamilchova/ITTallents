public class Figure19 {
    public static void main(String[] args) {
/*                1
                2 1
              3 2 1
            4 3 2 1
          5 4 3 2 1
 */
        int row=5;
        int start=1;
        for (int i = 0; i<row ; i++) {
            for (int j =0; j<row ; j++) {

                if( (i+j)>=row-1 ) {
                    System.out.print(start);
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
