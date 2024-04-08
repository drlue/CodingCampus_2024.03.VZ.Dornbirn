package irem.Uebungen;

import java.util.Calendar;
//tut nicht ganz was es soll
public class Kalender {
    public static void main(String[] args) {
        // Aktuelles Datum setzen oder ein beliebiges Datum für den Test
        Calendar heute = Calendar.getInstance();
        // Für das Testen, setze das Datum manuell, z.B. 4. April 2022
        heute.set(2022, Calendar.APRIL, 4);

        druckeKalender(heute);
    }
    public static void druckeKalender(Calendar heute) {
        Calendar kalender = (Calendar) heute.clone();

        // Ersten Tag des Monats setzen
        kalender.set(Calendar.DAY_OF_MONTH, 1);
        int monat = kalender.get(Calendar.MONTH);
        int erstTagImMonat = kalender.get(Calendar.DAY_OF_WEEK);

        // Anzahl der Tage im Monat
        int tageImMonat = kalender.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Überschrift mit Monat und Jahr
        System.out.printf("%tB %<tY%n", kalender);
        System.out.println("| Mo | Di | Mi | Do | Fr | Sa | So |");

        // Leerstellen für die Tage vor dem 1. des Monats
        for (int i = 1; i < erstTagImMonat; i++) {
            System.out.print("|    ");
        }

        int tag = 1;
        while (tag <= tageImMonat) {
            // Der Heute Tag waird mit einem stern makiert

            if (heute.get(Calendar.DAY_OF_MONTH) == tag && heute.get(Calendar.MONTH) == monat) {
                System.out.printf("|%3d*", tag);
            } else {
                System.out.printf("|%3d ", tag);
            }

            // Neuer Woche
            if ((tag + erstTagImMonat - 1) % 7 == 0) {
                System.out.println("|");
            }

            tag++;
        }

        // Fülle die letzte Woche des Monats mit Leerstellen
        int letzterTag = (tageImMonat + erstTagImMonat - 1) % 7;
        if (letzterTag != 0) {
            for (int i = letzterTag; i < 7; i++) {
                System.out.print("|    ");
            }
        }
        System.out.println("|");
    }
}

