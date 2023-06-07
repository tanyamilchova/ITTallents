import java.util.Scanner;

public class Figure2 {
    public static void main(String[] args) {
//        Задача 2​: Въведете число N чрез конзолата и изкарайте като
//резултат следната фигура с височина N и широчина N
//# # # # # # #
// # # # # # # #
//# # # # # # #
// # # # # # # #
//# # # # # # #
// # # # # # # #
//# # # # # # #
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number N");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < num - 1; j++) {
                    System.out.print(" *");
                }
            }
            else {
                for (int j = 0; j < 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <num ; j++) {
                    System.out.print(" *");
                }
            }
                System.out.println();
            }

        }
    }


