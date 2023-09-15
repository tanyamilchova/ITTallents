package main.ArrayTasks;

public class AmstrongNumber {
    public static void main(String[] args) {
        //A number is called an Armstrong number if it is equal to the cube of its every digit.
        // For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3.
        // You need to write a program to check if the given number is Armstrong number or not.
        //1,153,370,371,407...are Amstrong numbers

        int num=153;
        int countDigits=0;
        int temp=num;
        int remainder=0;
        int result=0;
        int cube=0;

        while (temp!=0){
            remainder=temp%10;
            cube=(int) Math.pow(remainder,3);
            result+=cube;
            temp/=10;
            countDigits++;
        }
        if(result==num){
            System.out.println("The given number is an Amstrong number");
        }
        else {
            System.out.println("Not an Amstrong number");

        }
        System.out.println(result);

        // check the Amstrong numbers in an interval
        for (int i = 1; i <500; i++) {
            remainder=0;
            result=0;
            cube=0;
            temp=i;
            while (temp!=0){
                remainder=temp%10;
                cube=(int) Math.pow(remainder,3);
                result+=cube;
                temp/=10;
                countDigits++;
            }
            if(result==i){
                System.out.println("The given number is an Amstrong number "+i);
            }
            else {
                System.out.println("Not an Amstrong number");

            }
        }

    }
}
