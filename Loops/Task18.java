package src;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
//        Задача 18:
//Да се състави програма, чрез която се въвежда две числа от
//интервала [1..9].
//Програмата да извежда таблицата за умножение.
//Максималната стойност на множителите е определена от 2-те
//числа.
//Пример: 2 2
//Изход:
//1*1= 1;
//1*2= 2;
//2*1= 2;
//2*2= 4;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter two numbers between 1 and 9. Enter N1");
        int num1=sc.nextInt();
        System.out.println(" Thank you! Now enter the second number");
        int num2=sc.nextInt();

        while ((num1<1 || num1>9) || (num2<1 || num2>9)){
            System.out.println(" Enter two numbers between 1 and 9. Enter N1");
            num1=sc.nextInt();
            System.out.println(" Thank you! Now enter the second number");
            num2=sc.nextInt();

        }
        for (int i = 1; i <=num1; i++) {
            for (int j = 1; j <=num2; j++) {
                System.out.println(i+"*"+j+" ="+i*j);

            }

        }
    }
}
