public class Figure10 {
    public static void main( String[]arg){
//        88888888888888
//                    8
//                  8
//               8
//             8
//          8
//      8888888888888888
//
//
        int rows=6;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if( i==0 || i==rows-1){
                    System.out.print("* ");
                }
                else {
                    if(i+j==rows){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print(". ");
                    }
                }

            }
            System.out.println();
        }
    }
}
