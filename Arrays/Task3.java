import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*Задача 3:
Да се въведе число, след което да се създаде масив с 10
елемента по следния начин:
Първите 2 елемента на масива са въведеното число.
Всеки следващ елемент на масива е равен на сбора от
предишните 2 елемента в масива.
След това изведете масива .

         */
        Scanner sc = new Scanner(System.in);
            int num;
        do {
            System.out.println("enter a positive number");
            num = sc.nextInt();
        }
        while (num <= 0) ;
        System.out.println(num + "num");

        int[] arr=new int[10];
        arr[0]=num;
        arr[1]=num;

        System.out.print(arr[0]+" ");
        System.out.print(arr[1]+" ");

        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
            System.out.print(arr[i]+" ");
        }

    }
}



