package demian.week07.day01.Aufgabe2;

import java.util.Arrays;

public class RueckgabeArrayCalc {

    //AUFGABE:
    // Es soll eine calcMinMaxAvg(int[]) Methode erstellt werden,
    // welche das kleinste und das größte Element sowie den Durchschnitt des int[] Parameters ermittelt und
    // ein Objekt mit Min, Max und Avarage zurückgibt. Teste diese Methode ausgiebig mit verschiedenen int[],
    // verwende auch ein zufallsgeneriertes int[] mit negativen und positiven Werten.
    //
    //Erstelle die Datenklasse mit einem Sinnvollen Klassennamen und entsprechenden Attributen.
    // Achte hierbei auch auf die Korrekte Sichtbarkeit
    //Erstelle in in der Datenklasse einen Konstruktor welcher alle Werte entgegennimmt
    // und erstelle getter für alle Werte
    //Überschreibe die toString() Methode und erstelle einen schönen String mit den gegebenen Werten.


    private int[] array;
    public RueckgabeArrayCalc(int[] array){
        this.array = array;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
