import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        /*Задача 18:
Дадени са два едномерни масива с естествени числа.
Да се състави програма, която сравнява всички числа с еднакви
индекси от двата масива и записва в трети масив, по-голямото от
двете числа.
Да се изведе съдържанието и на трите масива
Пример:
18,19,32,1,3, 4, 5, 6, 7, 8
1, 2, 3,4,5,16,17,18,27,11
Изход:
18,19,32 ,4,5,16,17,18,27,11

         */

        int[]arr={1,2,23,4,5,20,20,20,20};
        int[]arr1={2,4,6,8,10,15,15,15};
        int maxLenght=0;
        int minLenght;
        if(arr.length>arr1.length){
            maxLenght=arr.length;
            minLenght=arr1.length;
        }
        else {
            maxLenght=arr1.length;
            minLenght=arr.length;
        }
        int[]arrResult=new int[maxLenght];
        for (int i = 0; i < maxLenght; i++) {
            if (i<minLenght){
                if(arr[i]>arr1[i]) {
                    arrResult[i] = arr[i];
                }
                else {
                    arrResult[i]=arr1[i];
                }
            }
            else {
                if(maxLenght== arr1.length) {
                    arrResult[i] = arr1[i];
                }
                else arrResult[i]=arr[i];
            }
        }
//        System.out.println(Arrays.toString(arrResult));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arrResult.length; i++) {
            System.out.print(arrResult[i]+" ");
        }
    }

}
