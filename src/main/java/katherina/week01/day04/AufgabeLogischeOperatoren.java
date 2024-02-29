package katherina.week01.day04;

import java.util.Random;

public class AufgabeLogischeOperatoren {

    public static void main(String[] args) {
        //   Random random = new Random();
        //   int zufallszahl = random.nextInt(-100, 101);
        System.out.println("\nAufgabe eins: Zahl gerade UND größer als 10");
        //   System.out.println("Generierte Zufallszahl:" + zufallszahl);
        System.out.println(geradeGroesserZehn(16));
        System.out.println(geradeGroesserZehn2(3));
        System.out.println("\nAufgabe zwei: Zahl kleiner als 5 UND größer als 100");
        System.out.println(kleinerFuenfGroesserHundert(3));
        System.out.println(kleinerFuenfGroesserHundert2(7));
        System.out.println("\nAufgabe drei: Zahl positiv und ungerade");
        System.out.println(positivUngerade(-1));
        System.out.println(positivUngerade2(13));
        System.out.println("\nAufgabe vier: Zahl negativ, aber nicht -1");
        System.out.println(negativNichtMinusEins(-1));
        System.out.println(negativNichtMinusEins2(13));
        System.out.println("\nAufgabe fünf: Zahl größer oder gleich 5, und kleiner als 100");
        System.out.println(mindestensFuenfUndUnterHundert(5));
        System.out.println(mindestensFuenfUndUnterHundert2(3));
        System.out.println("\nAufgabe sechs: Zahl ist ohne Rest durch 3 oder 16 teilbar, aber nicht durch 32");
        System.out.println(teilbarDurchDreiSechszehnAberNichtZweiunddreissig(5));
        System.out.println(teilbarDurchDreiSechszehnAberNichtZweiunddreissig2(30));
        System.out.println("\nAufgabe sieben: Zahl ist ein Schaltjahr");
        System.out.println(schaltjahr(100));
        System.out.println(schaltjahr2(8));
        System.out.println("\nAufgabe acht: Zahl größer gleich lowerLimit und kleiner gleich upperLimit");
        System.out.println(lowerLimitUpperLimit(100));
        System.out.println(lowerLimitUpperLimit2(-102));
        System.out.println("\nAufgabe neun: Zahl liegt exakt zwischen Obergrenze und Untergrenze");
        System.out.println(middleNumber(0));
        System.out.println(middleNumber2(-37));
    }
/*
Random random = new Random();
//Random number between 100 and 100
int randomNumber = random.nextInt(-100, 101);

Folgende Auflistung zeigt in welcher Reihenfolge Ausdrücke ausgewertet werden:

Klammern ()
Postfix-Operatoren (z.B.: i++, i--)
Präfix-Operatoren (z.B.: ++i, --i, -i, !)
Multiplikation, Division, Modulo (%)
Addition, Subtraktion
Relationale Operatoren (z.B.: <, >, <=, >=)
Gleichheitsoperatoren (==, !=)
Logisches "und" (&&)
Logisches "oder" (||)
Zuweisungsoperatoren (z.B.:, =, +=, -=)
 */

    public static boolean geradeGroesserZehn(int wert) {
        try {
            return wert > 10 && (wert % 2 == 0);
        } finally {
            System.out.println(wert);
        }
    }

    public static boolean geradeGroesserZehn2(int zufallszahl) {
        if (zufallszahl > 10 && (zufallszahl % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean kleinerFuenfGroesserHundert(int wert) {
        try {
            return wert < 5 || wert > 100;
        } finally {
            System.out.println(wert);
        }
    }

    public static boolean kleinerFuenfGroesserHundert2(int wert) {
        if (wert < 5 || wert > 100) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean positivUngerade(int wert) {
        try {
            return wert > 0 && (wert % 2 != 0);
        } finally {
            System.out.println(wert);
        }
    }

    public static boolean positivUngerade2(int wert) {
        if (wert > 0 && (wert % 2 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean negativNichtMinusEins(int wert) {
        try {
            return wert > 0 && (wert != -1);
        } finally {
            System.out.println(wert);
        }
    }

    public static boolean negativNichtMinusEins2(int wert) {
        if (wert > 0 && (wert != -1)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean mindestensFuenfUndUnterHundert(int wert) {
        try {
            return wert >= 5 && wert < 100;
        } finally {
            System.out.println(wert);
        }
    }

    public static boolean mindestensFuenfUndUnterHundert2(int wert) {
        if (wert >= 5 && wert < 100) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean teilbarDurchDreiSechszehnAberNichtZweiunddreissig(int wert) {
        try {
            return ((wert % 3 == 0) || (wert % 16 == 0)) && (wert % 32 != 0);
        } finally {
            System.out.println(wert);
        }
    }

    public static boolean teilbarDurchDreiSechszehnAberNichtZweiunddreissig2(int wert) {
        if (((wert % 3 == 0) || (wert % 16 == 0)) && (wert % 32 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean schaltjahr(int wert) {
        try {
            return ((wert % 4 == 0) && (wert % 100 != 0));
        } finally {
            System.out.println(wert);
        }
    }

    public static boolean schaltjahr2(int wert) {
        if (((wert % 4 == 0) && (wert % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean lowerLimitUpperLimit(int wert) {
        int untergrenze = -100; int obergrenze = 101;
        try {
            return ((wert >= untergrenze) && (wert <= obergrenze));
        } finally {
            System.out.println(wert);
        }
    }

    public static boolean lowerLimitUpperLimit2(int wert) {
        int untergrenze = -100; int obergrenze = 101;
        if ((wert >= untergrenze) && (wert <= obergrenze)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean middleNumber(int wert) {
        int untergrenze = -100; int obergrenze = 101;
        try {
            return (wert == (untergrenze + obergrenze)/2);
        } finally {
            System.out.println(wert);
        }
    }

    public static boolean middleNumber2(int wert) {
        int untergrenze = -100; int obergrenze = 101;
        if ((wert == (untergrenze + obergrenze)/2)) {
            return true;
        } else {
            return false;
        }
    }
}


