package luki.week07;

import java.util.ArrayList;
import java.util.List;

public class Rehearsal {
    public int addNumber(int a, final int b, final int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        A firstA = new A();
        A secondA = new A();

        //Instanz der Klasse selbst
        new Rehearsal().addNumber(10, 20, 30);

        firstA.text = "A1";
        secondA.text = "A2";

        System.out.println("FirstA: " + firstA.text);
        System.out.println("SecondA: " + secondA.text);

        // "Falsch"
        firstA.text2 = "A1";
        secondA.text2 = "A2";

        System.out.println("FirstA: (static) " + firstA.text2);
        System.out.println("SecondA: (static) " + secondA.text2);

        A.text2 = "A1";

        System.out.println("A Count is: " + A.aCounter);

        System.out.println("A toString() -> " + firstA.toString());

        Fahrzeug f1 = new Fahrzeug(1200);
        Fahrzeug f2 = new Fahrzeug(12);

        Auto auto = new Auto(123, "Audi");

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(auto);

        Fahrzeug f3 = new Auto(100, "Honda");
        System.out.println(f3);

        f1.fahre();
        auto.fahre();
        f3.fahre();

        List<Fahrzeug> fahrzeugList = new ArrayList<>();

        fahrzeugList.add(f1);
        fahrzeugList.add(f2);
        fahrzeugList.add(auto);
        fahrzeugList.add(f3);

        tuevNord(fahrzeugList);
    }

    private static void tuevNord(List<Fahrzeug> fahrzeuge) {
        System.out.println("Tüv startet Inspektion");
        for (Fahrzeug f : fahrzeuge) {
            System.out.println("---NEUE PRÜFUNG---");
            System.out.println("Standardprüfung:");
            f.fahre();
            if (f instanceof Auto) {
                Auto a = (Auto) f;
                System.out.println("Spezialprüfung eingeleitet!!!");
                System.out.println("Marke: " + a.marke);
            }

        }
        System.out.println("Tüv Inspektion beendet");
    }
}
