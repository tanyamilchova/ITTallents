import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*Задача 11:
Да се състави програма, която въвежда от клавиатурата 7 цели числа
в едномерен масив
Програмата да изведе всички числа кратни на 5, но по големи от 5.
Пример: -23, -55, 17, 75, 56, 105, 134
Изход: 75,105 - 2 числа

      */
        Scanner sc=new Scanner(System.in);
        int []arr=new int[7];
        int count=0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Enter the value for nuber " + (i + 1));
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if((arr[i]%5==0) && arr[i]>5) {
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        System.out.print("  -"+count+" numbers");


    }
}
