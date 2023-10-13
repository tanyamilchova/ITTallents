public class RecursionLoop7 {
    public static void main(String[] args) {


    /*
    Задача 7: Започвайки от 3, да се изведат на екрана първите n
числа които се делят на 3. Числата да са разделени със запетая.

     */
        int i=0;
        prinrDivisibleTo3(3, i);

    }
    static int prinrDivisibleTo3(int num,int i){

        if(i==5){
            return num;
        }
        System.out.println(num);

        return (prinrDivisibleTo3(num+3,i+1));
    }
}
