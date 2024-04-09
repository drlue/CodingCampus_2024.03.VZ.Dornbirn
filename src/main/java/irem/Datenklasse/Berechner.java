package irem.Datenklasse;

public class Berechner {
    //Erstelle die Datenklasse mit einem Sinnvollen Klassennamen und entsprechenden Attributen.
    //Achte hierbei auch auf die Korrekte Sichtbarkeit
    public static Resultat berechne(int[] zahlen) {
        if (zahlen == null || zahlen.length == 0) {
            throw new IllegalArgumentException("Array darf nicht null oder leer sein.");
            //IllegalArgumentException --> Wird ausgelöst, um anzuzeigen, dass einer Methode ein unzulässiges oder
            // unangemessenes Argument übergeben wurde.
        }
        int min = zahlen[0];
        int max = zahlen[0];
        double summe = 0;

        for (int zahl : zahlen) {
            if (zahl < min) min = zahl;
            if (zahl > max) max = zahl;
            summe += zahl;
        }

        double durchschnitt = summe / zahlen.length;

        return new Resultat(min, max, durchschnitt);
    }
}
