package christian.week06.tiergartenRemastered;

import ardijanla.ConsoleColors;

import java.util.ArrayList;
import java.util.List;

public class Pfleger {
    private String name;
    private List<Gehege> gehegeList;

    public Pfleger(String name) {
        this.name = name;
        this.gehegeList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void getGehegeList() {
        for (Gehege x : gehegeList) {
            System.out.println("       |---" + x.getName());
        }
    }

    public void addGehegeToList(Gehege gehege) {
        if (!gehegeList.contains(gehege)) {
            gehegeList.add(gehege);
        } else {
            System.out.printf("%s betreut bereits das Gehege %s", name, gehege.getName());
        }
    }

    public void removeGehegeFromList(Gehege gehege) {
        if (gehegeList.contains(gehege)) {
            gehegeList.remove(gehege);
        } else {
            System.out.printf("%s betreut das Gehege %s nicht!", name, gehege.getName());
        }
    }

    public void rundgang(Pfleger pfleger) {
        for (Gehege x : gehegeList) {
            if (!x.getArbeitErledigt()) {
                System.out.println(ConsoleColors.RED + "\nDie Arbeit in " + x.getName() + " wird erledigt!" + ConsoleColors.RESET);
                x.arbeitErledigen(pfleger);
                System.out.println(ConsoleColors.GREEN + "\nDie Arbeit in " + x.getName() + " ist erledigt!" + ConsoleColors.RESET);
            }
        }
    }
}
