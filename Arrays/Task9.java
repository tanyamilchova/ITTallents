import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /*Задача 9:
Напишете програма, в която потребителя въвежда масив, след което
елементите на масива се обръщат в обратен ред (Целта не е масива да
се отпечата в обратен ред, ами първо да се обърне, след което да се
отпечата в нормален ред). Пробвайте да решите задачата първо с един
допълнителен масив и после без да използвате друг масив.

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int num=sc.nextInt();
        int []arr=new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the value for position "+(i+1));
            arr[i]=sc.nextInt();
        }

        int []mass=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mass[i]=arr[arr.length-(1+i)];
        }

        System.out.println("The elements of arr inverted are :");

        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-(1+i)];
            arr[arr.length-(1+i)]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        }
    }

