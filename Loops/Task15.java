import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
//
//    }Задача 15: Да се състави програма, която да изчисли сумата на
//    всички числа от 1 до въведено число N.
//    Пример: 5
//    Изход: 15

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N");
        int num=sc.nextInt();
        int sum=0;

        for (int i = 0; i < num+1; i++) {
            sum+=i;
        }
        System.out.println("The sum of numbers from 1 to "+num+" is "+sum);

    }
}