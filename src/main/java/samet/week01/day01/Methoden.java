package samet.week01.day01;

import java.sql.SQLOutput;

public class Methoden {
    public static void main(String[] args) {


        System.out.println("\nprintChars()");
        printChars("A ", 10);
        System.out.println("\nprintSquare()");
        printSquare("B ", 10);
        System.out.println("\nprintRect()");
        printRect("C ", 10, 3);
        System.out.println("\nprintTriangleBottomLeft()");
        printTriangleBottomLeft("D ", 4);
        System.out.println("\nprintTriangleTopLeft()");
        printTriangleTopLeft("E ", 5);
        System.out.println("\nprintTriangleTopRight()");
        printTriangleTopRight("F ", 5);
        System.out.println("\nprintTriangleBottomRight()");
        printTriangleBottomRight("G ", 5);
        System.out.println("\nprintEmptySquare()");
        printEmptySquare("H ", 10);
        System.out.println("\nprintEmptySquareKlein()");
        printEmptySquare("I ", 3);
        System.out.println("\nprintSlash()");
        printSlash(" J", 4, true);
        System.out.println("\nprintTriangle()");
        printTriangle("X ", 15);


    }


    public static void printChars(String txt, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(txt);
        }
        System.out.println();
    }


    public static void printSquare(String txt, int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(txt);
                if (j == width - 1) {
                    System.out.println();
                }
            }
        }
        System.out.println();

    }

    public static void printRect(String txt, int width, int height) {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(txt);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomLeft(String text, int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(text);
            }

            System.out.println();
        }
    }

    public static void printTriangleTopLeft(String text, int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(text);
            }
            System.out.println();
        }

    }

    public static void printTriangleTopRight(String text, int size) {

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col >= row) {
                    System.out.print(text);
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    public static void printTriangleBottomRight(String text, int size) {

        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size - row; col++) {
                System.out.print("  ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print(text);
            }
            System.out.println(" ");

        }
    }

    public static void printEmptySquare(String text, int size) {

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == 0 || col == 0 || row == size - 1 || col == size - 1) {
                    System.out.print(text);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printEmptySquareKlein(String text, int size) {

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == 0 || col == 0 || row == size - 1 || col == size - 1) {
                    System.out.print(text);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printSlash(String text, int size, boolean backslash) {

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col == row) {
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printTriangle(String text, int size) {

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < 2 * size - 1; col++) {
                if (row + col == size - 1 || col == row + size - 1 || row == size - 1) {
                    System.out.print(text);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

    }


}







