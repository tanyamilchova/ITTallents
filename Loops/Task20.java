package src;

public class Task20 {
    public static void main(String[] args) {
//Задача 20:
//Да се състави програма, чрез която се извежда квадрат от
//цифри. Сумите от елементите на произволен ред или стълб са
//равни на 45.
//Пример:
//1 2 3 4 5 6 7 8 9 0
//2 3 4 5 6 7 8 9 0 1
//3 4 5 6 7 8 9 0 1 2
//4 5 6 7 8 9 0 1 2 3
//5 6 7 8 9 0 1 2 3 4
//6 7 8 9 0 1 2 3 4 5
//7 8 9 0 1 2 3 4 5 6
//8 9 0 1 2 3 4 5 6 7
//9 0 1 2 3 4 5 6 7 8
//0 1 2 3 4 5 6 7 8 9
        int digit=1;
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(digit==10){
                    digit=0;
                    System.out.print(digit);
                    digit++;
                }
                else {

                    System.out.print(digit);
                    digit++;
                }
            }
                System.out.println();
           digit=i+1;

        }
    }
}
