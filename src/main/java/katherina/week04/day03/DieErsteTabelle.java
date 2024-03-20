package katherina.week04.day03;

//Erstelle einen schönen tabellarischen Ausgabe aus den folgenden Arrays:

//
// Denke daran, dass eine Tabelle eine Kopfzeile und Trennzeichen haben kann.


import java.util.Arrays;

public class DieErsteTabelle {
    public static void main(String[] args) {
        System.out.printf("Vorname %-6s ","");
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil       ", "Daniel   ", "Elmar"};
        String message = String.join(" | ", firstName);
        System.out.println(Arrays.toString(new String[]{message}));
        System.out.printf("Nachname %-5s ","");
        String[] lastName = {"Klein", "Kinderdorfer ", "Al Elmenar", "Schmidt", "Simma"};
        String message2 = String.join("   | ", lastName);
        System.out.println(Arrays.toString(new String[]{message2}));
        System.out.printf("Alter%-9s ","");
        int[] age = {40, 78, 5, 18, 81};
        String message3 = String.join(" | ", Arrays.toString(age));
        System.out.println(Arrays.toString(new String[]{message3}));
        System.out.printf("Wohnort%-7s ","");
        String[] place = {"Wien ", "Schwarzach   ", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        String message4 = String.join("   | ", place);
        System.out.println(Arrays.toString(new String[]{message4}));
        System.out.printf("Entfernung zur \nHauptstadt %-3s ","");
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
        System.out.println(Arrays.toString(distanceFromCapital));

    }
}
