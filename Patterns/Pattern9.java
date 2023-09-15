public class Pattern9 {   /* 44 ta*/
    public static void main(String[] args) {
        /* 1
           3  2
           4  5  6
           10  9  8  7
           11  12  13  14  15
         */
        int rows = 5;
        int start = 1;
        int stars = 1;

        for (int i = 0; i < rows; i++) {
            if(i%2==0){
                start = start+i;
            }
            if (i%2!=0){
                start=start +stars;
            }
            for (int j = 0; j < stars; j++) {
                if (i % 2 == 0) {
                    System.out.print(start+" ");
                    start++;
                }
                else {
                    start--;
                    System.out.print(start+" ");
                }
            }
                System.out.println();
            stars++;
        }
    }
}
