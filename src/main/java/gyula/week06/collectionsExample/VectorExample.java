package gyula.week06.collectionsExample;

import java.util.Random;
import java.util.Vector;

public class VectorExample {
    private static Random rand = new Random();
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();

        names.add("Bregenz");
        names.add("Feldkirch");
        names.add("Lustenau");

        names.add(0, "Dornbirn");
        names.add(1, "Boston");
        names.add(1, "Seatle");

        System.out.println(names);
        names.remove(2);
        names.remove("Seatle");
        System.out.println(names);

        for (String n : names){
            System.out.println("City: " + n);
        }

        System.out.println("size    : " + names.size());
        System.out.println("capacity: " + names.capacity());

        for (int i = 0; i < names.size(); i++) {
            System.out.println("City of " + names.get(i));
        }

        for (int i = 0; i < 100; i++) {
            names.add("ABCDEFG");
            System.out.printf("%3d %5d%n", i, names.capacity());
        }

        while (names.size() > 4){
            names.removeLast();
        }
        System.out.println(names);

        names.set(3, "Hohenems");
        System.out.println(names);


        Vector<Integer> numbers = new Vector<Integer>();
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(101));
        }
        System.out.println(numbers);

    }
}
