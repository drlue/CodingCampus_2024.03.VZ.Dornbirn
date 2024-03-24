package irem.HU;

import java.util.Random;

public class AufgabeArray1 {

    //Aufgabe: Random Number Array Crazy Range
    //Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.


    static Random random = new Random();
        public static void main(String[] args) {

            int[] arr = new int[10];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(101) - 50;
            }

            for (int num : arr) {
                System.out.println(num);
            }

            System.out.println(getFirstAndLast(arr));
        }

        public static String getFirstAndLast(int[] array) {
            if (array == null || array.length == 0) {
                return "Array ist leer oder null";
            } else {
                return "First: " + array[0] + ", Last: " + array[array.length - 1];
            }
        }
    }

