public class Figure22 {
    public static void main(String []arg){
//        triangle with the pick downside
        //1 2 3 4 5 6 7 6 5 4 3 2 1
        //. 1 2 3 4 5 6 5 4 3 2 1
        //. . 1 2 3 4 5 4 3 2 1
        //. . . 1 2 3 4 3 2 1
        //. . . . 1 2 3 2 1
        //. . . . . 1 2 1
        //. . . . . . 1
        int rows=7;
        int stars=rows*2-1;
        int spaces=0;
        for (int i = 0; i < rows; i++) {
            int start=0;
            for (int j = 0; j < spaces; j++) {
                System.out.print(". ");
            }
            for (int j = 0; j < stars; j++) {
                if(j<stars/2+1){
                    start++;
                    System.out.print(start+" ");

                }
                else {
                    start--;
                    System.out.print(start+" ");
                }
            }
            System.out.println();
            spaces++;
            stars-=2;
        }

    }
}
