package src;

import java.util.Arrays;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
//        Задача 17:
//Да се състави програма, която извежда квадрат, чийто страни са
//оформени със знака *, а вътрешността е запълнена със въведен
//знак.
//Входни данни b - дължина на страната число от интервала
//[3..20], c - желан знак.
//Програмата да използва цикъл for.
//Пример: 4 +
//Изход:
//****
//*++*
//*++*
//****
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter a number between 3 and 20");
        int num=sc.nextInt();

        while (num<3 || num>20){
            System.out.println(" Enter a number between 3 and 20");
            num=sc.nextInt();
        }
        int stars=1;
        int spases=num-2;


            for (int i = 0; i < num; i++) {
                System.out.print(" *");
            }
            System.out.println();
            for (int i = 0; i < num-2; i++) {
                System.out.print(" *");
                for (int j = 0; j < num-2; j++) {
                    System.out.print(" .");
                }
                System.out.println(" *");
            }
            for (int i = 0; i < num; i++) {
                System.out.print(" *");
            }

    }
}
