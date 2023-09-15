import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
//        Задача 14: Да се състави програма, която по въведено
//естествено число N от интервала [10..200] извежда в обратен
//ред всички числа, които са кратни на 7 и са по-малки от N.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 10 and 200");
        int num = sc.nextInt();
        for (int i = num; i >=0 ; i--) {

            if(i%7==0){
                System.out.println(i);
            }

        }
    }
}
