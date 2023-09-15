import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        /*Задача 14:
Имате предварително въведен едномерен масив, съдържащ реални
числа.
Да се състави програма, чрез която се избират само елементи от
масива със стойности от интервала [-2.99..2.99] и се отпечатват в нов
масив. Новият масив да се извежда на екрана.
Пример: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
Изход: 0.2; 0.99; 1.4; 1.2

         */
        int count=0;
        int temp=0;

        double []arr={7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2};
        for (int i=0;i< arr.length; i++) {
            if (arr[i] >= -2.99 && arr[i] <= 2.99) {
                count++;
            }
        }

        double[]arr2=new double[count];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=-2.99 && arr[i]<=2.99){
                arr2[index]=arr[i];
                index++;
            }
        }

            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[j]+" ");
            }
    }
}
