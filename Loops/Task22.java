import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
//        Задача 22:
//Да се състави програма, която извежда първите 10 най-малки
//числа, които се делят на 2, 3 или на 5 и които са по-големи от
//въведено естествено число.
//Числата се извеждат, заедно с техния пореден номер.
//Входни данни: число от интервала [1..999]
//Пример: 1
//Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
//Използвайте цикъл while.
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a number between 1 and 999");
            int num = sc.nextInt();
            while (num<1 || num>999){
                System.out.println(" Enter a number between 1 and 999");
                num= sc.nextInt();
            }
            int count=1;
             while (count<11){
                 if(num%2==0 || num%3==0 || num%5==0){
                     if(count==10) {
                         System.out.print(count + ":" + num + " ");
                         count++;
                     }
                     else {
                         System.out.print(count + ":" + num + " "+",");
                         count++;
                     }
                 }
                 num++;
             }


    }
}
