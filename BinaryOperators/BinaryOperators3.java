public class BinaryOperators3 {
    public static void main(String[] args) {
//       Enter a number and guess how many BITs are 1.

        byte x = 5;
        int countOnes=0;
        System.out.println(Integer.toBinaryString(x));
        int firstPosition = x & 1;
            if(firstPosition==1){
                countOnes++;
            }
        System.out.println(firstPosition);
        int secondPosition = (x & (1 << 1)) >> 1;
            if(secondPosition==1){
                countOnes++;
            }
        System.out.println(secondPosition);
        int thirdPosition = (x & (1 << 2)) >> 2;
            if(thirdPosition==1){
                countOnes++;
            }
        System.out.println(thirdPosition);
        int fourthPosition = (x & (1 << 3)) >> 3;
        if(fourthPosition==1){
            countOnes++;
        }
        System.out.println(fourthPosition);

        System.out.println(countOnes+" Ones");
        System.out.println((x&(1<<4))>>4);
    }
}


