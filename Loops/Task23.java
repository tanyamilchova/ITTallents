package src;

public class Task23 {
    public static void main(String[] args) {
//Задача 23:
//Да се състави програма, която чрез цикъл while извежда
//таблицата за умножение, но без повторение.
//Т.е. ако е изведено 4*5 не се извежда 5*4.

        int start=1;
        int multiplier=0;
      while (start<10){

          while (multiplier<9){
              multiplier++;
              if(start>multiplier){
                  continue;
              }
              System.out.println(start+" *" + multiplier + " =" + (start * multiplier));
          }
          start++;
          multiplier=0;
      }
    }
}


