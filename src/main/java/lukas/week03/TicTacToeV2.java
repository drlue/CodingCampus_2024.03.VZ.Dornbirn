package lukas.week03;

import lukas.Helper;

public class TicTacToeV2 {
    public static int size = 3;

    public static void main(String[] args) {
        //Vorbereitung
        int[][] canvas;
        int[][] gameBoard = new int[size][size];
        int[] userArr = {0, 1, 2};
        String[] userStrings = {"x", "o"};

        //Spiel beginnt
        int moveCounter = 0;
        boolean isWinner = false;
        while (true) {
            //printArr(gameBoard);
            printCanvas(gameBoardUI(gameBoard, userStrings));
            while (!isWinner && moveCounter < size * size) {
                int user = moveCounter % 2 == 0 ? 1 : 2;
                int[] lastPos = makeMove(user, gameBoard);
                //printArr(gameBoard);
                printCanvas(gameBoardUI(gameBoard, userStrings));
                isWinner = checkWinnerV3(user, lastPos, gameBoard);
                if (isWinner) {
                    System.out.println("Spieler " + user + " gewinnt");
                }
                if (moveCounter == size * size - 1) {
                    System.out.println("Einigen wir uns auf unentschieden!");
                }
                moveCounter++;
            }
            if (!Helper.isYes(Helper.readStringFromConsole("Nochmal spielen? (y,n) >>>"))) {
                return;
            } else {
                isWinner = false;
                moveCounter = 0;
                resetGameBoard(gameBoard);
            }
        }


    }


    //=================================================================
    //    LOGIK
    //=================================================================

    public static int[] makeMove(int user, int[][] arr) {
        while (true) {
            //int col = Helper.readIntFromConsole("Wähle Spalte >>>", 1, size) - 1;
            int col;
            while (true) {
                char colName = Helper.readCharFromConsole("Wähle Spalte (A - " + String.valueOf((char) (65 + size - 1)) + ")>>>");
                col = String.valueOf(colName).toUpperCase().charAt(0) - 65;
                if (col >= 0 && col < size) {
                    break;
                }
                System.out.println("Ungültige Spalte!");
            }
            int row = Helper.readIntFromConsole("Wähle Zeile >>>", 1, size) - 1;

//Check
            if (arr[row][col] == 0) {
                arr[row][col] = user;
                return new int[]{row, col};
            } else {
                System.out.println("Feld bereits belegt!");
            }

        }
    }


    public static boolean checkWinnerV3(int user, int[] lastPos, int[][] gameBoard) {
        boolean checkRow = true;
        boolean checkCol = true;
        boolean checkDiag1 = true;
        boolean checkDiag2 = true;
        for (int i = 0; i < size; i++) {
            if (gameBoard[lastPos[0]][i] != user) {
                checkRow = false;
            }
            if (gameBoard[i][lastPos[1]] != user) {
                checkCol = false;
            }
            if (gameBoard[i][i] != user) {
                checkDiag1 = false;
            }
            if (gameBoard[i][size - 1 - i] != user) {
                checkDiag2 = false;
            }
        }

        if (checkRow) {
            System.out.println("Zeile " + (lastPos[0] + 1) + " richtig!");
            return true;
        }

        if (checkCol) {
            System.out.println("Spalte " + (lastPos[1] + 1) + " richtig!");
            return true;
        }

        if (checkDiag1) {
            System.out.println("Diagonale 1 richtig!");
            return true;
        }

        if (checkDiag2) {
            System.out.println("Diagonale 2 richtig!");
            return true;
        }
        return false;
    }

    //=================================================================
    //    UI
    //=================================================================

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void resetGameBoard(int[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                gameBoard[i][j] = 0;
            }

        }
    }

    public static String[][] gameBoardUI(int[][] gameBoard, String[] userStrings) {
        String[][] gameBoardUI = new String[size][size];
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (gameBoard[i][j] == 1) {
                    gameBoardUI[i][j] = userStrings[0];
                } else if (gameBoard[i][j] == 2) {
                    gameBoardUI[i][j] = userStrings[1];
                } else {
                    gameBoardUI[i][j] = " ";
                }
            }
        }
        return gameBoardUI;
    }

    public static void printCanvas(String[][] gameBoardUI) {
        for (int i = 0; i < gameBoardUI.length; i++) {
            //header
            if (i == 0) {
                for (int j = 0; j < gameBoardUI[i].length; j++) {
                    if (j == 0) {
                        System.out.printf("%4s ", String.valueOf((char) (65 + j)));
                    } else {
                        System.out.printf("%3s ", String.valueOf((char) (65 + j)));
                    }
                }
                System.out.println();
                //Line
            } else {
                for (int j = 0; j < gameBoardUI[i].length; j++) {
                    if (j == 0) {
                        System.out.printf("%5s", "───");
                    } else {
                        System.out.print("┼───");
                    }
                }
                System.out.println();
            }
            //default row
            for (int j = 0; j < gameBoardUI[i].length; j++) {
                if (j == 0) {
                    System.out.printf("%-2s%2s ", (i + 1), gameBoardUI[i][j]);
                } else {
                    System.out.printf("│%2s ", gameBoardUI[i][j]);
                }
            }
            System.out.println();
        }
    }
}



