import java.util.Scanner;

public class RecursionLoop10 {
    public static void main(String[] args) {


    /*
    Задача 10: Въведете число от клавиатурата и определете дали е
просто. Просто число е това което се дели САМО на 1 и на себе
си.
     */
        Scanner sc=new Scanner(System.in);
     int num= enterNumber(sc);
        boolean isPrime=checkPrime(num,2);
        if(isPrime){
            System.out.println(" is prime");
        }
        else {
            System.out.println("is not prime");
        }
    }
    static int enterNumber(Scanner sc){
        System.out.println("Enter a number");
        int num= sc.nextInt();
        return num;
    }
    static boolean checkPrime(int num,int i){
        boolean isPrime=true;
        if(i==num){
            return isPrime;
        }
        if(num%i==0){
            isPrime=false;
            return isPrime;
        }
        return checkPrime(num,i+1);
    }
}
