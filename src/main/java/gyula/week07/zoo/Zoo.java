package gyula.week07.zoo;

import java.util.Random;
import java.util.Vector;

public class Zoo {
    public static Random random = new Random();
    private String name;
    private int established;
    private Vector<Enclosure> enclosureList;
    private Vector<Guardian> guardianList;
    private Vector<Veterian> veterianList;

    /**
     * Constuctor for zoo
     * @param name is the oficial name of the zoo
     * @param established the year the zoo has been establisched
     */
    public Zoo(String name, int established){
        this.name = name;
        this.established = established;
        enclosureList = new Vector<>();
        guardianList = new Vector<>();
        veterianList = new Vector<>();
    }

    public void addGuardianAndTask(Guardian gua, Enclosure enc){
        gua.addTask(enc);
        if (!guardianList.contains(gua)){
            guardianList.add(gua);
        }
    }

    public void addEnclosure(Enclosure enc){
        if (!enclosureList.contains(enc)){
            enclosureList.add(enc);
        } else {
            System.out.printf("Zoo %s hat die Gehege %s schon drin...%n", name, enc.getName());
        }
    }

    public void addVeterian(Veterian vet){
        if (!veterianList.contains(vet)){
            veterianList.add(vet);
        }
    }

    public void printStructure(){
        System.out.printf("|-- Zoo: %s, gegrundet %d%n", name, established);
        for (Guardian gua : guardianList){
            gua.printStructure();
        }
        for (Enclosure enc : enclosureList){
            Vector<Guardian> workersOfEnclosure = new Vector<>();
            for (Guardian gua : guardianList){
                if (gua.isResponsibleFor(enc)){
                    workersOfEnclosure.add(gua);
                }
            }
            enc.printStructure(workersOfEnclosure);
        }
    }

    private Animal searchLowestRelativeHealth(){
        Animal bestOption = null;
        for (Enclosure enc: enclosureList){
            Animal ani = enc.searchLowestRelativeHealth();
            if (bestOption == null ||
                (ani != null && ani.getRelativeHealth() < bestOption.getRelativeHealth())) {
                bestOption = ani;
            }
        }
        return bestOption;
    }

    public void simulateDay(int day){
        System.out.printf("Day %d beginn...%n", day);
        for (Guardian gua: guardianList){
            gua.simulateDay();
        }

        for (Enclosure enc: enclosureList){
            enc.simulateDay();
        }
        for (Veterian vet: veterianList){
            Animal animalToHeal = searchLowestRelativeHealth();
            if (animalToHeal != null){
                vet.heal(animalToHeal);
            }
        }
    }
}
