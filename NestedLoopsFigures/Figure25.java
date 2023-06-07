public class Figure25 {
    public static void main(String[] args) {
/*                        1
                       2  3  2
                    3  4  5  4  3
                 4  5  6  7  6  5  4
              5  6  7  8  9  8  7  6  5
           6  7  8  9  0  1  0  9  8  7  6
        7  8  9  0  1  2  3  2  1  0  9  8  7
     8  9  0  1  2  3  4  5  4  3  2  1  0  9  8

 */
        int rows=8;
        int spaces=rows-1;
        int stars=1;
        int start=0;
        boolean zero=false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(". ");
            }
            for (int j = 0; j < stars; j++) {

                if(j<=stars/2){
                    if(start==9){
                        start=-1;
                    }
                    start++;
                    System.out.print(start+" ");
                }
                else {
                    if(start==0){
                        start=10;
                    }
                    start--;
                    System.out.print(start+" ");
                }
            }
            System.out.println();
            spaces--;
            stars+=2;

        }
    }
}
