public class BinaryOperators8 {
    public static void main(String[] args) {
//        5 числа , 2 двойки еднакви и 1 различно. Принт различното. Бинарни операции
        int n1 = 5;
        int n2 = 3;
        int n3 = 6;
        int n4 = 3;
        int n5 = 3;
        int temp1 = n1 & n3;
        if (n1 == temp1) {
            System.out.println(" n1=n3");
        } else {
            temp1 = n1 & n2;
            if (n1 == temp1) {
                System.out.println(" n1=n2");
            }else {
                temp1=n1&n3;
                if(n1==n3){
                    System.out.println(" n1=n3");
                }
            }

        }
    }
}