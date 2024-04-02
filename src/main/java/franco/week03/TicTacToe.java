package franco.week03;

import java.util.Scanner;

import static franco.week02.day03.UserInputNameAndNumber.getTextFromUser;

public class TicTacToe {
    public static Scanner scan = new Scanner(System.in);
    public static String player1;
    public static String player2;

    public static void main(String[] args) {
        player1 = getTextFromUser("Player 1 please enter your name: ");
        player2 = getTextFromUser("Player 2 please enter your name:  ");
        char[][] board = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        while (true) {
            printBoard(board);
            player1Turn(player1, board);
            if (isGameFinished(board)) {
                break;
            }
            printBoard(board);
            player2Turn(player2, board);
            if (isGameFinished(board)) {
                break;
            }
            printBoard(board);
        }
    }
    private static Boolean isPlaceFree(char[][] board, String position) {
        //Check if the space is available
        switch (position) {
            case "1":
                if (board[2][0] == ' ') {
                    return true;
                } else {
                    System.out.println("Position 1 is not available.");
                    return false;
                }
            case "2":
                if (board[2][1] == ' ') {
                    return true;
                } else {
                    System.out.println("Position 2 is not available.");
                    return false;
                }
            case "3":
                if (board[2][2] == ' ') {
                    return true;
                } else {
                    System.out.println("Position 3 is not available.");
                    return false;
                }
            case "4":
                if (board[1][0] == ' ') {
                    return true;
                } else {
                    System.out.println("Position 4 is not available.");
                    return false;
                }
            case "5":
                if (board[1][1] == ' ') {
                    return true;
                } else {
                    System.out.println("Position 5 is not available.");
                    return false;
                }
            case "6":
                if (board[1][2] == ' ') {
                    return true;
                } else {
                    System.out.println("Position 6 is not available.");
                    return false;
                }
            case "7":
                if (board[0][0] == ' ') {
                    return true;
                } else {
                    System.out.println("Position 7 is not available.");
                    return false;
                }
            case "8":
                if (board[0][1] == ' ') {
                    return true;
                } else {
                    System.out.println("Position 8 is not available.");
                    return false;
                }
            case "9":
                if (board[0][2] == ' ') {
                    return true;
                } else {
                    System.out.println("Position 9 is not available.");
                    return false;
                }
            default:
                // If the position is not between 1 and 9, return false and print a message
                System.out.println("Invalid position.");
                return false;
        }
    }

    private static void player1Turn(String player1, char[][] board) {
        System.out.println(player1 + " where would like to play(1-9)");
        String player1Move;
        while (true) {
            player1Move = scan.nextLine();
            if
            (isPlaceFree(board, player1Move)) {
                break;
            }
        }
        placeMove(board, player1Move, 'X');
    }

    private static void player2Turn(String player2, char[][] board) {
        System.out.println(player2 + " where would like to play(1-9)");
        String player2Move;
        while (true) {
            player2Move = scan.nextLine();
            if (isPlaceFree(board, player2Move)) {
                break;
            }
        }
        placeMove(board, player2Move, 'O');
    }

    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }

    private static void placeMove(char[][] board, String position, char symbol) {
        switch (position) {
            case "1":
                board[2][0] = symbol;
                break;
            case "2":
                board[2][1] = symbol;
                break;
            case "3":
                board[2][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[0][0] = symbol;
                break;
            case "8":
                board[0][1] = symbol;
                break;
            case "9":
                board[0][2] = symbol;
                break;
            default:
                System.out.println("Please choice a number in range(1-9) and a free spot");
        }
    }

    public static boolean isGameFinished(char[][] board) {
        if (hasSomebodyWon(board, 'X')) {
            printBoard(board);
            System.out.println(player1 + " won the game!");
            return true;
        }
        if (hasSomebodyWon(board, 'O')) {
            printBoard(board);
            System.out.println(player2 + " won the game!");
            return true;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        printBoard(board);
        System.out.println("Tie game buddies!");
        return true;
    }

    private static boolean hasSomebodyWon(char[][] board, char symbol) {
        if ((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
                (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
                (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||
                (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
                (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
                (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||
                (board[2][0] == symbol && board[1][1] == symbol && board[0][2] == symbol) ||
                (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)) {
            return true;
        } else {
            return false;
        }
    }
}
