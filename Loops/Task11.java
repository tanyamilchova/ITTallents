import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
//        Задача 11: Въведете число N чрез конзолата и изкарайте като
//резултат следния триъгълник с височина N:
//   *
//  ***
// *****
//.................
//Кaто допълнително упражнение – нарисувайте същия
//триъгълник, но незапълнен.
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a number");
        int rows=sc.nextInt();
        int spase=rows-1;
        int star =1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < spase; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print(" *");
            }
            System.out.println();
            spase--;
            star+=2;
        }


        }

    }

