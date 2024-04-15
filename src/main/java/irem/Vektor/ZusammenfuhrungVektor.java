package irem.Vektor;

import java.util.Random;
import java.util.Vector;

public class ZusammenfuhrungVektor {
//Es gibt zwei Vectoren mit 20 Elementen, die nach Größe sortiert sind.
//Erstelle einen dritten Vector, in dem du die Elemente der vorhergehenden Vectoren zusammenfügst, der neu erstellte
// Vector soll immer noch sortiert sein.

    public static <VectorAddition> void main(String[] args) {
        Random rand = new Random();
        Vector<Integer> zufallsZahlen = new Vector<Integer>();
        Vector<Integer> zahlenZufall = new Vector<Integer>();


        for (int i = 0; i < 20; i++) {
            zufallsZahlen.add(rand.nextInt(100));
        }
        for (int i = 0; i < 20; i++) {

            zahlenZufall.add(rand.nextInt(100));

        }
        absteigendZahl(zufallsZahlen);
        System.out.println(zufallsZahlen);
        System.out.println("-----------------------------------------------------------------------------");
        absteigendZahl(zahlenZufall);
        System.out.println(zahlenZufall);
        System.out.println("-----------------------------------------------------------------------------");
        Vector<Integer> combined = mergeVector(zufallsZahlen, zahlenZufall);
        System.out.println(combined);
    }

    public static Vector<Integer> absteigendZahl(Vector<Integer> vector) {
        boolean sorted = true;
        while (sorted) {
            sorted = false;
            for (int index = 1; index < vector.size(); index++) {
                if (vector.get(index) > vector.get(index - 1)) {
                    Integer temp = vector.set(index - 1, vector.get(index));
                    vector.set(index, temp);
                    sorted = true;
                }
            }
        }
        return vector;
    }

    private static Vector<Integer> mergeVector(Vector<Integer> left, Vector<Integer> right) {
        Vector<Integer> result = new Vector<>();

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.firstElement() < right.firstElement()) {
                result.add(left.remove(0));
            } else {
                result.add(right.remove(0));
            }
        }
        result.addAll(left);
        result.addAll(right);
        return result;
    }
}



