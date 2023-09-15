import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /*Задача 10:
Да се състави програма, чрез която се въвеждат 7 цели числа в
едномерен масив.
Програмата да изведе числото, което е най-близко до средната
стойност на въведените числа.
Пример: 1,2,3,4,5,6,7
Изход: средна стойност 4, най-близка стойност 4

         */
        Scanner sc=new Scanner(System.in);
        int closestValue=0;
        int average=0;
        int sum=0;
        int[]arr=new int[7];


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element"+ (i+1));
            arr[i]=sc.nextInt();

            sum+=arr[i];
            average=sum/(arr.length);
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == args.length - 1) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");


        closestValue=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if( (Math.abs(closestValue-average) >Math.abs(arr[i]-average))){
                closestValue=arr[i];
            }
        }
        System.out.println("The average is "+average);
        System.out.println("The closest number to average is "+closestValue);

    }
}
