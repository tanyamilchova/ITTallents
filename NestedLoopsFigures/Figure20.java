public class Figure20 {
    public static void main(String[] args) {
        //87654321
        //7654321
        //654321
        //54321
        //4321
        //321
        //21
        //1
        int rows=8;

        for (int i = 0; i < rows; i++) {
            int start=rows-i;
            for (int j = 0; j < rows; j++) {
                if(  (i+j)<rows){
                    System.out.print(start);
                }
                start--;
            }
            System.out.println();

        }
    }
}
