import java.util.Scanner;

public class RecursionLoop1 {
    public static void main(String[] args) {
        /*
        Задача 1: Да се изведат на екрана числата от 1 до 100. Recursion
         */
        Scanner sc=new Scanner(System.in);
        int num=printNum(0);

    }
    static int printNum(int num){

        if(num==100){
            return num;
        }
        num++;
        System.out.println(num);

        return printNum(num);

    }
}
