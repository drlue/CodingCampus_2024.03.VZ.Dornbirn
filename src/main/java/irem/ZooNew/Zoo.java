package irem.ZooNew;

import java.util.Random;
import java.util.Vector;

public class Zoo {

    public static Random rand = new Random();
    private String name;
    private int foundingYear;
    private Vector<Enclosure> enclosures = new Vector<>();
    private Vector<Keeper> keepers = new Vector<>();
    private final Vector animals= new Vector<>();


    public Zoo(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;

    }

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public Enclosure getEnclosure(Enclosure enclosure) {
        return enclosure;
    }

    public Enclosure findEnclosure(String name) {
        for (Enclosure enclosure : enclosures) {
            if (enclosure.getName().equals(name)) {
                return enclosure;
            }
        }
        return null;
    }

    public void addKeeper(Keeper keeper) {
        keepers.add(keeper);
    }


    public void printStructure() {
        System.out.printf("├──Zoo: %s , founded in %d\n", name, foundingYear);

        if (enclosures.isEmpty()) {
            System.out.println("│       ├── (Empty)");
        } else {
            for (Enclosure enc : enclosures) {
                enc.printStructure();
            }
        }

    }
    public void simulateDay() {
        for (Keeper keeper : keepers) {
            keeper.careForEnclosures();
        }
        for (Enclosure enclosure : enclosures) {
            enclosure.resetCareStatus();
        }
    }
}
