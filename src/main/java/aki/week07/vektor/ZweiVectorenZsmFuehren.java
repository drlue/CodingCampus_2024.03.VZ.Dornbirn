package aki.week07.vektor;

import java.util.Random;
import java.util.Vector;

public class ZweiVectorenZsmFuehren {
    public static void main(String[] args) {
        Random random = new Random();
        Vector<Integer> zufallsZahl1 = new Vector<>();
        for (int i = 0; i < 20; i++) {
            zufallsZahl1.add(random.nextInt(0, 100));
        }
        Vector<Integer> zufallsZahl2 = new Vector<>();
        for (int i = 0; i < 20; i++) {
            zufallsZahl2.add(random.nextInt(0, 100));
        }

        System.out.println("================================================================================");
        absteigendeZahlen(zufallsZahl1);
        System.out.println(zufallsZahl1);
        System.out.println("================================================================================");
        absteigendeZahlen(zufallsZahl2);
        System.out.println(zufallsZahl2);
        System.out.println("================================================================================");
        zweiVectorenZsmAddiert(zufallsZahl1,zufallsZahl2);
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

    public static void zweiVectorenZsmAddiert(Vector<Integer> vector1, Vector<Integer> vector2) {
        for (int i = 0; i < vector1.size() * 2; i++) {
            if (vector1.isEmpty()){
                vector1.add(i,vector2.get(i));
            }
        }
    }

    public static void zweiVectorenZsmAddiert2(Vector<Integer> vector1, Vector<Integer> vector2) {
        Vector<Integer> result = new Vector<>();
        while(!vector1.isEmpty() && !vector2.isEmpty()){
            if (vector1.firstElement() < vector2.firstElement()){
                
            }
        }
    }
}
