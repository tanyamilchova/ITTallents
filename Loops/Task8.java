import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
//        Задача 8: По зададено число n, да се изведе на екрана таблица по
//следния начин:
//        n=2   1 1
//              3 3
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter N");
        int n= sc.nextInt();
        int x=n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(x+" ");
            }
            x+=2;

            System.out.println();
        }
    }

}
