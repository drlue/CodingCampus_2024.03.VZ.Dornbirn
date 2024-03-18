package gyula.week04;

import java.util.Scanner;

public class TicTacToe {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] board = new int[3][3];
        int player = 1;
        int movesLeft = 9;
        boolean win = false;

        while (movesLeft > 0 && !win) {
            printBoard(board);
            player *= -1;
            int nextPos = readPosition(player, board);
            board[(nextPos - 1) / 3][(nextPos - 1) % 3] = player;
            --movesLeft;
            win = haveWon(player, board);
        }
        printBoard(board);
        if (win){
            System.out.println("Congratulation!! Player " + (player==-1?"X":"O") + " has won this round.");
        } else {
            System.out.println("Sorry. No more moves. End of game.");
        }
    }

    public static void printBoard(int[][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                switch (board[row][col]) {
                    case -1:
                        System.out.print("X ");
                        break;
                    case 1:
                        System.out.print("O ");
                        break;
                    default:
                        System.out.print((1+(3*row)+col) + " ");
                        break;
                }
            }
            System.out.println();
        }
    }

    public static boolean haveWon(int player, int[][] board){
        return
            (board[0][0] + board[0][1] + board[0][2] == 3*player) ||
            (board[1][0] + board[1][1] + board[1][2] == 3*player) ||
            (board[2][0] + board[2][1] + board[2][2] == 3*player) ||
            (board[0][0] + board[1][0] + board[2][0] == 3*player) ||
            (board[0][1] + board[1][1] + board[2][1] == 3*player) ||
            (board[0][2] + board[1][2] + board[2][2] == 3*player) ||
            (board[0][0] + board[1][1] + board[2][2] == 3*player) ||
            (board[0][2] + board[1][1] + board[2][0] == 3*player);
    }


    public static int readPosition(int player, int[][] board){
        int pos = -1;
        while (pos < 0){
            System.out.println("Choose your next step for "+ (player==-1?"X":"O") + ":");
            String line = sc.nextLine();
            try {
              pos = Integer.parseInt(line);
                if (pos < 1 || pos > 9){
                    System.out.println("This is not a valid position.");
                    pos = -1;
                } else {
                    int row = (pos - 1) / 3;
                    int col = (pos - 1) % 3;
                    if (board[row][col] != 0) {
                        System.out.println("This position is not empty. Choose an other one!");
                        pos = -1;
                    }
                }
            } catch (NumberFormatException nfe){
                System.out.println("This is not a valid position");
            }
        }
        return pos;
    }

}
