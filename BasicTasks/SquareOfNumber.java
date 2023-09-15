package main.ArrayTasks;

public class SquareOfNumber {
    public static void main(String[] args) {
        //The square root of a number (solution)
        //You need to write a program to calculate the square root of a number without using the Math.sqrt() function of JDK.
        // You need to write your logic and method to calculate the square root.
        // You can though use the popular algorithm, like Newton's method.


        double num=36;
//        double guess=5;
        double tolerance= 0.00005;
        double nextX=0;
        double x=5;
        while (true){
            nextX=0.5*(x+num/x);
            if((nextX-x)<=tolerance){
                break;
            }
            x=nextX;
        }
        System.out.println(nextX);

    }
}
