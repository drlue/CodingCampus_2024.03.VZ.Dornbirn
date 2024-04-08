package katherina.week06.day01.Datenklasse;

//Aufgabe: Datenklasse
//Erstelle die Datenklasse mit einem Sinnvollen Klassennamen und entsprechenden Attributen. Achte hierbei auch auf die Korrekte
// Sichtbarkeit
//Erstelle in in der Datenklasse einen Konstruktor welcher alle Werte entgegennimmt und erstelle getter für alle Werte
//Überschreibe die toString() Methode und erstelle einen schönen String mit den gegebenen Werten.
//
// int entspricht dem Objekt	java.lang.Integer - Erklärung:	Ganzzahl in Zweierkomplent Darstellung, max: 231-1, min: -231


import java.util.Arrays;

import static katherina.week06.day01.Datenklasse.DieKlasseMitDenWerten.*;

public class DatenobjektRueckgabe {

    public static void main(String[] args) {
        DieKlasseMitDenWerten zahlenArray = new DieKlasseMitDenWerten (new int[]{random.nextInt(10)});
        //DieKlasseMitDenWerten zahlenArray = new DieKlasseMitDenWerten (new int[]{15, -800, 7, 23000, 2024, 315, -9, 18, -30, 1247});
       // DieKlasseMitDenWerten zahlenArray = new DieKlasseMitDenWerten (new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(Arrays.toString(new DieKlasseMitDenWerten[]{zahlenArray}));

        System.out.println();
        zahlenArray.getArray(zahlenArray);

        System.out.println("Array-Statistik:");
        System.out.println("Größter Wert: " + maximum());
        System.out.println("Kleinster Wert: " + minimum());
        System.out.println("Durchschnitt: " + average());
    }

}
