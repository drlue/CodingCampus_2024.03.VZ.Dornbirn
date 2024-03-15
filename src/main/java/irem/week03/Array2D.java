package irem.week03;


import irem.week02.UserInput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Array2D {
    static Random random = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = createRandomArray(5, 5);
        printArray(arr);
        System.out.println();

       int wahl = wahlEinlesen("Hola, möchtest du die Summe der Zahlen oder die Summe der Spalten rechnen.", 1, 2);
        if (wahl == 1) {
            System.out.println("Um die Zeilsumme zu berechnen drücke die 1 \n umd die summe der spalten zu berechnen drücke die 2");
            System.out.println("Die Zeilsumme gute wahl ");
            System.out.println("Dies ist die Summe der Zufallszahlen: ");
            System.out.println(Arrays.toString(sum1(arr)));
            System.out.println();

            //spalte wird nicht gerechnet zeile dfur schon?

        } else if (wahl == 2) {
            System.out.println("Die Spaltsumme gute wahl ");
            System.out.println();
            System.out.println("Dies ist die Summe der Zufallszahlen: ");
            System.out.println(Arrays.toString(sum2(arr)));
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
                System.out.printf("Ich kann nur zwei Optionen anbieten! Gib eine Zahl zwischen %d und %d ein.\n", mindestwert, maximalwert);
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
    public static int[] sum2(int[][] arrg) {
        int sum2[] = new int[arrg.length];
        for (int i = 0; i < arrg[0].length; i++) {
            sum2[i] = 0;
            for (int value : arrg[i]) {
                sum2[i] += value;
            }
        }
        return sum2;
    }
    public static int[] sum1(int[][] arrg) {
        int sum1[] = new int[arrg.length];
        for (int i = 0; i < arrg.length; i++) {
            sum1[i] = 0;
            for (int value : arrg[i]) {
                sum1[i] += value;
            }
        }
        return sum1;
    }
}

//wird nicht richtig gerechnet





