public class Pattern7 { /*45 ta  */
    public static void main(String[] args) {
/*               1
                 2 3
                 4 5 6
                 7 8 9 10
                 1112131415

 */
        int rows=5;
        int start=1;
        int stars=1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < stars; j++) {
                System.out.print(start);
                start++;
            }
            System.out.println();
            stars++;
        }
    }
}
