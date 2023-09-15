public class BinaryOperators7 {
    public static void main(String[] args) {
//        Колко бита от две входни данни са с еднаква стойност

        byte x=0b101;
        byte x2=0b111;
        int counterEqual=0;

        int firstIdxX=x & 1;
        int firstIdxX2=x2 & 1;
        System.out.println(firstIdxX +" "+firstIdxX2);
        if( firstIdxX==firstIdxX2){
            counterEqual++;
        }
        int secondIdxX=(x & (1<<1))>>1;
        int secondIdxX2=(x2 & (1<<1))>>1;
        System.out.println(secondIdxX+" "+secondIdxX2);
        if( secondIdxX==secondIdxX2){
            counterEqual++;
        }
        int thirdIdxX=(x & (1<<2))>>2;
        int thirdIdxX2=(x2 & (1<<2))>>2;
        System.out.println(thirdIdxX+" "+thirdIdxX2);
        if( thirdIdxX==thirdIdxX2){
            counterEqual++;
        }

        System.out.println(counterEqual+ " count");
    }
}
