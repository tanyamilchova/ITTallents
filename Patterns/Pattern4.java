public class Pattern4 {
    public static void main(String[] args) {
        /*   111111
             100001
             100001
             111111
         */
        int rows=4;
        int columns=6;
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < columns; j++) {
                if(i==0 || i==rows-1 || j==0||j==columns-1 ){
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
