import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
//        Задача 10: Въведете число от клавиатурата и определете дали е
//просто. Просто число е това което се дели САМО на 1 и на себе
//си.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        boolean isSimple=true;
        for (int i = 2; i < num/2; i++) {
            if(num%i==0){
                isSimple=false;
                break;
            }
        }
        if(isSimple){
            System.out.println(" Simple "+num);
        }
        else {
            System.out.println("Is divisible "+num);
        }

    }
}
