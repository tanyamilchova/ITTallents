public class Figure4 {
    public static void main(String[] args) {
//        //Задача 4​: Въведете число N чрез конзолата и изкарайте
//следните фигури, чиято големина да съответства на N.
//Всяка подточка я решете в отделен файл.
//* *
//  * *
//  * * *
//  * * * *
//  * * * * *
//  * * * * * *
//  * * * * * * *
// */
//
        int rows=5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if(i>j || i==j){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
