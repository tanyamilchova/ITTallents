import java.util.Scanner;

public class Tas9 {
    public static void main(String[] args) {
//Задача 9: Да се прочетат 2 числа от клавиатурата А и В.
//Да се изведат всички числа от А до В на степен 2(разделени с
//запетая).Ако някое число е кратно на 3, да се изведе съобщение че
//числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
//пропуснатите) стане по-голяма от 200, да се прекрати извеждането.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number N1");
        int num1=sc.nextInt();
        System.out.println(" Thank you! Now enter the second number N2");
        int num2= sc.nextInt();

        if(num1>num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }

        int sum=0;
        for (int i = num1; i <=num2 ; i++) {
            int numPow2=i*i;
            sum=sum+numPow2;
            if( (i*i)%3==0){
                System.out.print( "Divisible to 3 : skip. ");
                continue;
            }
            if(sum>200){
                System.out.println(" The sum is over 200 break");
                break;
            }
            System.out.print(numPow2+ " ,");
        }
            System.out.print(sum+" sum");

    }
}
