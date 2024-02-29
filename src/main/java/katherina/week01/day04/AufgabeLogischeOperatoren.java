package katherina.week01.day04;

import java.util.Random;

/*public class AufgabeLogischeOperatoren {

    public static void main(String[] args) {
        Random random = new Random();
        int zufallszahl = random.nextInt(-100, 101);
        System.out.println(zufallszahl);
        System.out.println("\nAufgabe eins: Zahl gerade UND größer als 10");
    }
*/
/*
Random random = new Random();
//Random number between 100 and 100
int randomNumber = random.nextInt(-100, 101);

Operator Präzedenz
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

    /*

    public static boolean geradeGroesserZehn(int zufallszahl) {
        try {
            return zufallszahl > 10 && (zufallszahl % 2 == 0);
        } finally {
            System.out.println(zufallszahl);
        }
    }

    public static boolean geradeGroesserZehn2(int zufallszahl) {
        boolean b = zufallszahl < 10 && (zufallszahl % 2 != 0);
        if (zufallszahl > 10 && (zufallszahl % 2 == 0)) {
            return true;
        } else (zufallszahl < 10 && (zufallszahl % 2 != 0)) {
            return false;

        }
    }
}
}
*/