public class Figure12 {
    public static void main(String[]arg){
/*     x x x x x
       . x . x .
       . . x . .
       . x . x .
       x x x x x
 */
        int rows=5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if( i==0 || i== rows-1){
                    System.out.print("x ");
                }
                else {
                    if( i==j || (i+j)==rows-1){
                        System.out.print("x ");
                    }
                    else {
                        System.out.print(". ");
                    }
                }
            }
            System.out.println();
        }

    }
}
