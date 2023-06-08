public class Pattern3 {
    public static void main(String[] args) {
      /*              010101
                      010101
                      010101
                      010101

       */
        int rows=4;
        int columns=6;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j%2==0){
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }


}
