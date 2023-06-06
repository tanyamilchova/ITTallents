public class BinaryOperators2 {
    public static void main(String[] args) {
// С побитови операции преобразувайте 231 в 772
        int x=231;
        int y=0b1111100011;
        int z=x^y;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));
    }
}
