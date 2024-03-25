package irem.HU;

import java.util.Arrays;

public class AufgabeArray3 {

    public static void main(String[] args) {
        // Test der Methode
        int length = 10; // Beispielwert
        int[] resultArray = createAndFillArray(length);

        // Ausgabe des Arrays
        System.out.println(Arrays.toString(resultArray));
    }

    public static int[] createAndFillArray(int lenght) {
        int[] arr = new int[lenght + 1]; // Da wir bei 0 anfangen und lenght inkludieren
        for(int i = 0; i <= lenght; i++) {
            arr[i] = i;
        }
        return arr;
    }

}
