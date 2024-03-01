package katherina.week01.day05;

public class AufgabePrimitiveDateitypen {
    public static void main(String[] args) {
        System.out.println("\nFaktorialberechnung Nummer 1");
        System.out.println(faktorial1(4));
        System.out.println("\nFaktorialberechnung Nummer 2");
        faktorial2(20);
        System.out.println("\nFaktorialberechnung Nummer 3");
        faktorial3(20);
        System.out.println("\n0 bis 100 in 0.1er Schritten");
   //     kleineSchrittchen(100);


    }

    public static long faktorial1(int zahl) {
        if (zahl <= 1) {
            return 1;
        } else {
            return zahl * faktorial1(zahl - 1);
        }
    }

    public static long faktorial2(int zahl) {
        long teilErgebnis = 1;
        if (zahl > 1) {
            teilErgebnis = faktorial2(zahl - 1) * zahl;
        }
        System.out.printf("%2d! = %20d\n", zahl, teilErgebnis);
        return teilErgebnis;
    }
    //Zwischenschritt: Ich schnappe mir die Lösung zu Aufgabe 1. Und dann definiere ich, dass ich die Teilergebnisse auch haben will.

    public static long faktorial3(int zahl) {
        long teilErgebnis = 1;
        for (int startwert = 1; startwert <= zahl; startwert++) {
            teilErgebnis *= startwert;
            System.out.printf("%2d! = %20d\n", startwert, teilErgebnis);
        }

        return teilErgebnis;
    }
    //Das gleiche wie meine Lösung, aber weniger komplex. (Mehrere Lösungen für ein Problem sind IMMER gut vor Augen zu haben!)
    //Die Formatierungsnotation beachten: In Anführungszeichen und an einen String getackert.

  /*  public static double kleineSchrittchen(float zahl) {
        float teilErgebnis = 0.01;
        for (float startwert = 0; startwert <= zahl; startwert++) {
            teilErgebnis *=startwert;
            {

            }
        }
        return teilErgebnis;
    }
*/

}

