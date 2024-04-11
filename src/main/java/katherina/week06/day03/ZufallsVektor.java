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
        System.out.print("Die kleinste Zahl lautet: ");
        System.out.println(kleinsteZahl(zufallsZahl));
        System.out.print("Die größte Zahl lautet: ");
        System.out.println(groessteZahl(zufallsZahl));
        System.out.print("Einmal absteigend sortiert, bitte: ");
        System.out.println(absteigend(zufallsZahl));
        System.out.print("Einmal alles Ungerade wegschießen, bitte: ");
        System.out.println(ungeradeZahlenKillen(zufallsZahl));
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
        int minNumber = Integer.MAX_VALUE;
        for (int index = 0; index < zufallsZahl.size(); index++) {
            if (minNumber > zufallsZahl.get(index)) {
                minNumber = zufallsZahl.get(index);
            }
        }
        return minNumber;
    }

    public static int groessteZahl(Vector<Integer> zufallsZahl) {
        int maxNumber = Integer.MIN_VALUE;
        for (int index = 0; index < zufallsZahl.size(); index++) {
            if (maxNumber < zufallsZahl.get(index)) {
                maxNumber = zufallsZahl.get(index);
            }
        }
        return maxNumber;
    }

    public static Vector absteigend(Vector<Integer> zufallsZahl) {
        boolean sorted = true;
        while (sorted) {
            sorted = false;
            for (int index = 1; index < zufallsZahl.size(); index++) {
                if (zufallsZahl.get(index) > zufallsZahl.get(index - 1)) {
                    Integer temp = zufallsZahl.set(index - 1, zufallsZahl.get(index));
                    zufallsZahl.set(index, temp);
                    sorted = true;
                }
            }
        }
        return zufallsZahl;
    }

    public static Vector ungeradeZahlenKillen(Vector<Integer> zufallsZahl) {
        for (int index = 0; index < zufallsZahl.size(); index++) {
            while (index < zufallsZahl.size() && zufallsZahl.get(index) % 2 != 0) {
                zufallsZahl.remove(index);
            }
        }
        return zufallsZahl;
    }
}