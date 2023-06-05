package main.ArrayTasks;

public class GCD {
    public static void main(String[] args) {
        //GCD of two numbers
        //Алгоритъм на Евклид:
        //
        //Нека имаме две числа a и b, където a ≥ b.
        //Разделяме a на b и получаваме остатък r.
        //Ако r е равно на 0, то GCD(a, b) е равен на b.
        //Ако r не е равно на 0, заместваме a със стойността на b и b със стойността на r и се връщаме на предишната стъпка.
        //Продължаваме да делим и изчисляваме остатъците, докато стигнем до стъпка, в която остатъкът е 0.
        // Тогава последното ненулево число, което сме използвали за делител, е GCD(a, b).
        int num1=24;
        int num2=36;
        if(num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        int reminder=num1%num2;
        int temp=0;
        if(reminder==0){
            System.out.println(num2+" is the GCD");
        }
        else {
            while (reminder != 0) {
                temp = reminder;
                reminder = num1 % num2;
                num1 = num2;
                num2 = reminder;
            }
            if (reminder == 0) {
                System.out.println("The GCD is "+temp);
            }
        }
    }
}
