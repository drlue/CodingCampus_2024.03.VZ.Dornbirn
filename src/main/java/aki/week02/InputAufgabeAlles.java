package aki.week02;

import aki.week01.day01.AufgabeChar;

import java.util.Scanner;

public class InputAufgabeAlles {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int zahl = InputUebung.userNumbers("Write down a number and you will get a Empty Square: ", 0, 1000);
        int emptySquare = AufgabeChar.printEmptySquare("x", zahl);
        System.out.println();
        int zahl1 = InputUebung.userNumbers("Write down again a number but this time for a Triangle!: ", 0, 1000);
        int emptyTriangle = AufgabeChar.printTriangle("x", zahl1);
        System.out.println("I hope you like this, have a nice day!");
    }
}
