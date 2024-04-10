package katherina.week06.day03;

import java.util.Random;
import java.util.Vector;

public class ZufallsVektor {
    public static void main(String[] args) {
        Vector<Integer> zufallsZahl = new Vector<Integer>();
        Random random = new Random();

        for (int index = 0; index < 20; index++) {
            zufallsZahl.add(random.nextInt(0, 101));
        }

        System.out.println("Zufallszahlen:");
        System.out.println(zufallsZahl);
        int countEven = geradeZahlen(zufallsZahl);
        System.out.println("Es gibt " + countEven + " gerade Zahlen hier.");
        System.out.println();
        int countUneven = ungeradeZahlen(zufallsZahl);
        System.out.println("Es gibt " + countUneven + " ungerade Zahlen hier.");
        kleinsteZahl(zufallsZahl);

    }

    public static int geradeZahlen(Vector<Integer> zufallsZahl) {
        int count = 0;
        for (int index = 0; index < zufallsZahl.size(); index++) {
            if (zufallsZahl.get(index) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int ungeradeZahlen(Vector<Integer> zufallsZahl) {
        int count = 0;
        for (int index = 0; index < zufallsZahl.size(); index++) {
            if (zufallsZahl.get(index) % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int ungeradeZahlenByGyula(Vector<Integer> zufallsZahl) {
        int count = 0;
        for (Integer value : zufallsZahl) {
            if (value % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int kleinsteZahl(Vector<Integer> zufallsZahl) {
        int minNumber = 0;
        for (int index = 0; index < zufallsZahl.size(); index++) {

        }
        return minNumber;
    }

    //Suche nach der kleinsten Zahl
    //Suche nach der größten Zahl
    //Sortiere die Elementen absteigend
    //Lösche alle Ungerade Zahlen
}