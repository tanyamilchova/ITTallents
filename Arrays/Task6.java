public class Task6 {
    public static void main(String[] args) {
        /*Задача 6:
Напишете програма, която първо чете 2 масива и после извежда
съобщение дали са еднакви, и дали са с еднакъв размер.


         */
        int[]arr={1,2,3,4,5};
        int[]arr1={1,2,3,4,5};
        boolean equal=true;
        if(arr.length== arr1.length){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]!=arr1[i]){
                    equal=false;
                }
            }
            if(equal){
                System.out.println("Equal");
            }
            else {
                System.out.println("Not equal");
            }
        }
    }
}
