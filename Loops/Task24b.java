import java.util.Scanner;

public class Task24b {
    public static void main(String[] args) {
//        //        Задача 24:
////Едно число X е палиндром, aко се чете еднакво отпред назад и
////отзад напред.
////Да се състави програма, която проверява дали въведено число е
////палиндром.
////Входни данни: N - естествено число от интервала [10 .. 30000].
////Пример: 17571
////Изход: числото е палиндром
////Използвайте цикъл do-while.
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a number from 10 to 30000");
        int num=sc.nextInt();

        while (num<10 | num>30000){
            System.out.println(" Enter a number from 10 to 30000");
            num=sc.nextInt();
        }
        int newNum =num;
        int sum = 0;

        do {
            int remnant = num%10;
            sum = sum*10 + remnant;
            num = num/10;
        }
        while (num != 0);

        if(sum==newNum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
