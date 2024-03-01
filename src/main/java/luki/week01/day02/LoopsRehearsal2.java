package luki.week01.day02;

public class LoopsRehearsal2 {
    public static void main(String[] args) {
        //Summiere alle geraden Zahlen von 0 bis inklusive 100

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

        //Bilde die Summe der Zahlen von 0 bis inklusive 100 folgendermaßen:
        //-wenn die Zahl gerade ist zähle sie zur Summe hinzu
        //-wenn die Zahl ungerade ist, ziehe sie von der Summe ab

        int sum1 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum1 = sum1 + i;
            } else {
                sum1 = sum1 - i;
            }
        }
        System.out.println(sum1);


        //Summiere alle Zahlen von 0 bis inklusive 100 nach folgender Bedingung:
        //Wenn die Zahl durch 3 Teilbar ist ohne Rest, dann multipliziere Sie mit der Zahl - 1
        //Beginne mit der Initialsumme von 1
        int sum2 = 1;
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0) {
                sum2 = sum2 * (i - 1);
                System.out.println("i: " + i + " -> " + sum2);
            }
        }
        System.out.println(sum2);

        //Beginne mit der Initialsumme von 1
        double sum3 = 1;
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0) {
                sum3 = sum3 / (i - 1);
                System.out.println("Division: i: " + i + " -> " + sum3);
            }
        }
        System.out.println("Division: "+sum3);

        //0) Schleife Starten
        //1) Deklarieren und initialisieren der Zählvariable
        //2) Prüfen der Bedingung
        //3) Wenn Bedingung wahr ausführen des Schleifenrumpfs
        //3) Wenn Bedingung nicht wahr abbruch
        //4) Modifizieren der Zählvariable
        //5) Gehe nach -> 2)
        
        // For Schleife
        // 1) Deklarieren und initialisieren der Zählvariable
        // 2) Überprüfen der Bedingung
        // 3) Wenn wahr, Schleifenrumpf ausführen
        // 3) Wenn nicht wahr, abbruch
        // 4) Modifizieren der Zählvariable
        // 5) gehe zu 2)
    }
}
