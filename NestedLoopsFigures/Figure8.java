public class Figure8 {
    public static void main(String[] args){
/*      8 8 8 8 8 8
        8         8
        8         8
        8         8
        8         8
        8 8 8 8 8 8
*/

            int rows=6;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if(i==0 || i==rows-1){
                    System.out.print("* ");
                }
                else {
                    if(j==0 || j==rows-1){
                        System.out.print("* ");
                    }
                    if( j>0 && j<rows-1){
                        System.out.print(". ");
                    }
                }
            }
            System.out.println();
        }
  }
    }






