public class Pattern1 {
    public static void main(String[] args) {
/*             1 1 1
               1 1 1
               1 1 1
               1 1 1
 */
        int rows=4;
        int columns=3;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
