public class Figure23 {
    public static void main(String[]arg){
/*   1           1
     1 2       2 1
     1 2 3   3 2 1
     1 2 3 4 3 2 1
 */
        int rows=8;
        int stars=1;
        int spases=rows*2-3;

        for (int i = 0; i < rows ; i++) {
            int start =0;
            for (int j = 0; j < stars; j++) {
                start++;
                System.out.print(start+" ");
            }
            for (int j = 0; j < spases; j++) {
                System.out.print(". ");
            }
            for (int j = 0; j < stars; j++) {
                if(i==rows-1 && j==0){
                    start--;
                    continue;
                }
                System.out.print(start+" ");
                start--;
            }
            System.out.println();
            stars++;
            spases-=2;
        }

    }

}
