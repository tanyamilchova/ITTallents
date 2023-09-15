import java.util.Scanner;

public class Zvez2 {
    public static void main(String[] args) {
        //        Кaто допълнително упражнение – нарисувайте същия
////триъгълник, но незапълнен.
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        int rows = sc.nextInt();
        int stars = rows - 2;
        int spaces = 1;


        System.out.println();
        for (int i = 0; i < rows; i++) {
            if (i == 0 || i == rows - 1) {
                for (int j = 0; j < 2*rows - 3; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            } else {
                for (int j = 0; j < stars; j++) {
                    System.out.print(" *");
                }
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" .");
                }
                for (int j = 0; j < stars; j++) {
                    System.out.print(" *");
                }
                System.out.println();
                stars--;
                spaces += 2;
            }


        }
    }
}
