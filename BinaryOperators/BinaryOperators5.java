public class BinaryOperators5 {
    public static void main(String[] args) {

        byte a=0b101;
//                a=5
        byte b=0b111;
//                b=7;
        byte c=0b011;
//                c=3;

        int x=a&b;
        System.out.println(Integer.toBinaryString(x)+" a+b");
        int cInverted=c^1;
        System.out.println(Integer.toBinaryString(cInverted) +" ^C");
        int result=(a & b) & (c^1);
        System.out.println(Integer.toBinaryString(result));
    }
}
