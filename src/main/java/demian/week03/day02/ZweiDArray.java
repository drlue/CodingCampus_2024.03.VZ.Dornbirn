package demian.week03.day02;

import java.util.Arrays;
import java.util.Random;

public class ZweiDArray {
    public static void main(String[] args) {

        // AUFGABE:
        // Erstelle ein Zwei-Dimension-Array int[][] und befülle es mit Zufallszahlen von 0 bis 100.
        // Nach Eingabe von Anwender gebe zurück die Summe pro Zeile oder pro Spalte.

        int[][] array = random2DArray(10, 10, 101);
        System.out.println("Random Number 2D Array:");
        print2DArray(array);


    }

    public static int[][] random2DArray(int rows, int cols, int randomNUMbound) {
        Random random = new Random();
        int[][] array = new int[rows][cols];
        for (int idxrow = 0; idxrow < rows; idxrow++) {
            for (int idxcol = 0; idxcol < cols; idxcol++) {
                array[idxcol][idxrow] = random.nextInt(randomNUMbound);
            }
        }
        return array;
    }

    public static void print2DArray(int[][] twoDimensionalarray) {
        for (int idxcol = 0; idxcol < twoDimensionalarray.length; idxcol++) {
            for (int idxrow = 0; idxrow < twoDimensionalarray[0].length; idxrow++) {
                System.out.printf("%3d",twoDimensionalarray[idxcol][idxrow]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
