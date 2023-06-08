import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
//        Задача 25:
//Да се направи програма, която по дадено число N, да изчислява
//N!, т.е. 1*2*3*4...*N.
//Пример: 5
//Изход: 120
//Използвайте цикъл do-while.
        Scanner sc=new Scanner ( System.in);
        System.out.println("Enter a number ");
        long num=sc.nextLong();
        long factorial=1l;

        do{
            factorial*=num;
            num=num-1;
        }
        while (num>1);
        System.out.println("The factorial is "+factorial);
    }
}
