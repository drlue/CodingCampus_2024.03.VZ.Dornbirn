package franco.week07.ZooV2Package;

import ardijanla.ConsoleColors;
import franco.week07.ZooV1Package.AnimalV1;

import java.util.ArrayList;
import java.util.List;

public class EnclosureV2 {
    private String name;
    private List<AnimalV2> animalV2List;

    public EnclosureV2(String name) {
        this.name = name;
        animalV2List=new ArrayList<>();
    }
    //>>>>>>>>>>>>>>>>>>>>>>METHODS<<<<<<<<<<<<<<<<<<<
    public void addAnimal(AnimalV2 ani) {
        if (!animalV2List.contains(ani)) {
            animalV2List.add(ani);
        } else {
            System.out.println("Animal already in cage...");
        }
    }
    //>>>>>>>>>>>>>>>>>>>>>>PRINT METHODS<<<<<<<<<<<<<<<<<<<
    public void printStructure() {
        System.out.println("│    ├── Enclosure: " + ConsoleColors.BLUE + name + ConsoleColors.RESET);
        if (animalV2List.isEmpty()) {
            System.out.println("│       ├── (Empty)");
        } else {
            for (AnimalV2 ani : animalV2List) {
                System.out.print("│       ");
                ani.printStructure();
            }
        }
    }
}
