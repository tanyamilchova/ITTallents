public class Pattern2 {
    public static void main(String[] args) {
/*        1111
          0000
          1111
          0000
 */
        int rows=4;
        int columns=4;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(i%2!=0) {
                    System.out.print("0");
                }
                else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
