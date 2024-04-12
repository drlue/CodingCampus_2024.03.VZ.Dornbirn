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
        System.out.println();
        absteigendZahl(zahlenZufall);
        System.out.println(zahlenZufall);
        System.out.println();
        zweiVectorenAddiren(zufallsZahlen,zahlenZufall);
        System.out.println(zweiVectorenAddiren(zufallsZahlen,zahlenZufall));

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

    public static Integer zweiVectorenAddiren(Vector<Integer> vector1, Vector<Integer> vector2) {
        int summe = 0;
        for (int vector : vector2) {
            summe += vector;
        }
        return summe;
    }
}

