import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
/*Задача 13:
Да се състави програма, чрез която се въвежда число и се представя
като число в двоична бройна система.
Програмата, чрез масив, да изчислява последователно всички цифри
на въведеното естествено число в 2-ична бройна система.
Пример: 99
Изход: 1100011

 */
        int num=79;
        int sum=0;
        int counter=0;
        int reminder=0;


        while (num>0){
          sum=sum*10+num%2;
          num/=2;
          counter++;
        }
        System.out.println(sum);

        int[] arrInverted=new int[counter];
        for (int i = 0; i < arrInverted.length; i++) {
            arrInverted[i]=sum%2;
            sum/=10;
        }
        System.out.print("[");
        for (int i = 0; i < arrInverted.length; i++) {
            if (i == arrInverted.length - 1) {
                System.out.print(arrInverted[i] + " ");
            } else {
                System.out.print(arrInverted[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
