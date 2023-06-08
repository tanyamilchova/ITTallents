public class Pattern10 {
    public static void main(String[]arg){
                   /*  1
                       2 3
                       4 5 6 7
                       8 9 1 2 3 4 5 6
                       7 8 9 1 2 3 4 5 6 7 8 9 1 2 3 4
                    */
        int rows=5;
        int stars=1;
        int start=1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < stars; j++) {
                if(start==10){
                    start=1;
                }
                System.out.print(start+ " ");
                start++;
            }
            System.out.println();
            stars*=2;
        }
    }
}
