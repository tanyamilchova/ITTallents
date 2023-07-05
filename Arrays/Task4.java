public class Task4 {
    public static void main(String[] args) {
        /*Задача 4:
Да се прочете масив и да се отпечата дали е огледален.
Следните масиви са огледални:
[3 7 7 3]
[4]
[1 55 1]
[6 27 -1 5 7 7 5 -1 27 6]

         */
        boolean palindrom=true;
        int[] arr={1,2,3,4,4,3,2,1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arr[ (arr.length)-(i+1)]){
               palindrom=false;
                break;
            }
        }
        if(palindrom){
            System.out.println( "Is palindrom it "+palindrom);
        }
        else {
            System.out.println(" Is not a palindrom  ");
        }


    }
}
