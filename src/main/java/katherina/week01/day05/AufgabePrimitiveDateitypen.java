package katherina.week01.day05;

public class AufgabePrimitiveDateitypen {
    public static void main(String[] args) {
        System.out.println("\nFaktorialberechnung Nummer 1");
        System.out.println(faktorial1(4));
        System.out.println("\nFaktorialberechnung Nummer 2");
        System.out.println(faktorial2(20));
        System.out.println("\nFaktorialberechnung Nummer 3");
        System.out.println(faktorial3(20));
    }

    private static long faktorial1(int zahl) {
        if (zahl <= 1) {
            return 1;
        } else {
            return zahl * faktorial1(zahl - 1);
        }
    }

    private static long faktorial2(int zahl) {
        if (zahl <= 1) {
            return 1;
        } else {
            long teilErgebnis = faktorial2(zahl - 1);
            System.out.println(teilErgebnis);
            return zahl * teilErgebnis;
        }
    }
    //Zwischenschritt: Ich schnappe mir die Lösung zu Aufgabe 1. Und dann definiere ich, dass ich die Teilergebnisse auch haben will.

    private static long faktorial3(int zahl) {
        if (zahl <= 1) {
            return 1;
        } else {
            long teilErgebnis = faktorial3(zahl - 1);
            System.out.println(teilErgebnis);
            return zahl * teilErgebnis;
        }
    }
}
