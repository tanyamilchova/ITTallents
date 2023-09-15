public class Figure17 {
    public static void main(String[] args) {
/*   1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5
 */
        int rows=5;
        int start=1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i>j || i==j){
                    System.out.print(start+j);
                }
            }
            System.out.println();
        }
    }
}
