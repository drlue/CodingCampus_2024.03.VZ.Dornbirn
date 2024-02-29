package luki.week01.day02;

public class Loops {
    public static void main(String[] args) {
        //1) Deklarieren und Initialisieren der Zählvariable
        //2) Prüfen der Bedingung
        //3) Wenn 2) wahr -> Ausführen des Schleifenrumpfs
        //3) Wenn 2) unwahr -> Abbruch
        //4) Modifizieren der Zählvariable
        // Gehe zu 2
        for (int i = -10; i <= 100; i++) {
            System.out.println(i);
        }

        int i = -10;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        //Alle teile einer For-Schleife sind optional
        int j = -10;
        for (; j <= 100; j++) {
            System.out.println(j);
        }

        int k = -10;
        for (; k <= 100; ) {
            System.out.println(k);
            k++;
        }
    }
}
