package demian.week07;

import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class sortVectorArray {

    public static Random rand = new Random();

    public static void main(String[] args) {

        //AUFGABE: Es gibt zwei Vectoren mit 20 Elementen, die nach Größe sortiert sind.
        //
        //Erstelle einen dritten Vector, in dem du die Elemente der vorhergehenden Vectoren zusammenfügst,
        // der neu erstellte Vector soll immer noch sortiert sein.


        //Vector 1 mit zufallszahlen erstellen und sortieren:
        Vector<Integer>v1=new Vector<>();
        for (int i = 0; i < 20; i++) {
            v1.add(rand.nextInt(20));
        }
        Collections.sort(v1);

        //Vector 2 mit zufallszahlen erstellen und sortieren:
        Vector<Integer>v2=new Vector<>();
        for (int i = 0; i < 20; i++) {
            v2.add(rand.nextInt(20));
        }
        Collections.sort(v2);

        //Vector 3 erstellen und gleich mit dem geordneten Vecor 2 befüllen:
        Vector<Integer>v3= (Vector<Integer>) v2.clone();

        //Ausdruck der Vectoren:
        System.out.println("Vector 1: " + v1);
        System.out.println("Vector 2: " + v2);
        System.out.println("Vector 3: " + v3);

        for (int i = 0; i < v1.size(); i++) {
            int temp;
            temp = v1.get(i);
            int j = 1;
            if (temp >= v3.get(j)){
                v3.add(temp,i);
            } else {
                while (temp < v3.get(j)){
                    j++;
                    if (temp >= v3.get(j)){
                        v3.add(temp,j);
                    }
                }
            }

        }



    }
}
