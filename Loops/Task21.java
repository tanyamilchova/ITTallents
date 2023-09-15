package src;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
//        Задача 21:
//Дадено е наредено тесте карти.
//Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама,
//Поп, Асо.
//Наредбата по цвят на картите е: спатия, каро, купа, пика.
//Да се създаде програма, чрез която се въвежда N - число от
//интервала [1..51] и се извеждат въведения номер карта и
//останалите по-големи карти от тестето.
//Пример: 47.
//Изход: Поп купа, Поп пика, Асо спатия, Асо каро, Асо купа, Асо
//пика
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter N between 1 and 52");
        int num = sc.nextInt();

        while (num < 1 || num > 52) {
            System.out.println(" Enter N between 1 and 52");
            num = sc.nextInt();
        }
        for (int i = num; i <= 52; i++) {
            int cardNum = (i-1) / 4+1;
            int CardSuit=i%4;

            switch (cardNum){
            case 1:
                System.out.print(" 2ка");
                break;
            case 2:
                System.out.print(" 3ка");
                break;
            case 3:
                System.out.print(" 4ка");
            case 4:
                System.out.print(" 5ца");
                break;
            case 5:
                System.out.print(" 6ца");
                break;
            case 6:
                System.out.print(" 7ца");
                break;
            case 7:
                System.out.print(" 8ца");
            case 8:
                System.out.print(" 9ка");
                break;
            case 9:
                System.out.print(" 10ка");
            case 10:
                System.out.print(" Вале");
                break;
            case 11:
                System.out.print(" Дама");
                break;
            case 12:
                System.out.print(" Поп");
                break;
            case 13:
                System.out.print(" Асо");

        }

        switch (CardSuit) {
            case 1:
                System.out.print("Спатия");
                break;
            case 2:
                System.out.print("Каро");
                break;
            case 3:
                System.out.print("Купа");
                break;
            case 0:
                System.out.print("Пика");
                break;
            }
        }
    }
}