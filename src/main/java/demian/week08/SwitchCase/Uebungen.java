package demian.week08.SwitchCase;

import ardijanla.ConsoleColors;

public class Uebungen {

    public static void main(String[] args) {

        //Wochentag zu Nummer übersetzen:

        //Schreibe ein Programm, das den Namen eines Wochentags als Eingabe erhält und
        // die entsprechende Nummer des Wochentags ausgibt. Verwende dafür eine Switch-Case-Struktur.

        String wochentag = "Dienstag";
        int wochentagNummer;

        switch (wochentag) {
            case "Montag":
                wochentagNummer = 1;
                break;
            case "Dienstag":
                wochentagNummer = 2;
                break;
            case "Mittwoch":
                wochentagNummer = 3;
                break;
            case "Donnerstag":
                wochentagNummer = 4;
                break;
            case "Freitag":
                wochentagNummer = 5;
                break;
            case "Samstag":
                wochentagNummer = 6;
                break;
            case "Sonntag":
                wochentagNummer = 7;
                break;
            default:
                wochentagNummer = -1; // Fehlerfall, wenn der Wochentag nicht erkannt wird
                break;
        }

        System.out.println();
        System.out.printf("%sÜbung Ziffer des Wochentags:%s%n", ConsoleColors.BLUE, ConsoleColors.RESET);
        System.out.println(wochentag + " ist der Wochentag Nummer " + wochentagNummer);

        //Monatsnamen zu Tagen übersetzen:

        //Schreibe ein Programm, das den Namen eines Monats erhält und die Anzahl der Tage in diesem Monat ausgibt.
        // Verwende dafür eine Switch-Case-Struktur.

        String monat = "df";
        int tagesanzahl = 0;

        switch (monat) {
            case "Jänner":
                tagesanzahl = 31;
                break;
            case "Februar":
                tagesanzahl = 28;
                break;
            case "März":
                tagesanzahl = 31;
                break;
            case "April":
                tagesanzahl = 30;
                break;
            case "Mai":
                tagesanzahl = 31;
                break;
            case "Juni":
                tagesanzahl = 30;
                break;
            case "Juli":
                tagesanzahl = 31;
                break;
            case "August":
                tagesanzahl = 31;
                break;
            case "September":
                tagesanzahl = 30;
                break;
            case "Oktober":
                tagesanzahl = 31;
                break;
            case "November":
                tagesanzahl = 30;
                break;
            case "Dezember":
                tagesanzahl = 31;
                break;
            default:
                tagesanzahl = Integer.MIN_VALUE;

        }
        System.out.println();
        System.out.printf("%sÜbung Tagesanzahl nach Monat:%s%n", ConsoleColors.BLUE, ConsoleColors.RESET);
        System.out.println("Der Monat " + monat + " hat " + tagesanzahl + " Tage");

        //Jahreszeit bestimmen:
        //Schreibe ein Programm, das den Monat als Eingabe erhält und die entsprechende Jahreszeit ausgibt.
        // Verwende dafür eine Switch-Case-Struktur.

        String months = "Jänner";
        String jahreszeit;

        switch (months) {
            case "Jänner":
            case "Februar":
            case "Dezember":
                jahreszeit = "Winter";
                break;
            case "März":
            case "April":
            case "Mai":
                jahreszeit = "Frühling";
                break;
            case "Juni":
            case "Juli":
            case "August":
                jahreszeit = "Sommer";
                break;
            case "September":
            case "Oktober":
            case "November":
                jahreszeit = "Herbst";
                break;
            default:
                jahreszeit = "????? (" + months + " ist kein Monat)";
        }

        System.out.println();
        System.out.printf("%sÜbung Jahreszeitzuordnung:%s%n", ConsoleColors.BLUE, ConsoleColors.RESET);
        System.out.println(months + " ist im " + jahreszeit);
    }
}
