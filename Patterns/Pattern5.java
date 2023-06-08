public class Pattern5 {
    public static void main(String[] args) {
        //55555
//54444
//54333
//54322
//54321
        int row = 5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i >j || i == j) {
                    System.out.print(row - j);
                } else {
                    System.out.print(row - i);
                }
            }
            System.out.println();
        }
    }
}
