import java.util.Scanner;

public class Figure15 {
    public static void main(String[] args) {
//        ТРИЪГЪЛНИК НАГОРЕ
        //        *
        //      * * *
        //    * * * * *
        //  * * * * * * *
        //* * * * * * * * *
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a number");
        int num=sc.nextInt();
        int spaces=num-1;
        int stars=1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            spaces--;
            stars+=2;
            System.out.println();
        }
    }
}
