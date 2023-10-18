import java.util.Scanner;

public class RecursionLoop8 {
    public static void main(String[] args) {


    /*
Задача 8: По зададено число n, да се изведе на екрана таблица по
следния начин:
           n=1        n=2       n=3
           0           11        222
                       33        444
                                 666
     */

    Scanner sc = new Scanner(System.in);
    int num1 = enterNums(sc);
    int i=0;
    int start=num1-1;

//    printStart(start,i);
    printTable(num1,start,i);

}
    static int enterNums(Scanner sc){
        System.out.println("Enter a number");
        int num=sc.nextInt();
        return num;
    }
    static int printStart(int start,int num){
        if(num==0){

            return start;
        }
        System.out.print(start);
        return printStart(start,num-1);
    }
    static int printTable(int num,int start,int i){

        if(i==num){
            return num;
        }
        printStart(start,num);
        System.out.println();

        start+=2;

        return printTable(num,start,i+1);
    }
}
