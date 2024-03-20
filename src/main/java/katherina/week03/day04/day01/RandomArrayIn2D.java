package katherina.week03.day04.day01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArrayIn2D {
    static Random random = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] randomNumber = createRandomArray(3, 3);
        printArray(randomNumber);
        System.out.println();
        System.out.println("Hi! Möchtest du die Summen pro Zeile oder die Summen pro Spalte wissen?");
        int choicemade = choice("Um die Zeilensumme zu berechnen, drücke bitte die 1.\n Um die Spaltensumme zu berechnen, drücke bitte die 2. ", 1, 2);
        if (choicemade == 1) {
            System.out.println("Die Zeilensummen! Gute Wahl.");
            System.out.println(Arrays.toString(rowsum(randomNumber)));
            System.out.println();
        } else {
            System.out.println("Die Spaltensummen! Super Wahl.");
            System.out.println(Arrays.toString(columsum(randomNumber)));
            System.out.println();
        }
    }

    public static void printArray(int[][] awoo) {

        for (int row = 0; row < awoo.length; row++) {
            System.out.println(Arrays.toString(awoo[row]));
            for (int colum = 0; colum < awoo.length; colum++) {
                //   System.out.printf("%3d", awoo[row][colum]);
            }
        }
    }

    public static int[][] createRandomArray(int size, int size2) {
        int[][] result = new int[size][size2];
        for (int index = 0; index < size; index++) {
            for (int jane = 0; jane < size2; jane++) {
                result[index][jane] = random.nextInt(0, 101);
            }
        }
        return result;
    }

    public static int choice(String message, int mindestwert, int maximalwert) {
        System.out.print(message);
        int choice = Integer.MIN_VALUE;
        while (choice < mindestwert || choice > maximalwert) {
            while (!sc.hasNextInt()) {
                System.out.println("Ungültiger Menüpunkt! Wähle eine der Optionen!");
                sc.nextLine();
                System.out.print(message);
            }
            choice = sc.nextInt();
            sc.nextLine();
            if (choice < mindestwert || choice > maximalwert) {
                System.out.printf("Ich kann nur zwei Optionen anbieten! Gib eine Zahl zwischen %d und %d ein.\n", mindestwert, maximalwert);
                System.out.print(message);
            }
        }
        return choice;
    }

    public static int[] rowsum(int[][] arrg) {
        int[] sumrow = new int[arrg.length];
        for (int index = 0; index < arrg.length; index++) {
            sumrow[index] = 0;
            for (int value : arrg[index]) {
                sumrow[index] += value;
            }
        }
        System.out.println("Dies ist die Summe der Zufallszahlen je Reihe: ");

        return sumrow;
    }

    public static int[] columsum(int[][] arrg) {
        int[] sumcolum = new int[arrg.length];
        for (int index = 0; index < arrg.length-1; index++) {
            sumcolum[index] = 0;
            for (int jane = 0; jane < arrg[index].length; jane++) {
                for (int value : arrg[index]) {
                    sumcolum[jane] += value;
                }
            }
        }
        System.out.println("Dies ist die Summe der Zufallszahlen je Spalte: ");

        return sumcolum;
    }

}
