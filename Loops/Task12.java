public class Task12 {
    public static void main(String[] args) {
//        Задача 12: Да се състави програма, която извежда всички
//естествени трицифрени числа, които нямат еднакви цифри т.е.
//100,101, 606 и т.н. не се извеждат.

        int num=100;
        for (int i = num; i < 999; i++) {
            int ed = i % 10;
            int des = (i / 10) % 10;
            int stotizi = (i / 100) % 10;

            if ((ed == des) || (des == stotizi) || (stotizi == ed)) {
                continue;
            }
            System.out.println(i);
        }
    }
}
