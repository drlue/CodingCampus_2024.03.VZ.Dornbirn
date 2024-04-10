package katherina.week06.day03;

import java.util.Random;
import java.util.Vector;

public class ZufallsVektor {
    public static void main(String[] args) {
        Vector<Integer> zufallsZahl = new Vector<Integer>();
        Random random = new Random();

        for (int index = 0; index <= 20; index++)

            zufallsZahl.add(random.nextInt(0,101));

        System.out.println("Zufallszahlen:");
        System.out.println(zufallsZahl);
        System.out.println("Gerade Zahlen:");
        geradeZahlen(zufallsZahl);
        System.out.println();
        System.out.println("Ungerade Zahlen:");
        ungeradeZahlen(zufallsZahl);
    }

    public static void geradeZahlen(Vector<Integer> zufallsZahl) {
        int count = 0;
        for (int index = 0; index <= 20; index++) {
            if (zufallsZahl.get(index) % 2 == 0) {
                count++;
                System.out.print(zufallsZahl.get(index) + " ");
            }
        }
        System.out.println();
        System.out.println("Es gibt "+count+" gerade Zahlen hier.");
    }

    public static void ungeradeZahlen(Vector<Integer> zufallsZahl) {
        for (int index = 0; index <= 20; index++) {
            if (zufallsZahl.get(index) % 2 != 0) {

                System.out.print(zufallsZahl.get(index) + " ");
            }
        }
    }
}