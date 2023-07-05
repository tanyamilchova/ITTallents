public class Task17a {
    public static void main(String[] args) {
         /*Задача 17:
Една редица от естествени числа ще наричаме зигзагообразна нагоре,
ако за елементите и са изпълняват условията:
N1 < N2 > N3 < N4 > N5 <..
Съставете програма, която проверява дали въведени в едномерен
масив редица от числа изпълняват горните изисквания.
Пример: 1 3 2 4 3 7
Изход: изпълнява изискванията за зигзагообразна нагоре редица

         */
        int[] arr = {1, 10, 2, 4, 3, 5, 1,1};
        boolean zigzag = true;
        for (int i = 1; i < arr.length - 1; i++) {
            boolean higherThanNeighbours= ( arr[i] > arr[i - 1]) && (arr[i] > arr[i + 1]);
            boolean lowerThanNeighbours=(arr[i] < arr[i - 1]) && (arr[i] < arr[i + 1]);
                if( ! (higherThanNeighbours || lowerThanNeighbours)){
                    zigzag=false;
                }
        }
        System.out.println(zigzag? "ZIGZAG":"Not zigzag");

    }
}
