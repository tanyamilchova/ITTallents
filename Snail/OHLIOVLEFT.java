import java.util.Scanner;

public class OHLIOVLEFT {
    public static void main(String[] args) {
        //        по зададени ред и колона да се запълни матрица спираловидно като охлюв
        /*1  2  3  4  5
         12 13  14 15 6
         11 10  9  8  7

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int row=sc.nextInt();
        System.out.println("Enter columns");
        int cols=sc.nextInt();
        int[][]arr=new int[row][cols];

        int number=10;
        char direction='d';
        int i=0;
        int j=0;
        for (int k = 0; k < row * cols; k++) {
            arr[i][j]=number++;

            switch (direction){
                case 'd': i++;
                    break;
                case 'r': j++;
                    break;
                case 'u':  i--;
                    break;
                case 'l': j--;
                    break;
            }

            if (i==row || i<0 ||j==cols ||j<0 || arr[i][j]!=0){
                switch (direction){
                    case 'd': direction='r';
                    i--;
                    j++;
                    break;
                    case 'r': direction='u';
                    j--;
                    i--;
                    break;
                    case 'u': direction='l';
                    i++;
                    j--;
                    break;
                    case 'l': direction='d';
                    j++;
                    i++;
                    break;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[i].length; l++) {
                System.out.print(arr[k][l]+" ");
            }
            System.out.println();
        }
    }
}
