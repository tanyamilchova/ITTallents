import java.util.Scanner;

public class RecursionLoop12 {
    public static void main(String[] args) {
        /*
        Задача 12: Да се състави програма, която извежда всички
естествени трицифрени числа, които нямат еднакви цифри т.е.
100,101, 606 и т.н. не се извеждат.
         */
        Scanner sc =new Scanner(System.in);
        int start=123;
        print3digits(start);
    }


    static int print3digits(int start){

        int temp=start;
        if(start==1000){
            return start;
        }
        int ones=temp%10;
        temp/=10;
        int tens=temp%10;
        temp/=10;
        int hundreds=temp%10;


            if((ones!=tens && ones!=hundreds && tens!=hundreds)){
                System.out.println(start);
            }

            return print3digits(start+1);

    }
}

