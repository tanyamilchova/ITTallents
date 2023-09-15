public class Figure5 {
    public static void main(String[] args) {
/* * * * * * * *
   * * * * * *
   * * * * *
   * * * *
   * * *
   * *
   *
 */
        int rows=7;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if( i==j || i<j){
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }

}
