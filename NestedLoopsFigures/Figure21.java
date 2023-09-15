import java.util.Scanner;

public class Figure21 {
    public static void main(String[] args) {
//        //        ТРИЪГЪЛНИК НАГОРЕ
        /*            1
                    1 2 1
                  1 2 3 2 1
                1 2 3 4 3 2 1
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        int num = sc.nextInt();
        int spaces = num - 1;
        int stars = 1;

        for (int i = 0; i < num; i++) {
            int start = 0;
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < stars; j++) {
                if (j < stars / 2 + 1) {
                    start++;
                    System.out.print(start + " ");
                }
                    else {
                        start--;
                        System.out.print(start+" ");
                    }
                }
            spaces--;
            stars += 2;
                System.out.println();
            }

        }

}

