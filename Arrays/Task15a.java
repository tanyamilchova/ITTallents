import java.util.Arrays;

public class Task15a {
    public static void main(String[] args) {
          /*Задача 15:
Да се състави програма, която въвежда в едномерен масив реални
числа.
Като изход: програма извежда онези 3 различни числа, чиято
абсолютна стойност формира максималната обща сума.
Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
Изход: 5.1; 6.34; 7.13


         */


        double temp=0;
        double[]arr={7.13,-11.2,4.9,5.1,6.34,1.12};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                arr[i]*=(-1);
            }
        }


        for (int i = 0; i < arr.length; i++) {
            boolean sorted=true;
            for (int j = 1; j < arr.length; j++) {
                if(arr[j]<arr[j-1]){
                sorted=false;

                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
           if(sorted){
               break;
           }
        }
        for (int i = arr.length-3; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
