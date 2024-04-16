package christian.week06.tiergartenRemastered;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Gehege {

    private String name;
    private List<Tier> tierList;
    private List<Pfleger> pflegerList;
    private boolean arbeitErledigt;

    public Gehege(String name) {
        this.name = name;
        tierList = new ArrayList<>();
        pflegerList = new ArrayList<>();
        arbeitErledigt = false;
    }

    public void printStructure() {

        System.out.println("|   |---Gehege: " + name);
        if (!tierList.isEmpty()) {
            for (Tier x : tierList) {
                x.printStructure();
            }
        } else {
            System.out.println("|       |--- (Leer)");
        }

    }

    public String getName() {
        return name;
    }

    public void addTierToList(Tier tier) {
        if (!tierList.contains(tier)) {
            tierList.add(tier);
            System.out.println(tier.getGattung() + " " + tier.getName() + " wurde dem Gehege " + name + " hinzugefügt!");
        } else {
            System.out.println("Tier existiert bereits im Gehege!");
        }
    }

    public void removeTierFromList(Tier tier) {
        if (tierList.contains(tier)) {
            tierList.remove(tier);
            System.out.println(tier.getName() + " wurde aus dem " + name + " entfernt!");
        } else {
            System.out.println(tier.getName() + " ist nicht im " + name);
        }
    }

    public void getFutterBedarf(Map<Futter, Float> futterBedarf) {
        for (Tier tier : tierList) {
            tier.getFutterBedarf(futterBedarf);
        }
    }

    public boolean getArbeitErledigt() {
        return arbeitErledigt;
    }

    public void arbeitErledigen(Pfleger pfleger) {

        arbeitErledigt = true;
        for (Tier x : tierList) {
            x.fuettern();
            System.out.print("\n|---" + x.getName() +"," +  x.getGattung() + " wurde von " +pfleger.getName()+ " gefuettert\n");
        }

    }
    public void resetArbeitErledigt(){
        arbeitErledigt = false;
    }
}
