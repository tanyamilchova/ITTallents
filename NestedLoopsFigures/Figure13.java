import java.util.Scanner;

public class Figure13 {
    public static void main(String[] args) {
///*      8 8 8 8 8 8
//        8  8   8  8
//        8    8    8
//        8  8   8  8
//        8 8     8 8
//        8 8 8 8 8 8
//*/
        Scanner sc=new Scanner (System.in);
        System.out.println(" Enter s nmber");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i == 0 || i == rows - 1 || j==0 || j== rows-1 || j==i ||((i+j)==rows-1)) {
                    System.out.print("x ");
                }

                    else {
                        System.out.print(". ");
                    }
                }
            System.out.println();
            }

        }
    }





