package demian.week01.day01;

public class Sandkasten {
    public static void main(String[] args) {

        //Schleifenübung Ausgabe Zahl
        int i = 0;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i < 5);

        // String AUSGABE:
        String Ausgabe = erzeugeZeichenkette('x',10);
        System.out.println(Ausgabe);
    }

    public static String erzeugeZeichenkette(char buchstabe, int anzahl) {
        // Initialisiere eine leere Zeichenkette
        String result = "";
        // Führe die Schleife so oft aus wie die Anzahl vorgibt
        for (int i = 0; i < anzahl; i++) {
            // Füge den Buchstaben zur Zeichenkette hinzu
            result += buchstabe;
        }
        return result; // Gib die fertige Zeichenkette zurück
    }
}
