import java.util.Scanner;

public class RecursionLoop5 {
    public static void main(String[] args) {


    /*
    Задача 5: Да се въведат от потребителя 2 числа. И да се
изведат на екрана всички числа от по-малкото до по-голямото.
     */
        Scanner sc = new Scanner(System.in);
      int num1= enterNums(sc);
        int num2= enterNums(sc);
        printNums(num1,num2);

    }
    static int enterNums(Scanner sc){
        System.out.println("Enter a number");
        int num=sc.nextInt();
        return num;
    }
    static int printNums(int num1, int num2){
        int min;
        int max;
        if(num1<num2){
            min=num1;
            max=num2;
        }
        else {
            min=num2;
            max=num1;
        }
        if(min==max){
            System.out.println(min);
            return min;
        }
        System.out.println(min);

        return printNums(min+1,max);
    }

}