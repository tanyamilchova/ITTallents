package src;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
//        Задача 19: Да се състави програма, чрез която по въведено
//естествено число от интервала [10..99] се извежда поредица
//числа, при спазване на следните изисквания:
//1) ако предходното число е NEчетно се извежда 0.5*числото;   НЕЧЕТНО
//2) ако предходното число е (не )четно се извежда 3*числото +1. ЧЕТНО
//Извеждането продължава докато не се получи стойност 1.
//Пример: 11
//Изход: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 10 and 99 ->N");

        int num = sc.nextInt();
        while (num < 10 || num > 99) {
            System.out.println("Enter a number between 10 and 99 ->N");
            num = sc.nextInt();
        }

        boolean even = false;


            while (num>1) {
                if ((num - 1) % 2 == 0) {
                    num=(num*3)+1;
                    System.out.println(num);
                }
                if((num-1)%2!=0){
                    num=num/2;
                    System.out.println(num);
                }

            }

}
}
