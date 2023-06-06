public class BinaryOperators4 {

public static void main(String[] args) {

    //    Да се направи число с бит 1ца на позиции а, в и с.
    int a = 1;
    int b = 2;
    int c = 4;
    int shiftedA = 1 << a;
    int shiftedB = 1 << b;
    int shiftedC = 1 << c;

    int result = shiftedA | shiftedB | shiftedC;
    System.out.println(Integer.toBinaryString(result));
    System.out.println(result);
}
}
