package gyula.week07.zoo;

import ardijanla.ConsoleColors;

import java.util.Random;
import java.util.Vector;

public class Enclosure {

    private String name;
    private Vector<Animal> animalList;

    public Enclosure(String name){
        this.name = name;
        animalList = new Vector<>();
    }

    public void addAnimal(Animal ani){
        animalList.add(ani);
    }

    public void printStructure(Vector<Guardian> workers){
        System.out.printf("|   |-- Gehege: %s", name);
        if (!workers.isEmpty()){
            System.out.print(" (Pfleger: ");
            for (int i = 0; i < workers.size(); i++) {
                if (i > 0){
                    System.out.print(", ");
                }
                System.out.print(workers.get(i).getName());
            }
            System.out.println(")");
        } else {
            System.out.println(" !!! VORSICHT, kein zustaendiger Pfleger wurde identifiziert.");
        }
        for (Animal a : animalList){
            a.printStructure();
        }
        if (animalList.isEmpty()){
            System.out.println("|       |-- (leer)");
        }
    }

    public String getName() {
        return name;
    }

    public void doClean(Guardian guardian){
        System.out.printf("%s%s%s cleans the %s%s%s enclosure and feed the animals.%n", ConsoleColors.BLUE, guardian.getName(), ConsoleColors.RESET, ConsoleColors.GREEN, name, ConsoleColors.RESET);
    }

    public void watchRandomAnimal(Guardian guardian){
        if (!animalList.isEmpty()){
            Animal ani = animalList.get(Zoo.random.nextInt(animalList.size()));
            String message = "watching";
            if (ani.getSpecies().equals(guardian.getFavoriteSpecies())){
                message = "wondering";
            }
            System.out.printf("%s%s%s %s %s%s%s%n",
                    ConsoleColors.BLUE, guardian.getName(), ConsoleColors.RESET,
                    message,
                    ConsoleColors.RED, ani.getName(), ConsoleColors.RESET
                    );
        }
    }
}
