import java.util.Scanner;

public class Task24a {
    public static void main(String[] args) {
//10-30000
        //        Задача 24:
//Едно число X е палиндром, aко се чете еднакво отпред назад и
//отзад напред.
//Да се състави програма, която проверява дали въведено число е
//палиндром.
//Входни данни: N - естествено число от интервала [10 .. 30000].
//Пример: 17571
//Изход: числото е палиндром
//Използвайте цикъл do-while.

            Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number. Number have to be between 10 and 30000");
            int n= sc.nextInt();
        while (n<10 | n>30000){
            System.out.println(" Numbers have to be between 10 and 30000");
            n=sc.nextInt();
        }
        int m =n;
        int sum = 0;
        while (n != 0) {
            int d = n%10;
            sum = sum*10 + d;
            n = n/10;
        }
        if(sum==m){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}


