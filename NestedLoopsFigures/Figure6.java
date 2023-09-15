public class Figure6 {
    public static void main( String []args){
/*   * * * * * *
       * * * * *
         * * * *
           * * *
             * *
               *
 */
        int rows=6;
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j < rows; j++) {
                if( i>j|| i>j){
                    System.out.print("  " );
                }
                else {
                    System.out.print(" *");
                }
            }
            System.out.println();

        }
    }
}
