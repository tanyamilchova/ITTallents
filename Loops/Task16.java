import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
//        Задача 16:
//Да се състави програма, чрез която се въвеждат 2 естествени
//числа N, M от интервала [10..5555].
//Програмата, чрез цикъл for, да извежда всички числа от
//интервала, които са кратни на 50 в низходящ ред.
//Пример: 25,249
//Изход: 200,150,100, 50.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N1 from 10 to 5555");
        int num1=sc.nextInt();
        System.out.println("Thank you! Now enter N2");
        int num2=sc.nextInt();

        while ((num1<10 || num1>5555) || (num2<10 || num2>5555)) {
            System.out.println("The numbers have to be from 10 to 5555");
            num1 = sc.nextInt();
            System.out.println("Thank you! Now enter N2");
            num2 = sc.nextInt();
        }
        if(num1>num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }

            for (int i = num1; i <=num2 ; i++) {
                if(i%50==0){
                    System.out.println(i);
                }
            }
    }
}
