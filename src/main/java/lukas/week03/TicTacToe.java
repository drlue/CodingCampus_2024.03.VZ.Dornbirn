package lukas.week03;


import java.util.Random;

public class TicTacToe {

    public static int size;
    public static String[][] canvas;
    public static String[][] gameField;

    public static char[] userChars = new char[2];

    public static void main(String[] args) {
        //define canvas and gameField
        size = 3;
        gameField = new String[size][size];
        canvas = new String[size * 2][size * 2];

        //empty game field
        createCanvas();
        initGameField();
        printCanvas();
        System.out.println();


        //user input
//        userInputChars();
//        playGame();


        testCheckWinner();

    }

    public static void createCanvas() {
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[0].length; j++) {
                canvas[i][j] = " ";

                if (j % 2 == 0 && j > 0 && i > 0) {
                    canvas[i][j] = "│";
                }
                if (i % 2 == 0 && i > 0 && j > 0) {
                    canvas[i][j] = "─";
                }
                //first column
                if (j == 0 && i % 2 > 0) {
                    canvas[i][j] = "" + (int) ((i + 1) * 0.5);
                }
                //first row
                if (i == 0 && j % 2 > 0) {
                    int k = (int) ((j + 1) * 0.5);
                    canvas[i][j] = String.valueOf((char) (k + 64));
                }
            }
        }
    }

    public static void printCanvas() {
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[0].length; j++) {
                System.out.printf("%2s", canvas[i][j]);
            }
            System.out.println();
        }
    }

    public static void updateCanvas() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[0].length; j++) {
                int k = i * 2 + 1;
                int l = j * 2 + 1;
                canvas[k][l] = gameField[i][j];
            }
        }
    }

    public static char getMaxColumnChar() {
        return (char) (size + 65);
    }

    public static int getMaxColumnAscii() {
        return size + 65;
    }

    public static int getMaxSteps() {
        return size * size;
    }

    public static void initGameField() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                gameField[i][j] = " ";
            }
        }
    }

    public static void convertCharToInt() {
        String txt = "A";
        int a = txt.charAt(0);
        System.out.printf("%s = %d\n", txt, a);
    }

    public static void userInputChars() {
        userChars[0] = lukas.Helper.readCharFromConsole("Spieler 1, wähle ein Zeichen: >>>");
        userChars[1] = lukas.Helper.readCharFromConsole("Spieler 2, wähle ein Zeichen: >>>");
    }

    public static void placeSymbol(int user) {

        boolean isPlaceEmpty = false;
        while (!isPlaceEmpty) {

            //read user input
            String selectedPos = lukas.Helper.readStringFromConsole("Spieler " + (user + 1) + ", wähle Position (z.B. 'B3') ");

            //convert to Uppercase:
            selectedPos = selectedPos.toUpperCase();
            //convert input in valid position in array gameField[i][j]
            char[] selectedPosArr = selectedPos.toCharArray();

            //validate string
            if (validateSelectedPosArr(selectedPosArr)) {
                int i = Integer.parseInt(String.valueOf(selectedPosArr[1])) - 1;  //ROW 0 - 2
                int j = selectedPosArr[0] - 65; //COL A-B    ASCII A = 65, B = 66, ...

                //check if selected Pos is empty
                if (gameField[i][j].equals(" ")) {
                    isPlaceEmpty = true;
                    //place symbol in game field
                    gameField[i][j] = String.valueOf(userChars[user]);
                } else {
                    System.out.println("Position ist bereits belegt!");
                }
            }
        }
    }

    public static boolean validateSelectedPosArr(char[] selectedPosArr) {
        //first part -> check column -> ascii <= ascii code of max columname
        //i.e.: 3x3
        //max column  2 -> C -> 65+2=67
        if (selectedPosArr.length == 2 && selectedPosArr[0] >= 65 && selectedPosArr[0] <= getMaxColumnAscii() && Integer.parseInt(String.valueOf(selectedPosArr[1])) <= gameField.length) {
            return true;
        }

        System.out.println("Eingegebene Position entspricht keinem Feld auf dem Spielfeld");
        return false;
    }

    public static boolean checkWinner() {
        boolean check = true;
        String checkPlace = "";
        //Check rows
        for (int row = 0; row < gameField.length; row++) {
            String stringToCheck = gameField[row][0];
            for (int col = 1; col < gameField[row].length; col++) {
                if (!gameField[row][col].equals(stringToCheck) || stringToCheck.equals(" ")) {
                    check = false;
                    break;
                } else {
                    checkPlace = "Zeile " + (row + 1);
                    check = true;
                }
            }
            if (check) {
                System.out.println(checkPlace);
                return true;
            }
        }
        //Check Cols
        for (int col = 0; col < gameField[0].length; col++) {
            String stringToCheck = gameField[0][col];
            for (int row = 1; row < gameField.length; row++) {
                if (!gameField[row][col].equals(stringToCheck) || stringToCheck.equals(" ")) {
                    check = false;
                    break;
                } else {
                    checkPlace = "Spalte " + String.valueOf((char) (col + 65));
                    check = true;
                }

            }
            if (check) {
                System.out.println(checkPlace);
                return true;
            }
        }

        //Check Diagonal1
        for (int row = 0; row < gameField.length - 1; row++) {
            if (!gameField[row][row].equals(gameField[row + 1][row + 1]) || gameField[row][row].equals(" ")) {
                check = false;
                break;
            } else {
                checkPlace = "Diagonale 1";
                check = true;
            }

        }

        if (check) {
            System.out.println(checkPlace);
            return true;
        }

        //Check Diagonal2
        for (int row = 0; row < gameField.length - 1; row++) {
            int n = gameField[row].length - 1;
            if (!gameField[row][n - row].equals(gameField[row + 1][n - row - 1]) || gameField[row][n - row].equals(" ")) {
                check = false;
                break;
            } else {
                checkPlace = "Diagonale 2";
                check = true;
            }
        }

        if (check) {
            System.out.println(checkPlace);
            return true;
        }

        return false;
    }


    public static void testCheckWinner() {
        initGameField();
/*
        gameField[0][0] = "x";
        gameField[0][0] = "x";
        gameField[0][0] = "x";
  */
        //fill with random 0 and 1
        Random random = new Random();
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[0].length; j++) {
                gameField[i][j] = String.valueOf(random.nextInt(2));
            }
        }

        updateCanvas();
        printCanvas();

        //checkWinner
        //System.out.println(checkWinner()?"GEWONNEN":"UNENTSCHIEDEN");


        // checkWinner v2

        boolean unentschieden = true;
        char[] testChars = {'0', '1'};
        for (int i = 0; i < testChars.length; i++) {
            if (checkWinnerV2(testChars[i])) {
                System.out.println("SPIELER " + i + " HAT GEWONNEN");
                unentschieden = false;
                return;
            }
        }
        System.out.println("UNENTSCHIEDEN");

    }

    public static boolean checkWinnerV2(char userChar) {
        String userString = String.valueOf(userChar);
        boolean rowCheck = true;
        boolean colCheck = true;
        boolean diag1Check = true;
        boolean diag2Check = true;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!gameField[i][j].equals(userString)) {
                    rowCheck = false;
                }
                if (!gameField[j][i].equals(userString)) {
                    colCheck = false;
                }
                if (!gameField[i][i].equals(userString)) {
                    diag1Check = false;
                }
                if (!gameField[i][size - 1 - i].equals(userString)) {
                    diag2Check = false;
                }
            }
            if (rowCheck || colCheck || diag1Check || diag2Check) {
                return true;
            }
        }
        return false;
    }


    public static void playGame() {
        boolean isRunning = true;

        int counter = 0;
        while (isRunning && counter < getMaxSteps()) {
            int user = counter % 2 == 0 ? 0 : 1;
            placeSymbol(user);
            updateCanvas();
            printCanvas();
            if (checkWinner()) {
                System.out.println("GRATULATION: SPIELER " + (user + 1) + " HAT GEWONNEN!");
                isRunning = false;
            }
            if (counter == getMaxSteps()) {
                System.out.println("EINIGEN WIR UNS AUF UNENTSCHIEDEN!");
            }
            counter++;

        }
    }
}
