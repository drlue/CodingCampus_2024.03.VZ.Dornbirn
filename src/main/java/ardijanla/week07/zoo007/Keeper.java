package ardijanla.week07.zoo007;

import ardijanla.ConsoleColors;

import java.util.ArrayList;
import java.util.List;

public class Keeper {
    private String name;
    private List<Enclosure> responsibilities;
    private Animal favoriteAnimal;

    public Keeper(String name) {
        this.name = name;
        responsibilities = new ArrayList<>();
    }

    void addResponsibility(Enclosure enclosure) {
        responsibilities.add(enclosure);
    }

    void addFavoriteAnimal(Animal favoriteAnimal) {
        this.favoriteAnimal = favoriteAnimal;
    }

    void performDuties() {
        for (Enclosure enclosure : responsibilities) {
            enclosure.performService(this);
        }
    }


    public String getName() {
        return name;
    }



    void beExcited(Animal animal) {
        if (favoriteAnimal != null) {
            System.out.printf("%s%s%s %sbewundert%s das Tier %s %n", ConsoleColors.RED, name, ConsoleColors.RESET, ConsoleColors.YELLOW, ConsoleColors.RESET, favoriteAnimal.name);
        }
    }

    void printStructure() {
        System.out.print("│   ├── Pfleger: " + name + " - Zuständig für: ");
        for (Enclosure enclosure : responsibilities) {
            System.out.print(enclosure.name + ", ");
        }
        System.out.println();
    }
}
