import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
//Задача 13: Да се състави програма, която извежда всички
//естествени трицифрени числа, които имат сбор на цифрите равен
//на дадено число.
//Дадено : sum, където 2>=sum<=27.
//Пример: 26
//Изход: 899, 989, 998.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 2 and 27");
        int num =sc.nextInt();
        while (num<2 || num>27) {
            System.out.println("Enter a number between 2 and 27");
            num = sc.nextInt();
        }
//        if( num>=2 && num<=27){
            for (int i = 100; i <1000 ; i++) {
                int edinizi=i%10;
                int desetizi=(i/10)%10;
                int stotizi =(i/100)%10;

                if( (edinizi+desetizi+stotizi)==num){
                    System.out.println(i);
                }

            }


    }
}
