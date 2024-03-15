package demian.week03.day02;

import demian.week02.day02.Scanner;

import java.util.Random;

public class Array2D {
    public static void main(String[] args) {

        // AUFGABE:
        // Erstelle ein Zwei-Dimension-Array int[][] und befülle es mit Zufallszahlen von 0 bis 100.
        // Nach Eingabe von Anwender gebe zurück die Summe pro Zeile oder pro Spalte.

        int[][] array = random2DArray(3, 4, 10);
        System.out.println("Random Number 2D Array:");
        print2DArray(array);


        System.out.println("Summe einer Spalte oder Reihe bilden:");
        int rowORcol = Scanner.getINT("Wählen Sie ob sie die Summe einer Spalte oder Reihe möchten.\n1 für Reihe\n2 für Spalte\nAuswahl==>", 1, 2);
        if (rowORcol == 1) {
            int choosenRow = Scanner.getINT("Wählen sie welche Reihe summiert werden soll:", 0, array.length-1);
            System.out.println("Die Summe der Reihe " + choosenRow + " = " + sumOFrow(array, choosenRow));
        } else {
            int choosenCol = Scanner.getINT("Wählen sie welche Spalte summiert werden soll:", 0, array[0].length-1);
            System.out.println("Die Summe der Spalte " + choosenCol + " = " + sumOFcol(array, choosenCol));
        }


    }

    public static int[][] random2DArray(int rows, int cols, int randomNUMbound) {
        Random random = new Random();
        int[][] array = new int[rows][cols];
        for (int idxrow = 0; idxrow < rows; idxrow++) {
            for (int idxcol = 0; idxcol < cols; idxcol++) {
                array[idxrow][idxcol] = random.nextInt(randomNUMbound);
            }
        }
        return array;
    }

    public static void print2DArray(int[][] twoDimensionalarray) {
        for (int idxrow = 0; idxrow < twoDimensionalarray.length; idxrow++) {
            for (int idxcol = 0; idxcol < twoDimensionalarray[0].length; idxcol++) {
                System.out.printf("%3d", twoDimensionalarray[idxrow][idxcol]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int sumOFrow(int[][] array, int row){
        int sum = 0;
        for (int idx = 0; idx < array[0].length; idx++) {
            sum += array[row][idx];
        }
        return sum;
    }
    public static int sumOFcol(int[][] array, int col){
        int sum = 0;
        for (int idx = 0; idx < array.length; idx++) {
            sum += array[idx][col];
        }
        return sum;
    }
}
