public class Task12 {
    public static void main(String[] args) {
        /*Задача 12:
Да се състави програма, чрез която по предварително въведени 7
числа в едномерен масив се разменят местата на елементи с индекси:
- 0 и 1 чрез трета променлива;
- 2 и 3 чрез събиране;
- 4 и 5 чрез умножение.
Пример: 1,2,3,4,5,6,7
Изход: 2,1,4,3,6,5,7

         */
        int[]arr={4,12,18,31,5,26,8};
        int temp=0;
        temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;

        arr[2]=arr[2]+arr[3];
        arr[3]=arr[2]-arr[3];
        arr[2]=arr[2]-arr[3];

        arr[4]=arr[4]*arr[5];
        arr[5]=arr[4]/arr[5];
        arr[4]=arr[4]/arr[5];


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
