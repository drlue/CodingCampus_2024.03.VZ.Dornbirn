package irem.week03;


import irem.week02.UserInput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


//void für summ fehlt
public class Array2D {
    static Random random = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = createRandomArray(15, 20);
        printArray(arr);
        System.out.println();

        int wahl = wahlEinlesen("Bitte wählen Sie nun: ", 1, 2);
        if (wahl == 1) {
            System.out.println("Hola, möchtest du die Summe der Zahlen oder die Summe der Spalten.");
            int operator = UserInput.getIntFromConsole("Um die Zeilsumme zu berechnen drücke die 1 \n umd die summe der spalten zu berechnen drücke die 2", -999999999, 999999999);
            System.out.printf("Die Zeilsumme gute wahl ");
            System.out.println();

        } else if (wahl == 2) {
            System.out.printf("Die Spaltsumme gute wahl ");
            System.out.println();
        }

    }

    public static int[][] createArray2D(int row, int col) {
        int[][] result = new int[row][col];
        for (int irow = 0; irow < result.length; irow++) {

            for (int icol = 0; icol < result[irow].length; icol++) {
                result[irow][icol] = 7;
            }
        }
        return result;
    }

    public static void printArray(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
            for (int col = 0; col < arr.length; col++) {

            }
        }
    }

    public static int wahlEinlesen(String message, int mindestwert, int maximalwert) {
        System.out.print(message);
        int wahl = Integer.MIN_VALUE;
        while (wahl < mindestwert || wahl > maximalwert) {
            while (!sc.hasNextInt()) {
                System.out.println("Ungültiger Menüpunkt! Wähle eine der Optionen!");
                sc.nextLine();
                System.out.print(message);
            }
            wahl = sc.nextInt();
            sc.nextLine();
            if (wahl < mindestwert || wahl > maximalwert) {
                System.out.printf("Ich kann nur vier Rechenarten ausführen! Gib eine Zahl zwischen %d und %d ein.\n", mindestwert, maximalwert);
                System.out.print(message);
            }
        }
        return wahl;
    }

    public static int[][] createRandomArray(int size, int size1) {
        int[][] arr = new int[size][size1];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                arr[i][j] = random.nextInt(0, 101);
            }

        }
        return arr;
    }
}





