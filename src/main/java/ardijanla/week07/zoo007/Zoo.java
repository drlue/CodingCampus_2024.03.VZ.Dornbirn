package ardijanla.week07.zoo007;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    String name;
    int foundingYear;
    List<Enclosure> enclosures = new ArrayList<>();
    List<Keeper> keepers;

    private static int tag = 1;

    public Zoo(String name, int foundingYear) {
        this.name = name;
        keepers = new ArrayList<>();
        this.foundingYear = foundingYear;
    }

    void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    void removeEnclosure(Enclosure enclosure) {
        enclosures.remove(enclosure);
    }

    void addKeeper(Keeper keeper) {
        keepers.add(keeper);
    }

    void simulateDay() {
        System.out.println("Tag: " +  tag);
        tag++;
        for (Enclosure enclosure : enclosures) {
            enclosure.serviced = false;
            enclosure.animalFight();
            enclosure.removeDeadAnimals();
        }
        for (Keeper keeper : keepers) {
            keeper.performDuties();
        }
    }

    void printStructure() {
        System.out.println("├── Zooo: " + name + ", gegründet " + foundingYear);
        for (Enclosure enclosure : enclosures) {
            enclosure.printStructure();
        }
        for (Keeper keeper : keepers) {
            keeper.printStructure();
        }
    }
}
