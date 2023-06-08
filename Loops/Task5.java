import java.util.Scanner;

public class Task5 {
//    Задача 5: Да се въведат от потребителя 2 числа. И да се
//изведат на екрана всички числа от по-малкото до по-голямото.
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter num1");
            int num1=sc.nextInt();
        System.out.println("Thank you! Now enter num2");
        int num2=sc.nextInt();

        if(num2<num1){
            int temp=num1;
            num1=num2;
            num2=temp;
        }


            for (int i = num1; i<=num2 ; i++) {
                System.out.println(num1);
                num1++;
            }

        }
    }

