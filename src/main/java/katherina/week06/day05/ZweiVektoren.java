package katherina.week06.day05;


//Erstelle einen dritten Vector, in dem du die Elemente der vorhergehenden Vectoren zusammenfügst,
// der neu erstellte Vector soll immer noch sortiert sein.

import java.util.Random;
import java.util.Vector;

import static java.io.ObjectInputFilter.merge;

public class ZweiVektoren {


    public static void main(String[] args) {
        Vector<Integer> zufallsZahl = new Vector<Integer>();
        Vector<Integer> zahlenZufall = new Vector<Integer>();
        Random random = new Random();

        for (int index = 0; index < 20; index++) {
            zufallsZahl.add(random.nextInt(0, 101));
        }
        for (int index = 0; index < 20; index++) {
            zahlenZufall.add(random.nextInt(0, 101));
        }

        System.out.println("Vektor1:");
        System.out.println(absteigend(zufallsZahl));
        System.out.println("Vektor2:");
        System.out.println(absteigend(zahlenZufall));
        System.out.println("Abrakadabra ...");
        Vector<Integer> combined = zweiVektorenZusammen(zufallsZahl,zahlenZufall);
        System.out.println(combined);

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


    public static Vector zweiVektorenZusammen(Vector<Integer> left, Vector<Integer> right) {
        Vector<Integer> result = new Vector<>();
        while (!left.isEmpty() && !right.isEmpty()) {
            //Solange weder das linke noch das rechte Vectording alle ist...
            if (left.firstElement() < right.firstElement()) {
                result.add(left.remove(0));
                //vergleiche das jeweils erste Element, füge das kleinere dem Ergebnis hinzu und nimm es weg,
                //damit das nächste nachrutscht.
            } else {
                result.add(right.remove(0));
                //Wenn das auf der linken Seite größer ist, dann wird das stattdessen auf der rechten Seite gemacht.
            }
            result.addAll(left);
            result.addAll(right);
            //Zusammenfügen.
        }
        return result;
        //Ausgeben
    }
}

