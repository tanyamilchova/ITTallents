public class Pattern8 {
    public static void main(String[] args) {
        /*2
          2 4 2
          2 4 6 4 2
          2 4 6 8 6 4 2
          2 4 6 8 10 8 6 4 2

         */
        int rows=5;
        int stars=1;


        for (int i = 0; i < rows; i++) {
            int start=0;
            for (int j = 0; j < stars; j++) {

                if(j<(stars/2+1)){
                    start+=2;
                    System.out.print(start+" ");
                }
                else {
                    start-=2;
                    System.out.print(start+" ");
                }
            }
            System.out.println();
            stars+=2;
        }
    }
}
