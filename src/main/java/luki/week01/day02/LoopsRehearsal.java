package luki.week01.day02;

public class LoopsRehearsal {
    public static void main(String[] args) {
        //Eine Schleife die von -2 bis inklusive +20 zählt in 3er Schritten
        System.out.println("-2 bis inklusive 20, 3er Schritte");
        for (int i = -2; i <= 20; i += 3) {
            System.out.println(i);
        }

        System.out.println("-100 bis inklusive 100, 1er Schritte");
        //Eine Schleife die von -100 bis inklusive +100 in 1er Schritten zählt
        for (int i = -100; i <= 100; i += 1) {
            System.out.println(i);
        }

        //Eine Schleife die von -10 bis inklusive +10 zählt, in 1er Schritten
        //aber nur jede gerade Zahl ausgibt
        for (int i = -10; i <= 10; i += 1) {
            int rest = i % 2;
            if (rest == 0) {
                System.out.println(i + " ist gerade");
            }
        }

        //Eine Schleife die von +10 bis inklusive -1, in 1er Schritten zählt
        for (int zahl = 10; zahl >= -1; zahl--) {
            System.out.println(zahl);
        }

        //Eine Schleife die von 30 bis inklusive 50 zählt und alle Zahlen zusammenrechnet
        //Die Ausgabe erfolgt nach der Schleife
        int sum = 0;
        for (int i = 30; i <= 50; i++) {
            sum = sum + i;
        }
        System.out.println("Die Summe von 30 bis 50 ist: " + sum);

        //Eine Schleife die von 30 bis exklusive 10 zählt in 2er Schritten
        for (int i = 30; i > 10; i -= 2) {
            System.out.println(i);
        }

        //Eine Schleife die von 1 bis exklusive 2 zählt in 1er Schritten
        for (int i = 1; i < 2; i += 1) {
            System.out.println(i);
        }


    }
}
