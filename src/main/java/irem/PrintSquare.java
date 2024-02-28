package irem;

import irem.Print.Characters;

public class PrintSquare {
    public static void main(String[] args) {
        System.out.println("printSquareByGyula()");
        //printSquareByGyula("X ", 10);
        //printTriangleTopLeftByFranco("A ", 5);

        printSquare("X ", 6);
    }

    public static void printSquare(String text, int size) {
        int x = 0;
        while (x < size) {
            Characters.printChars(text, size);
            ++x;
        }
    }


    public static void printSquareByGyula(String text, int size){
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopLeftByFranco(String text, int size) {

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size - row; col++) {
                System.out.print(text);
            }
            System.out.println();

        }
    }

}
