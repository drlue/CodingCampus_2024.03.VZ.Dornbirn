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
        fillCanvasEmpty(canvas);

        while (!win && roundCounter < 10) {

            while (!isInputValid) {
                input = inputPlayer();
                isInputValid = isInputNotUsed(canvas, input);
            }
            isInputValid = false;

            if (roundCounter % 2 != 0) {
                updateCanvasP1(canvas, input);
            } else {
                updateCanvasP2(canvas, input);
            }

            printCanvas(canvas);
            roundCounter++;
            win = winConditions(canvas);

        }

    }

    public static int[][] createCanvas(int size) {
        int[][] arr = new int[size][size];
        return arr;
    }

    public static void fillCanvasEmpty(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = 0;
            }
        }
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
                if (input >= 1 || input <= 9) {
                    valid = true;
                }
            } else {
                System.out.println("Bitte gib eine Zahl zwischen 1 und 9 ein, die noch nicht verwendet wurde2");
                sc.nextLine();
            }

        }
        return input;
    }

    public static boolean isInputNotUsed(int[][] arr, int input) {
        switch (input) {
            case 1:
                if (arr[0][0] == 0) {
                    return true;
                }
                else {
                    return false;
                }
            case 2:
                if (arr[0][1] == 0) {
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (arr[0][2] == 0) {
                    return true;
                } else {
                    return false;
                }
            case 4:
                if (arr[1][0] == 0) {
                    return true;
                } else {
                    return false;
                }
            case 5:
                if (arr[1][1] == 0) {
                    return true;
                } else {
                    return false;
                }
            case 6:
                if (arr[1][2] == 0) {
                    return true;
                } else {
                    return false;
                }
            case 7:
                if (arr[2][0] == 0) {
                    return true;
                } else {
                    return false;
                }
            case 8:
                if (arr[2][1] == 0) {
                    return true;
                } else {
                    return false;
                }
            case 9:
                if (arr[2][2] == 0) {
                    return true;
                } else {
                    return false;
                }
            default:
                return false;
        }
    }

    public static void updateCanvasP1(int[][] arr, int input) {

        switch (input) {
            case 1:
                arr[0][0] = 1;
                break;
            case 2:
                arr[0][1] = 1;
                break;
            case 3:
                arr[0][2] = 1;
                break;
            case 4:
                arr[1][0] = 1;
                break;
            case 5:
                arr[1][1] = 1;
                break;
            case 6:
                arr[1][2] = 1;
                break;
            case 7:
                arr[2][0] = 1;
                break;
            case 8:
                arr[2][1] = 1;
                break;
            case 9:
                arr[2][2] = 1;
                break;
        }

    }

    public static void updateCanvasP2(int[][] arr, int input) {

        switch (input) {
            case 1:
                arr[0][0] = 2;
                break;
            case 2:
                arr[0][1] = 2;
                break;
            case 3:
                arr[0][2] = 2;
                break;
            case 4:
                arr[1][0] = 2;
                break;
            case 5:
                arr[1][1] = 2;
                break;
            case 6:
                arr[1][2] = 2;
                break;
            case 7:
                arr[2][0] = 2;
                break;
            case 8:
                arr[2][1] = 2;
                break;
            case 9:
                arr[2][2] = 2;
                break;
        }
    }

    public static boolean winConditions(int[][] arr) {
        int sum = 0;
        //reihe 1 Summe
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (row == 0) {
                    if (arr[row][col] == 0) {
                        sum=-4;
                    } else {
                        sum += arr[row][col];
                    }
                }

            }
        }

        if (sum == 3) {
            System.out.println("Player 1 has won!");
            return true;
        }
        if (sum == 6) {
            System.out.println("Player 2 has won!");
            return true;
        }
        sum = 0;
        //reihe 2 Summe
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (row == 1) {
                    if (arr[row][col] == 0) {
                        sum=-4;
                    } else {
                        sum += arr[row][col];
                    }
                }

            }
        }
        if (sum == 3) {
            System.out.println("Player 1 has won!");
            return true;
        }
        if (sum == 6) {
            System.out.println("Player 2 has won!");
            return true;
        }
        //reihe 3 Summe
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (row == 2) {
                    if (arr[row][col] == 0) {
                        sum=-4;
                    } else {
                        sum += arr[row][col];
                    }
                }

            }
        }
        if (sum == 3) {
            System.out.println("Player 1 has won!");
            return true;
        }
        if (sum == 6) {
            System.out.println("Player 2 has won!");
            return true;
        }
        sum = 0;
        //spalte 1 Summe
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (col == 0) {
                    if (arr[row][col] == 0) {
                        sum=-4;
                    } else {
                        sum += arr[row][col];
                    }
                }

            }
        }
        if (sum == 3) {
            System.out.println("Player 1 has won!");
            return true;
        }
        if (sum == 6) {
            System.out.println("Player 2 has won!");
            return true;
        }
        sum = 0;
        //spalte 2 summe
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (col == 1) {
                    if (arr[row][col] == 0) {
                        sum=-4;
                    } else {
                        sum += arr[row][col];
                    }
                }

            }
        }
        if (sum == 3) {
            System.out.println("Player 1 has won!");
            return true;
        }
        if (sum == 6) {
            System.out.println("Player 2 has won!");
            return true;
        }
        sum = 0;
        //spalte 3 summe
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (col == 2) {
                    if (arr[row][col] == 0) {
                        sum=-4;
                    } else {
                        sum += arr[row][col];
                    }
                }

            }
        }
        if (sum == 3) {
            System.out.println("Player 1 has won!");
            return true;
        }
        if (sum == 6) {
            System.out.println("Player 2 has won!");
            return true;
        }
        sum = 0;
        //Diagonale \ Summe
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (row == col) {
                    if (arr[row][col] == 0) {
                        sum=-4;
                    } else {
                        sum += arr[row][col];
                    }
                }

            }
        }
        if (sum == 3) {
            System.out.println("Player 1 has won!");
            return true;
        }
        if (sum == 6) {
            System.out.println("Player 2 has won!");
            return true;
        }
        sum = 0;
        //Diagonale / Summe
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (row + col == 2) {
                    if (arr[row][col] == 0) {
                        sum=-4;
                    } else {
                        sum += arr[row][col];
                    }

                }
            }

        }
        if (sum == 3) {
            System.out.println("Player 1 has won!");
            return true;
        }
        if (sum == 6) {
            System.out.println("Player 2 has won!");
            return true;
        }
        sum = 0;
        return false;
    }
}

