package main.ArrayTasks;

public class Palindrom2 {
    public static void main(String[] args) {

        int num = 123321;
        int temp=num;
        int reversed = 0;
        while (num!=0){
            reversed=reversed*10+num%10;
            num/=10;
        }
        System.out.println(reversed);
        if(reversed==temp){
            System.out.println("palindrom");
        }
    }
}
