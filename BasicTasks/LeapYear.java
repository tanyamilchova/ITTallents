package main.ArrayTasks;

public class LeapYear {
    public static void main(String[] args) {
        //Leap year
        int year=1500;
        if(year%100==0 ){
            if(year%400==0){
                System.out.println("Leap Year");
            }
            else {
                System.out.println("Not a leap year");
            }
        }
        else {
            if(year%4==0){
                System.out.println("Leap year");
            }
            else {
                System.out.println("Not a leap year");
            }

        }
    }
}
