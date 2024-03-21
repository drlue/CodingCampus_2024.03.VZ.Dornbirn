package lukas.week04;

import ardijanla.ConsoleColors;
import lukas.Helper;

public class FourInRows {

    public static void main(String[] args) {
        //prepare board
        int height = 6;
        int width = 7;
        int user = 0;
        boolean playing = true;

        while (playing) {
            int[][] board = new int[height][width];
            printBoard(board, null);

            //play game
            int counter = 0;
            int[][] isWinning = null;
            while (isWinning == null && counter < width * height) {
                user = (counter % 2 == 0) ? -1 : 1;
                makeMove(user, board);
                isWinning = checkWinner(user, board);
                printBoard(board, isWinning);

                counter++;
            }
            if (isWinning != null) {
                System.out.println("Gratulation!! Spieler " + (user == -1 ? "X" : "0") + " hat gewonnen.");
            } else {
                System.out.println("Sorry. Keine Steine mehr übrig. Game Over.");
            }

            String playAgain = Helper.readStringFromConsole("Noch einmal spielen (y/n)?>>>");
            playing = Helper.isYes(playAgain);
        }
    }

    public static void printBoard(int[][] board, int[][] winningStones) {
        String[] stones = {"X", " ", "0"};
        String[] userColor = {ConsoleColors.YELLOW, ConsoleColors.WHITE, ConsoleColors.RED};
        String winningColor = ConsoleColors.GREEN_BOLD;
        //header
        for (int col = 0; col < board[0].length; col++) {
            System.out.printf("  %s ", col + 1);
        }
        System.out.println("\033[H\033[2J");
        //grid top
        System.out.println("┌" + "───┬".repeat(board[0].length - 1) + "───┐");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                //check stone is part of winning
                boolean partOfWinning = false;
                if (winningStones != null) {
                    for (int[] winningStone : winningStones) {
                        if (i == winningStone[0] && j == winningStone[1]) {
                            partOfWinning = true;
                            break;
                        }
                    }
                }
                //user colors
                String stoneColor = userColor[1 + board[i][j]];

                System.out.print("│ " + (partOfWinning ? winningColor : stoneColor) + stones[1 + board[i][j]] + ConsoleColors.RESET + " ");
            }
            System.out.println("│");
            if (i < board.length - 1) {//grid middle
                System.out.println("├" + "───┼".repeat(board[0].length - 1) + "───┤");
            } else { //grid bottom
                System.out.println("└" + "───┴".repeat(board[0].length - 1) + "───┘");
            }
        }
    }

    public static void makeMove(int user, int[][] board) {
        int col;
        boolean success = false;
        while (!success) {
            col = Helper.readIntFromConsole("Wähle Spalte (1 - 7) >>>", 1, 7) - 1;
            int row = board.length - 1;
            while (!success && row >= 0) {
                if (board[row][col] == 0) {
                    board[row][col] = user;
                    success = true;
                }
                --row;
            }
            if (!success) {
                //when column full
                System.out.println("Spalte " + (col + 1) + " bereits voll. Wähle andere Spalte");
            }
        }
    }


    public static int[][] checkWinner(int user, int[][] board) {
        for (int row = board.length - 1; row >= 0; row--) {
            for (int col = 0; col < board[row].length; col++) {
                //check horizontal left to right
                if (col < board[row].length - 3 && board[row][col] + board[row][col + 1] + board[row][col + 2] + board[row][col + 3] == user * 4) {
                    return new int[][]{{row, col}, {row, col + 1}, {row, col + 2}, {row, col + 3}};
                }

                //check vertical bottom to up
                if (row > board.length - 3 && board[row][col] + board[row - 1][col] + board[row - 2][col] + board[row - 3][col] == user * 4) {
                    return new int[][]{{row, col}, {row - 1, col}, {row - 2, col}, {row - 3, col}};
                }

                //check diagonal 1 bottom left to top right
                if (row > board.length - 3 && col < board[row].length - 3 && board[row][col] + board[row - 1][col + 1] + board[row - 2][col + 2] + board[row - 3][col + 3] == user * 4) {
                    return new int[][]{{row, col}, {row - 1, col + 1}, {row - 2, col + 2}, {row - 3, col + 3}};
                }

                //check diagonal 2 bottom right to top left
                if (row > board.length - 3 && col > 3 && board[row][col] + board[row - 1][col - 1] + board[row - 2][col - 2] + board[row - 3][col - 3] == user * 4) {
                    return new int[][]{{row, col}, {row - 1, col - 1}, {row - 2, col - 2}, {row - 3, col - 3}};
                }
            }
        }
        return null;
    }





}
