public class RecursionLoop3 {
    public static void main(String[] args) {


    /*
    Задача 3: Да се изведат на екрана всички нечетни числа от -10
до 10

     */
        int oddNim=-10;
                prontOdd(oddNim);
    }
    static int prontOdd(int oddNum){

        if(oddNum==12){
            return oddNum;
        }
        System.out.println(oddNum);
        return prontOdd(oddNum+2);
    }
}
