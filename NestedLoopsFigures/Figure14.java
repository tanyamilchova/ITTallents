import java.util.Scanner;

public class Figure14 {
    public static void main(String[] args) {
//        ТРИЪГЪЛНИК С ВЪРХА НАДОЛУ
        //* * * * * * * * *
        //  * * * * * * *
        //    * * * * *
        //      * * *
        //        *
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a number");
        int num=sc.nextInt();
        int spaces=0;
        int stars=num*2-1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            spaces++;
            stars-=2;
            System.out.println();
        }
    }

}



