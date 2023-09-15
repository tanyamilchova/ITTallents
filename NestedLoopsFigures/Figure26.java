package src;

public class Figure26 {
    public static void main(String[] args) {
/*                       1
                      1  2  1
                   1  2  4  2  1
                1  2  4  8  4  2  1
             1  2  4  8 16  8  4  2  1

 */
        int rows=5;
        int spaces=rows-1 ;
        int stars=1;
        int power=0;


        for (int i = 0; i < rows; i++) {
            int start=1;
            for (int j = 0; j < spaces; j++) {
                System.out.print( ".  ");
            }
            for (int j = 0; j < stars; j++) {
                if(j<stars/2){
                    System.out.print(start+" ");
                    start*=2;
                }
                else {
                    System.out.print(start+" ");
                    start/=2;
                }
            }
            System.out.println();
            spaces--;
            stars+=2;
        }


    }
}
