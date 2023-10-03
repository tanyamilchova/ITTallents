import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        /* морски шах

         */
        Scanner sc= new Scanner(System.in);
        boolean win=false;
        int countTries=0;
        char [][] matrix= {
                {' ','|',' ','|',' '},
                {'—','—','—','—','—'},
                {' ','|',' ','|',' '},
                {'—','—','—','—','—'},
                {' ','|',' ','|',' '},
        };
        int position=0;

        System.out.println("Choose a symbol for player1");
        char symbol=sc.next().charAt(0);
        System.out.println("Choose a simbol for player2");
        char symbol2=sc.next().charAt(0);

        do {
            int x1st;
            int y1sr;
            do {
                x1st = enterCoordinates(sc, matrix, position);
                y1sr = enterCoordinates(sc, matrix, position);
            }while( matrix[x1st][y1sr]!=' ');
                fillTheMatrix(matrix, x1st, y1sr, position, symbol, countTries);
                countTries++;
                printMatrix(matrix);

                if (!gameOver(matrix, win, countTries)) {
                    int x2nd;
                    int y2nd;
                    do {
                        x2nd = enterCoordinates(sc, matrix, position);
                        y2nd = enterCoordinates(sc, matrix, position);
                    }while(matrix[x2nd][y2nd]!=' ');
                    fillTheMatrix(matrix, x2nd, y2nd, position, symbol2, countTries);
                    countTries++;
                    printMatrix(matrix);
                }

            }


        while (!gameOver(matrix,win,countTries));
        System.out.println(countTries);

    }
    static int enterCoordinates(Scanner sc,char[][]matrix,int position){
        int coordinate;
        int i=' ';
        int j=' ';
        do {
            System.out.println("Enter a coordinate between 1 and 3");
            coordinate= sc.nextInt();
        }
        while ((coordinate)<1 || coordinate> matrix.length-2) ;
           if(coordinate==1) {
               position = 0;
           }
           if(coordinate==2) {
               position = 2;
           }
           if(coordinate==3) {
               position = 4;
           }

        return position;
    }
    static void fillTheMatrix(char [][]matrix,int x,int y,int position,char symbol,int countTries){
        if(matrix[x][y]==' '){
            matrix[x][y]=symbol;


        }

    }
    static void printMatrix(char[][]matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static boolean gameOver(char[][]matrix,boolean win,int countTries){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if(matrix[i][j]!=' ') {

                    if ((i == 0 || i == 2 || i == 4) && j == 0) {
                        if (matrix[i][j] == matrix[i][j + 2] && matrix[i][j] == matrix[i][j + 4]) {
                            win = true;
                            System.out.println("You won");
                            break;
                        }
                    }
                    if ((j == 0 || j == 2 || j == 4) && i == 0) {
                        if (matrix[i][j] == matrix[i + 2][j] && matrix[i][j] == matrix[i + 4][j]) {
                            win = true;
                            System.out.println("You won");
                            break;
                        }
                    }
                    if (i == 0 && j == 0 && matrix[i][j] == matrix[i + 2][j + 2] && matrix[i][j] == matrix[i + 4][j + 4]) {
                        win = true;
                        System.out.println("You won");
                        break;
                    }
                    if (i == 0 && j == 4 && matrix[i][j] == matrix[i + 2][j - 2] && matrix[i][j] == matrix[i + 4][j - 4]) {
                        win = true;
                        System.out.println("You won");
                        break;
                    }
                    if (countTries == 9) {
                        win = true;
                        System.out.println("Game over");
                    }
                }
            }
        }
        return win;
    }
}

