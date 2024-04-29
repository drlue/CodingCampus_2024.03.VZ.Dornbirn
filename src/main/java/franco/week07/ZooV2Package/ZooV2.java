package franco.week07.ZooV2Package;


import ardijanla.ConsoleColors;
import franco.week07.ZooManagement.Enclosure;

import java.util.ArrayList;
import java.util.List;

public class ZooV2 {
    private String name;
    private int foundingYear;
    private List<EnclosureV2> enclosureV2List;
    private List<AnimalV2> animalV2List;

    //Constructor
    public ZooV2(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
        enclosureV2List = new ArrayList<>();
        animalV2List = new ArrayList<>();
    }

    //>>>>>>>>>>>>>>>>>>>>>>METHODS<<<<<<<<<<<<<<<<<<<
    public void addEnclosure(EnclosureV2 enc) {

    }

    public void addAnimalAndEnclosure(EnclosureV2 enc, AnimalV2 ani) {

        if (enclosureV2List.contains(enc)) {
            System.out.println("Already in the list buddy....");
        } else {
            enclosureV2List.add(enc);
        }
        if (animalV2List.contains(ani)) {
            System.out.println("Already in cage buddy");
        } else {
            animalV2List.add(ani);
        }
    }

    //>>>>>>>>>>>>>>>>>>>>>>PRINT METHODS<<<<<<<<<<<<<<<<<<<
    public void printStructure() {
        System.out.println("│" + "=".repeat(40));
        System.out.println("├──Zoo:" + ConsoleColors.RED + name + " founded in " + foundingYear + ConsoleColors.RESET);
        for (EnclosureV2 enc : enclosureV2List) {
            enc.printStructure();
        }
        System.out.println("│" + "=".repeat(40));
    }
}
