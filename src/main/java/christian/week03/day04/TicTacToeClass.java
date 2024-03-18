package christian.week03.day04;

import java.util.Scanner;

public class TicTacToeClass {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean win = false;
        boolean isInputValid = false;
        int roundCounter = 1;

        int input = 0;

        int[][] canvas = createCanvas(3);
        printCanvas(canvas);

        while (!win && roundCounter < 10) {

            while (!isInputValid) {
                input = inputPlayer();
                isInputValid = isInputNotUsed(canvas, input);
            }
            isInputValid = false;

            updateCanvasP1(canvas, input, 1 + roundCounter % 2);

            printCanvas(canvas);
            roundCounter++;
            win = winConditions2(canvas,1 + roundCounter % 2);

            if(roundCounter==10){
                System.out.println("Unentschieden!");
            } else if (roundCounter%2==0 &&win) {
                System.out.println("Player 1 hat gewonnen!");
            }
            else if (roundCounter%2!=0 &&win){
                System.out.println("Player 2 hat gewonnen!");
            }
        }

    }

    public static int[][] createCanvas(int size) {
        int[][] arr = new int[size][size];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = 0;
            }
        }
        return arr;
    }

    public static void printCanvas(int[][] arr) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int inputPlayer() {
        boolean valid = false;
        int input = 0;
        System.out.println("Bitte gib eine Zahl zwischen 1 und 9 ein, die noch nicht verwendet wurde1");
        while (!valid) {
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                if (sc.nextLine().isBlank() && input >= 1 && input <= 9) {
                    valid = true;
                } else {
                    System.out.println(".. wurde3");
                }
            } else {
                System.out.println("Bitte gib eine Zahl zwischen 1 und 9 ein, die noch nicht verwendet wurde2");
                sc.nextLine();
            }

        }
        return input;
    }

    public static boolean isInputNotUsed(int[][] arr, int input) {
        return (arr[(input -1) / 3][(input - 1) % 3 ] == 0);
    }

    public static void updateCanvasP1(int[][] arr, int input, int player) {
        arr[(input -1) / 3][(input - 1) % 3 ] = player;
    }


    public static boolean winConditionRow(int[][] arr, int row, int player){
        for (int col = 0; col < arr[row].length; col++) {
            if (arr[row][col] != player) {
                return false;
            }
        }
        return true;
    }

    public static boolean winConditionCol(int[][] arr, int col, int player){
        for (int row = 0; row < arr.length; row++) {
            if (arr[row][col] != player) {
                return false;
            }
        }
        return true;
    }

    public static boolean winConditionDiagBack(int[][] arr, int player){
        for (int row = 0; row < arr.length; row++) {
            if (arr[row][row] != player) {
                return false;
            }
        }
        return true;
    }

    public static boolean winConditionDiagSlasch(int[][] arr, int player){
        for (int row = 0; row < arr.length; row++) {
            if (arr[row][arr.length - 1 - row] != player) {
                return false;
            }
        }
        return true;
    }

    public static boolean winConditions2(int[][] arr, int player) {
        return  winConditionRow(arr, 0, player) ||
                winConditionRow(arr, 1, player) ||
                winConditionRow(arr, 2, player) ||
                winConditionCol(arr, 0, player) ||
                winConditionCol(arr, 1, player) ||
                winConditionCol(arr, 2, player) ||
                winConditionDiagBack(arr, player)   ||
                winConditionDiagSlasch(arr, player);
    }


//    public static boolean winConditions(int[][] arr) {
//        int sum = 0;
//        //reihe 1 Summe
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (row == 0) {
//                    if (arr[row][col] == 0) {
//                        sum=-4;
//                    } else {
//                        sum += arr[row][col];
//                    }
//                }
//
//            }
//        }
//
//        if (sum == 3) {
//            System.out.println("Player 1 has won!");
//            return true;
//        }
//        if (sum == 6) {
//            System.out.println("Player 2 has won!");
//            return true;
//        }
//        sum = 0;
//        //reihe 2 Summe
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (row == 1) {
//                    if (arr[row][col] == 0) {
//                        sum=-4;
//                    } else {
//                        sum += arr[row][col];
//                    }
//                }
//
//            }
//        }
//        if (sum == 3) {
//            System.out.println("Player 1 has won!");
//            return true;
//        }
//        if (sum == 6) {
//            System.out.println("Player 2 has won!");
//            return true;
//        }
//        //reihe 3 Summe
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (row == 2) {
//                    if (arr[row][col] == 0) {
//                        sum=-4;
//                    } else {
//                        sum += arr[row][col];
//                    }
//                }
//
//            }
//        }
//        if (sum == 3) {
//            System.out.println("Player 1 has won!");
//            return true;
//        }
//        if (sum == 6) {
//            System.out.println("Player 2 has won!");
//            return true;
//        }
//        sum = 0;
//        //spalte 1 Summe
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (col == 0) {
//                    if (arr[row][col] == 0) {
//                        sum=-4;
//                    } else {
//                        sum += arr[row][col];
//                    }
//                }
//
//            }
//        }
//        if (sum == 3) {
//            System.out.println("Player 1 has won!");
//            return true;
//        }
//        if (sum == 6) {
//            System.out.println("Player 2 has won!");
//            return true;
//        }
//        sum = 0;
//        //spalte 2 summe
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (col == 1) {
//                    if (arr[row][col] == 0) {
//                        sum=-4;
//                    } else {
//                        sum += arr[row][col];
//                    }
//                }
//
//            }
//        }
//        if (sum == 3) {
//            System.out.println("Player 1 has won!");
//            return true;
//        }
//        if (sum == 6) {
//            System.out.println("Player 2 has won!");
//            return true;
//        }
//        sum = 0;
//        //spalte 3 summe
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (col == 2) {
//                    if (arr[row][col] == 0) {
//                        sum=-4;
//                    } else {
//                        sum += arr[row][col];
//                    }
//                }
//
//            }
//        }
//        if (sum == 3) {
//            System.out.println("Player 1 has won!");
//            return true;
//        }
//        if (sum == 6) {
//            System.out.println("Player 2 has won!");
//            return true;
//        }
//        sum = 0;
//        //Diagonale \ Summe
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (row == col) {
//                    if (arr[row][col] == 0) {
//                        sum=-4;
//                    } else {
//                        sum += arr[row][col];
//                    }
//                }
//
//            }
//        }
//        if (sum == 3) {
//            System.out.println("Player 1 has won!");
//            return true;
//        }
//        if (sum == 6) {
//            System.out.println("Player 2 has won!");
//            return true;
//        }
//        sum = 0;
//        //Diagonale / Summe
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (row + col == 2) {
//                    if (arr[row][col] == 0) {
//                        sum=-4;
//                    } else {
//                        sum += arr[row][col];
//                    }
//
//                }
//            }
//
//        }
//        if (sum == 3) {
//            System.out.println("Player 1 has won!");
//            return true;
//        }
//        if (sum == 6) {
//            System.out.println("Player 2 has won!");
//            return true;
//        }
//        sum = 0;
//        return false;
//    }
}

