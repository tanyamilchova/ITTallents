import java.util.Scanner;

public class RecursionLoop9 {
    public static void main(String[] args) {



    /*
    Задача 9: Да се прочетат 2 числа от клавиатурата А и В.
Да се изведат всички числа от А до В на степен 2(разделени с
запетая).Ако някое число е кратно на 3, да се изведе съобщение че
числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
пропуснатите) стане по-голяма от 200, да се прекрати извеждането.
     */
        Scanner sc=new Scanner(System.in);
        int sum=0;
    int num1=readNumbers(sc);
    int num2=readNumbers(sc);
    printNumber(num1,num2,sum);
}
static int readNumbers(Scanner sc){
    System.out.println("Enter a number");
    int num=sc.nextInt();
    return num;
}
    static int printNumber(int num1, int num2,int sum){
        if(num1==num2){
            if(num1%3==0){
                System.out.println(" Skip"+num1);
            }
            else {
                System.out.println(num1 * num1);
            }
            return num1;
        }
        if(num1%3==0){
            System.out.println("Skip "+num1);
        }
        else {
            sum+=num1*num1;
            System.out.print(num1 * num1 + ", ");
            if(sum>200){
                System.out.println("The sum --> "+sum+" is over 200 ");
                return sum;
            }
        }

        return printNumber(num1+1,num2,sum);
    }
}
