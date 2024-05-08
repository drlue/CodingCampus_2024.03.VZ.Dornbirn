package ardijanla.week07.zoo007;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    String name;
    int foundingYear;
    List<IEnclosure> enclosures = new ArrayList<>();
    List<IKeeper> keepers;

    private static int tag = 1;

    public Zoo(String name, int foundingYear) {
        this.name = name;
        keepers = new ArrayList<>();
        this.foundingYear = foundingYear;
    }

    void addEnclosure(IEnclosure enclosure) {
        if (!enclosures.contains(enclosure)) {
            enclosures.add(enclosure);
        }
    }

    void removeEnclosure(IEnclosure enclosure) {
        enclosures.remove(enclosure);
    }

    void addKeeper(IKeeper keeper) {
        keepers.add(keeper);
    }

    void simulateDay() {
        System.out.println("Tag: " +  tag);
        tag++;
        for (IEnclosure enclosure : enclosures) {
            enclosure.simulateDay();
        }
        for (IKeeper keeper : keepers) {
            keeper.performDuties();
        }
    }

    void printStructure() {
        System.out.println("├── Zooo: " + name + ", gegründet " + foundingYear);
        for (IEnclosure enclosure : enclosures) {
            enclosure.printStructure();
        }
        for (IKeeper keeper : keepers) {
            keeper.printStructure();
        }
    }
}
