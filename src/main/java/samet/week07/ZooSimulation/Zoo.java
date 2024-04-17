package samet.week07.ZooSimulation;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String zooName;
    private int openingYear;
    private List<Enclosure> enclosureList;
    private List<Keeper> keeperList;


    public Zoo(String zooName, int openingYear) {
        this.zooName = zooName;
        this.openingYear = openingYear;
        this.enclosureList = new ArrayList<>();
        this.keeperList = new ArrayList<>();
    }

    public void addGuardianAndTask(Keeper keeper,Enclosure enclosure){
        keeper.addTask(enclosure);
        if (!keeperList.contains(keeper)){
            keeperList.add(keeper);
        }
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosureList.add(enclosure);
    }

//    public void removeGehege(Enclosure gehege) {
//        enclosureList.remove(gehege);
//    }

    public void addKeeper(Keeper keeper) {
        keeperList.add(keeper);
    }

//    public void removeKeeper(Keeper keeper) {
//        keeperList.remove(keeper);
//
//    }

    public void printZooStructure() {
        System.out.println("|-- Zoo: " + zooName + ", gegründet " + openingYear);
        for (Keeper keeper : keeperList) {
            keeper.printZooStructure();
        }
        for (Enclosure enc : enclosureList){
            List<Keeper> workersOfEnclosure = new ArrayList<>();
            for (Keeper kep : keeperList){
                if (kep.isResponsibleFor(enc)){
                    workersOfEnclosure.add(kep);
                }
            }
            enc.printZooStructure(workersOfEnclosure);
        }
    }
}























