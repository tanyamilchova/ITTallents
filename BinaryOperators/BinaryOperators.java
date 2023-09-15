public class BinaryOperators {
    public static void main(String[] args) {
//        Whether the fifth bit is one or zero?

        byte x=0b101001;
        byte shift1= 1<<4;

        if((x&shift1)==0){
            System.out.println(" zero");
        }
        else {
            System.out.println("one");
        }
        System.out.println((x&(1<<4))==0);
    }
}
