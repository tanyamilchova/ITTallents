public class RecursionLoop4 {
    public static void main(String[] args) {
        /*
        Задача 4: Да се изведат на екрана числата от 10 до 1 в обратен
ред.
         */
        int num=printNums(10);
    }
    static int printNums(int nums){
        if(nums==0){
            return nums;
        }
        System.out.println(nums);
        return printNums(nums-1);
    }
}
