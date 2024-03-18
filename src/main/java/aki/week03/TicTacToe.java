package aki.week03;

import java.util.Scanner;

class TicTacToe {

    public static boolean player1 = true;

    public static void main(String[] args) {

        // Create 2D Array for the board and fill with placeholders
        char[][] board = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};

        System.out.println("Player 1 - X's\nPlayer 2 - O's\n");

        printBoard(board);

        startGame(board);
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print("|");
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(" " + board[i][j] + " |");
            }
            System.out.println();
        }
    }

    public static void startGame(char[][] board) {
        //Create Scanner object
        Scanner scan = new Scanner(System.in);
        boolean gameOver = false;

        while (gameOver == false) {
            // If it's player 1's turn
            if (player1 == true) {
                System.out.println("\nPlayer 1's Turn - Place your X");
                System.out.println("What row?");
                int row = (scan.nextInt() - 1);
                System.out.println("What column?");
                int column = (scan.nextInt() - 1);
                boolean check = checkIfFree(board, row, column, player1);

                if (check == true) {
                    // Was placed and we can continue
                    boolean checkForWin = checkForWin(board, player1);
                    if (checkForWin == false) // if there isn't a win yet
                    {
                        player1 = false; //make it player 2's turn
                    } else // there is a win
                    {
                        gameOver = true;
                        System.out.println("Player 1 Wins!");
                    }
                } else // pos wasn't free
                {
                    System.out.println("Position not available!");
                }
                // else it's still player 1's turn
            } else //player 2's turn
            {
                System.out.println("\nPlayer 2's Turn - Place your O");
                System.out.println("What row?");
                int row = (scan.nextInt() - 1);
                System.out.println("What column?");
                int column = (scan.nextInt() - 1);
                boolean check = checkIfFree(board, row, column, player1);

                if (check == true) {
                    // Was placed and we can continue
                    boolean checkForWin = checkForWin(board, player1);
                    if (checkForWin == false) // if there isn't a win yet
                    {
                        player1 = true; //make it player 1's turn
                    } else // there is a win
                    {
                        gameOver = true;
                        System.out.println("Player 2 Wins!");
                    }
                } else // pos wasn't free
                {
                    System.out.println("Position not available!");
                }
                // else it's still player 2's turn
            }

            printBoard(board);

            if (checkIfBoardIsFull(board) == true) {
                gameOver = true;
                System.out.println("GAME OVER - It's a tie!");
            }
        }
    }

    public static boolean checkIfBoardIsFull(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkIfFree(char[][] board, int row, int column, boolean player1) {
        // Check if current pos is free
        if (board[row][column] == '-') //if it's free
        {
            // If free we can place it

            if (player1 == true) {
                // We place an X
                board[row][column] = 'X';
            } else {
                // We place an O
                board[row][column] = 'O';
            }
            return true;
        } else {
            return false; // Position is not free
        }
    }

    public static boolean checkForWin(char[][] board, boolean player1) {
        char charToCheck;

        // if it's player 1, we check for X, if not we check for O
        if (player1 == true) {
            charToCheck = 'X';
        } else {
            charToCheck = 'O';
        }

        // Checking rows
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == charToCheck) {
                if ((board[i][1] == charToCheck) && (board[i][2] == charToCheck)) {
                    return true; // Win
                }
            }
        }

        // Checking columns
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == charToCheck) {
                if ((board[1][i] == charToCheck) && (board[2][i] == charToCheck)) {
                    return true; // Win
                }
            }
        }

        // Checking slanted possibilities
        if (board[1][1] == charToCheck) // if the middle slot has our character
        {
            if (((board[0][0] == charToCheck) && (board[2][2] == charToCheck)) ||
                    ((board[2][0] == charToCheck) && (board[0][2] == charToCheck))) {
                return true;
            }
        }

        return false;
    }
}