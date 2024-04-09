package demian.week07.day01.Aufgabe1;

import java.util.Random;

public class ArrayCalc {
    //AUFGABE:
    // Wir haben die Erfahrung mit Min, Max und Avarage Rechnungen über Arrays.
    // Es soll eine gleichwertige OOP (Object Oriented Programming) Lösung erstellt werden.
    //
    //Erstelle eine Klasse mit einem sinnvollen Namen

    //Füge eine Objekt-Variable für Speichern eines int[]

    //Erstelle ein Konstruktor, der diese Variable initialisiert

    //Erstelle 3 (non-static) Funktionen calcMin(), calcMax(), calcAvg(),
    // die über die gespeicherte Member-Variable (Objekt-Variable) arbeiten.

    //Teste diese Methoden ausgiebig mit verschiedenen int[],
    // verwende auch ein zufallsgeneriertes int[] mit negativen und positiven Werten.


    private int[] array;

    //Konstruktor hat immer den Class Namen
    public ArrayCalc(int[] array){
        this.array = array;
    }

    public int calcMin(){
        int bestMin = Integer.MAX_VALUE;
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] < bestMin) {
                bestMin = array[idx];
            }
        }
        return bestMin;
    }

    public int calcMax() {
        int bestMax = Integer.MIN_VALUE;
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] > bestMax) {
                bestMax = array[idx];
            }
        }
        return bestMax;
    }

    public float avg() {
        int sum = 0;
        for (int idx = 0; idx < array.length; idx++) {
            sum += array[idx];
        }
        return (float) sum / array.length;
    }


}
