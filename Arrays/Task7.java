public class Task7 {
    public static void main(String[] args) {
        /*Задача 7:
Напишете програма, която първо чете масив и после създава нов
масив със същия размер по следния начин: стойността на всеки
елемент от втория масив да е равна на сбора от предходния и
следващият елемент на съответния елемент от първия масив. Първият
и последният елемент на втория масив трябва да си останат равни на
първият и последният от елемент от първия масив.
Да се изведе получения масив.
         */

        int[]arr={1,2,3,4,5};
        int[]arrNew=new int[arr.length];
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
        System.out.println();
        System.out.print("[");
        for (int i = 0; i < arrNew.length; i++) {
            if(i==0 || i== arrNew.length-1){
                arrNew[i]=arr[i];
            }
            else {
                arrNew[i]=arr[i-1]+arr[i+1];
            }
            if(i== arrNew.length-1){
                System.out.print(arrNew[i]+" ");
            }
            else {
                System.out.print(arrNew[i]+", ");
            }
        }
        System.out.print("]");

    }
}
