public class RecursionLoop2 {
    public static void main(String[] args) {
        /*
        Задача 2: Да се изведат на екрана числат от -20 до 50.
         */
                    int num=-20;
                    printNums(num);
    }
    static int printNums(int num){
        if(num==51){
            return num;
        }
        System.out.println(num);

        return printNums(num+1);
    }
}
