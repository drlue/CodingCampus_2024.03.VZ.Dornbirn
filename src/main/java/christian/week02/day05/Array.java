package christian.week02.day05;

import christian.ScannerMethoden.InputZahlen2;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int dimension = InputZahlen2.getIntFromInputMessageMinMax("Gib eine Ganzzahl zwischen 1 und 100 ein", 1, 100);
        int[] arr = new int[dimension];
        arr = neuesArrayerAufReihenfolge(dimension);
        int[] arr2 = new int[dimension];
        arr2 = neuesArrayAbReihenfolge(dimension);


        for (int i = 0; i < dimension; i++) {
            System.out.println("Aufsteigend position " + i + "Wert: " + arr[i]);

        }
        for (int i = 0; i < dimension; i++) {
            System.out.println("Absteigend position " + i + "Wert: " + arr2[i]);

        }
        int[] copy1 = makeACopyOfArray(arr);
        int[] copy2 = makeACopyOfArray(arr2);
        for (int i = 0; i < dimension; i++) {
            System.out.println("Kopie Aufsteigend position " + i + "Wert: " + copy1[i]);

        }
        for (int i = 0; i < dimension; i++) {
            System.out.println("Kopie Absteigend position " + i + "Wert: " + copy2[i]);

        }

        System.out.println(Arrays.toString(copy1));
        System.out.println(Arrays.toString(copy2));
    }


    public static int[] neuesArrayerAufReihenfolge(int x) {
        int[] arr = new int[x];
        for (int arrayElement = 0; arrayElement < arr.length; arrayElement++) {
            arr[arrayElement] = arrayElement + 1;
        }
        return arr;
    }

    public static int[] neuesArrayAbReihenfolge(int size) {
        int[] arr = new int[size];
        for (int arrayElement = 0; arrayElement < arr.length; arrayElement++) {
            arr[arrayElement] = arr.length - arrayElement;
        }
        return arr;
    }

    public static int[] makeACopyOfArray(int[] orginal) {
        int[] arr = new int[orginal.length];
        for (int arrayElement = 0; arrayElement < orginal.length; arrayElement++) {
            arr[arrayElement] = orginal[arrayElement];
        }
        return arr;
    }
}
