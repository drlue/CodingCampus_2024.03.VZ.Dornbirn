package katherina.week02.day01;

public class AufgabePrimitiveDateitypen2 {
    public static void main(String[] args) {
        System.out.println("\nDivida et Impera");
        teilHerrschaft(20);
        System.out.println("\nPi nach der Formel von Leibniz");
        System.out.println(kuchenNachLeibniz());
        System.out.println("\nPi nach der Formel von Nilakantha");
        System.out.println(kuchenNachNilakantha());
        System.out.println("\nGeheime Zahlenreihe");
        System.out.println(geheimerKuchen());
    }


    public static void teilHerrschaft(int zahl) {
        for (int startwert = 0; startwert <= zahl; startwert++) {
            System.out.println(startwert);
            System.out.println(startwert / 5);
            System.out.println(startwert / 5.0);
            System.out.println();
        }
    }

    public static double kuchenNachLeibniz() {
        double ergebnis = 0;
        int nenner = 1;
        double zaehler = 4;
        for (int genauigkeit = 0; genauigkeit < 500000000; genauigkeit++) {
            ergebnis += (zaehler / nenner);
            nenner += 2;
            ergebnis -= (zaehler / nenner);
            nenner += 2;
        }
        return ergebnis;
    }

    public static double kuchenNachNilakantha() {
        double ergebnis = 0;
        for (int wechselzahl = 2; wechselzahl < 500; wechselzahl += 2) {
            ergebnis += (4.0 / (wechselzahl * (wechselzahl + 1) * (wechselzahl + 2)));
            wechselzahl += 2;
            ergebnis -= 4.0 / (wechselzahl * (wechselzahl + 1) * (wechselzahl + 2));
            System.out.println(3 + ergebnis);
        }
        return ergebnis;
    }
//Merke: Die Funktion in der for-Schleife erhöht die Wechselzahl zwar in den Multiplikationen, aber nicht zwischen den einzelnen Schritten!

    public static double geheimerKuchen() {
        double ergebnis = 1.0;
        for (double zahl = 1.0; zahl < 10; zahl++) {
            ergebnis = ergebnis / 2 + 1 / ergebnis;
            System.out.println(zahl);
            System.out.println(ergebnis);
            System.out.println(" ");


        }
        return ergebnis;
    }
//Tadaaa! Der geheime Kuchen emthält als Inhalt die Wurzel von zwei. (Da steckt irgendwo ein Witzskript drin. Noch was, das ich am Wochenende schreiben muss.)

}