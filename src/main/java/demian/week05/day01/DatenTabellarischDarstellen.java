package demian.week05.day01;

public class DatenTabellarischDarstellen {

    public static void main(String[] args) {

        //  AUFGABE: Daten tabellarisch darstellen
        //  Erstelle einen schönen tabellarischen Ausgabe aus den folgenden Arrays:
        //
        //  String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        //  String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        //  int[] age = {40, 78, 5, 18, 81};
        //  String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        //  float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
        //  Denke daran, dass eine Tabelle eine Kopfzeile und Trennzeichen haben kann.

        //INPUT
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        //TABLE
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|     VORNAME     |    NACHNAME     |   ALTER   |       ORT       |   ENTFERNUNG z. HAUPTSTADT   |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        printTABLE(firstName, lastName, age, place, distanceFromCapital);
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    public static void printTABLE(String[] vornamenARRAY, String[] nachnamenARRAY, int[] alterARRAY, String[] ortARRAY, float[] abstandZUcapitalARRAY) {
        for (int row = 0; row < 5; row++) {
            System.out.printf("| %-15s | %-15s | %4d J.   | %15s | %17f km         |\n" , vornamenARRAY[row], nachnamenARRAY[row], alterARRAY[row], ortARRAY[row], abstandZUcapitalARRAY[row]);
        }
    }

}
