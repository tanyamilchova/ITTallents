import java.util.Scanner;

public class Figure16 {
    public static void main(String[] args) {
//        КВАДРАТ С ВЪРХА НАГОРЕ/ РОМБ
        // . . *
        // . * * *
        // * * * * *
        // . * * *
        // . . *
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter an odd  number");
        int rows = sc.nextInt();
        while (rows%2==0){
            System.out.println( "  Enter an odd  number");
            rows=sc.nextInt();
        }

        int spases = rows / 2;
        int stars = 1;
        int downStars=rows-2;
        int downSpaces=1;


        for (int i = 0; i < rows/2+1; i++) {
            for (int j = 0; j < spases; j++) {
                    System.out.print(". ");
                }
                for (int j = 0; j < stars; j++) {
                    System.out.print("* ");
                }
            System.out.println();
                spases--;
                stars+=2;
            }

        for (int i = 0; i < rows/2; i++) {
            for (int j = 0; j < downSpaces; j++) {
                System.out.print(". ");
            }
            for (int j = 0; j < downStars; j++) {
                System.out.print("* ");
            }
            System.out.println();
            downSpaces++;
            downStars-=2;
        }
    }
}
