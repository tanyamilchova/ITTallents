import java.util.Scanner;

public class RecursionLoop11 {
    public static void main(String[] args) {


    /*
    Задача 11: Въведете число N чрез конзолата и изкарайте като
резултат следния триъгълник с височина N:
   *
  ***
 *****
.................
Кaто допълнително упражнение – нарисувайте същия
триъгълник, но незапълнен.
     */
        Scanner sc=new Scanner(System.in);
        int rows= enterRows(sc);
        int stars=1;
        int spaces=rows-1;
        int i=0;
//        drowAPiramide(spaces,stars,i,rows);
        printSpaces(spaces,i);
         printStars(stars,i);

    }
    static int enterRows(Scanner sc){
        System.out.println("Enter rows");
        int rows=sc.nextInt();
        return rows;
    }
    static int printStars(int stars,int i){
        if (i==stars){
            return stars;
        }
       i++;
        System.out.print("* ");
        return printStars(stars,i);
    }
    static int printSpaces(int spaces, int i){
        if(spaces==0){
            return spaces;
        }
        spaces--;
        System.out.print(". ");
        return printSpaces(spaces,i);
    }
   static int drowAPiramide(int spaces, int stars,int i,int rows){
        if(rows==0){
            return rows;
        }
        printSpaces(spaces,i);
        printStars(stars,i);
       System.out.println();
        return drowAPiramide(spaces-1,stars+2,i,rows-1);
   }
}
