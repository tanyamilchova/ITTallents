import java.util.Scanner;

public class RecursionLoop6 {
    public static void main(String[] args) {


    /*
    Задача 6: Да се прочете число от екрана(конзолата) и да се
изведе сбора на всички числа между 1 и въведеното число
     */
        Scanner sc = new Scanner(System.in);
        int num = readNum(sc);
        int sum=0;
        System.out.println(printNum(1,num,sum)+" is the sum of all nums from 1 to "+num);
    }
    static int readNum(Scanner sc){
        System.out.println("Enter a number");
      int  num=sc.nextInt();
        return num;
    }
    static int printNum(int num,int num2,int sum){

        if(num==num2){
           sum=sum+num ;
            return sum;
        }
        sum=sum+num;

        return (printNum(num+1,num2,sum));
    }
}