import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*Задача 2:
Нека по въведен масив да се конструира нов, като половината му
елементи са точно като на оригиналния, а другите да са тези
елементи, но в обратен ред. Последно, да се изведе новия масив
на екрана.

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size= sc.nextInt();
        int[]arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" Enter the value for number "+(i+1));
            arr[i]=sc.nextInt();
        }
//        int[]arr={1, 7, 6, 80, 15,9};
        int[] arrDouble=new int[arr.length*2];
        int j=1;
        for (int i = 0; i < arrDouble.length; i++) {
            if(i<arrDouble.length/2){
                arrDouble[i]=arr[i];
            }
            else {
                arrDouble[i]=arr[arr.length-j];
                j++;
            }
        }
        for (int i = 0; i < arrDouble.length; i++) {
            System.out.print(arrDouble[i]+" ");
        }



    }
}
