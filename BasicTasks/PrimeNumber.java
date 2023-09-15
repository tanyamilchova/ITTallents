package main.ArrayTasks;

public class PrimeNumber {
    public static void main(String[] args) {
        // prime number
        int num=19;
        boolean prime=true;
        for (int i = 2; i < num/2; i++) {
            if(num%i==0){
                System.out.println("Not prime");
                prime=false;
                break;
            }
        }
        if(prime){
            System.out.println("Prime");
        }
    }
}
