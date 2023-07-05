public class Task8 {
    public static void main(String[] args) {
        /*Задача 8:
Напишете програма, която намира и извежда най-дългата редица от
еднакви поредни елементи в даден масив.
 */
        int[]arr={1,1,1,2,2,2,2,2,2,3,3,4,4,4,5,5,5,8};


        int index =0;
        int countElem=1;
        int maxCount=0;

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]==arr[i-1]){
             countElem++;

            }
            else {
                if(countElem>maxCount){
                    maxCount=countElem;
                    index=i-1;
                }
                countElem=1;
            }
        }
        System.out.println(maxCount+" max repetition of element "+arr[index] );
    }
}
