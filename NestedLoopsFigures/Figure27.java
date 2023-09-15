public class Figure27 {
    public static void main(String[] args) {
/*              1
                1  1
                1  2  1
                1  3  3  1
                1  4  6  4  1
                1  5  10  10 5  1
                1  6  15  20 15  6  1
 */
        int rows=7;
        int increment=0;
        int stars=1;
        boolean evenRow=true;

        for (int i = 0; i <rows ; i++) {
            int start=1;

            if(i%2==0){
                evenRow=false;
            }

            if(evenRow){
                for (int j = 0; j <stars; j++) {
                    if (j <= stars / 2) {
                        System.out.print(start);
                        start++;
                    }
                    else{
                        start-=2;
                        System.out.println(start);
                    }

                if(!evenRow){
                    if(j<=stars/2) {
                        System.out.print(start);

                    }
                }
            }


            }
            System.out.println();
            stars++;
        }
    }
}
