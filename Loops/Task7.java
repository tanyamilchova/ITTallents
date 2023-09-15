import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
//        Задача 7: Започвайки от 3, да се изведат на екрана първите n
//числа които се делят на 3. Числата да са разделени със запетая.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();

        int a=3;

        for (int i = 0; i <num ; i++) {
            if(i==num-1){
                System.out.println(a);
            }
            else {
                System.out.print(a+" ,");
            }
            a+=3;
        }
    }
}
