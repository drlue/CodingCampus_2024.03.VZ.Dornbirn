package aki.week07.vektor;

import java.util.Random;
import java.util.Vector;

public class VerktorErstellen {
    public static void main(String[] args) {
        Random random = new Random();
        Vector<Integer> zufallZahl = new Vector<>();

        for (int i = 0; i < 10; i++) {
            zufallZahl.add(random.nextInt(0, 100));
        }

        System.out.println(zufallZahl);
        absteigendeZahlen(zufallZahl);
        System.out.println(zufallZahl);
    }

    public static void ungeradeZahlEntfernen(Vector<Integer> zufallsZahl) {
        for (int i = 0; i < zufallsZahl.size(); i++) {
            if (zufallsZahl.get(i) % 2 != 0) {
                zufallsZahl.remove(i);
                i--;
            }
        }
    }

    public static Integer kleinsteZahlSuchen(Vector<Integer> vector) {
        Integer minValue = Integer.MAX_VALUE;
        for (Integer value : vector) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static Integer groessteZahlSuchen(Vector<Integer> vector) {
        Integer maxValue = Integer.MIN_VALUE;
        for (Integer value : vector) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static void absteigendeZahlen(Vector<Integer> vector) {
        for (int i = 0; i < vector.size(); i++) {
            for (int j = 0; j < vector.size() - i - 1; j++) {
                if (vector.get(j) < vector.get(j + 1)) {
                    Integer temp = vector.set(j, vector.get(j + 1));
                    vector.set(j + 1, temp);
                }
            }
        }
    }

}
