package main.ArrayTasks;

public class IntegerPalindrom {
    public static void main(String[] args) {

        int i=41233214;
        int num=i;
        int count=0;
        while (i>0){
            i/=10;
            count++;
        }
        System.out.println(count);
        int times=count/2;
        boolean palindrom=true;
        for (int j = 0; j < times; j++) {
            int temp = num / ((int) Math.pow(10, count - 1));
            int ones = num % 10;
            if (temp == ones) {
                System.out.println(temp+"="+ones);
            }
            else {
                System.out.println("Not a palindrom");
                palindrom=false;
                break;
            }
            num = (num - temp*((int) Math.pow(10, count - 1)) - ones) / 10;
            count-=2;
        }
        if(palindrom){
            System.out.println("palindrom");
        }
    }
}
