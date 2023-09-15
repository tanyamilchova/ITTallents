package src;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
//        Задача 24:
//Едно число X е палиндром, aко се чете еднакво отпред назад и
//отзад напред.
//Да се състави програма, която проверява дали въведено число е
//палиндром.
//Входни данни: N - естествено число от интервала [10 .. 30000].
//Пример: 17571
//Изход: числото е палиндром
//Използвайте цикъл do-while.

        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a number from 10 to 30000");
        int num=sc.nextInt();

        while (num<10 | num>30000){
            System.out.println(" Enter a number from 10 to 30000");
            num=sc.nextInt();
        }

        int countDigits =0;
        int divNum=num;


        do{
           divNum= divNum/10;
           countDigits++;
            System.out.println(divNum);
        }
        while (divNum!=0);
        System.out.println(countDigits);

        int cutNumFirst= num/ ((int)Math.pow(10,countDigits/2));
        int cutNumSecond=num% ((int)Math.pow(10,countDigits/2));
        System.out.println(cutNumFirst);
        System.out.println(cutNumSecond);

        System.out.println(countDigits+" count");

        boolean equal=true;
        if( countDigits==2){
            if(num%10==num%100){

            }
        }
        for (int i = 0; i <countDigits/2; i++) {
            int digit=(cutNumFirst / (int) Math.pow(10,(countDigits/2)-i))%10;
            int digit2=cutNumSecond%10;
            cutNumSecond=cutNumSecond/10;
            System.out.println(digit+ " 1");
            System.out.println(digit2+" 2");
//
            if(digit!=digit2){
               equal=false;
                System.out.println(" Not a palindrome");
                break;
            }
        }
        if (equal){
            System.out.println(" Palindrome");
        }

    }
}
