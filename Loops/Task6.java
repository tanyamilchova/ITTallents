import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
//        Задача 6: Да се прочете число от екрана(конзолата) и да се
//изведе сбора на всички числа между 1 и въведеното число.
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        for (int i = 0; i < num; i++) {
            sum=sum+i+1;
//            System.out.println(i+1);
        }
        System.out.println("The sum is "+sum);
    }
}
