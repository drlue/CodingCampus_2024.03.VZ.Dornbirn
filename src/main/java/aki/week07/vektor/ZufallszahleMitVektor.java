package aki.week07.vektor;

import java.util.Random;
import java.util.Vector;

public class ZufallszahleMitVektor {
    public static void main(String[] args) {
        Random random = new Random();
        Vector<Integer> zufallZahl = new Vector<>();

        for (int i = 0; i < 20; i++) {
            zufallZahl.add(random.nextInt(0,100));
        }
        System.out.println(zufallZahl);

        geradeZahlen(zufallZahl);
        ungeradeZahlen(zufallZahl);
        kleinsteZahl(zufallZahl);
    }

    public static void geradeZahlen(Vector<Integer> zufallsZahl) {
        int count = 0;
        for (int i = 0; i < 20; i++) {
            if (zufallsZahl.get(i) % 2 == 0){
                count++;
            }
        }
        System.out.println("\nEs gibt " + count + " gerade Zahlen!");
    }

    public static void ungeradeZahlen(Vector<Integer> zufallsZahl) {
        int count = 0;
        for (int i = 0; i < 20; i++) {
            if (zufallsZahl.get(i) % 2 != 0){
                count++;
            }
        }
        System.out.println("\nEs gibt " + count + " ungerade Zahlen!");
    }
    public static int kleinsteZahl(Vector<Integer> zufallsZahl) {
        int minNumber = 0;
        for (int index = 0; index < zufallsZahl.size(); index++) {
            minNumber++;
        }
        return minNumber;
    }
}
