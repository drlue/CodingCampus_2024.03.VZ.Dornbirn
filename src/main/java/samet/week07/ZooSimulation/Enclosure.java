package samet.week07.ZooSimulation;

import ardijanla.ConsoleColors;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Enclosure {

    private String name;

    private List<Animal> animalList;

    public Enclosure(String enclosure) {
        this.name = enclosure;
        animalList = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animalList.remove(animal);

    }

    public String getName() {
        return name;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void getFoodneed(Map<Food,Float> foodneed){
        for (Animal animal : animalList){
            animal.getFoodRequirements(foodneed);
        }
    }

    public void printZooStructure(List<Keeper> workers) {
        System.out.printf("|   |-- Enclosure: %s", name);
        if (!workers.isEmpty()) {
            System.out.print(" (Keeper: ");
            for (int i = 0; i < workers.size(); i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(workers.get(i).getName());
            }
            System.out.println(")");
        } else {
            System.out.println(" !!! Watch out, no Keeper in Enclosure!");
        }
        for (Animal animal : animalList) {
            animal.printZooStructure();
        }
        if (animalList.isEmpty()) {
            System.out.println("|       |-- (empty)");
        }
    }

    public void doClean(Keeper keeper) {
        System.out.printf("%s%s%s cleans the %s%s%s enclosure and feed the animals.%n", ConsoleColors.BLUE, keeper.getName(), ConsoleColors.RESET, ConsoleColors.GREEN, name, ConsoleColors.RESET);

    }

    public void watchRandomAnimal(Keeper keeper) {
        if (!animalList.isEmpty()) {
            Animal animal = animalList.get(Zoo.random.nextInt(animalList.size()));
            String message = "watching";
            if (animal.getSpecies().equals(keeper.getFavoriteAnimal())) {
                message = "wondering";
            }
            System.out.printf("%s%s%s %s %s%s%s%n",
                    ConsoleColors.BLUE, keeper.getName(), ConsoleColors.RESET,
                    message,
                    ConsoleColors.RED, animal.getName(), ConsoleColors.RESET);
        }
    }


//    public void removeDeadAnimals(){
//        List<Animal> deadAnimals = new ArrayList<>();
//        for (Animal animal : animalList){
//            if (animal.getStatus() == Animal.Status.Dead){
//                deadAnimals.add(animal);
//            }
//        }
//        animalList.remove(deadAnimals);
//    }

//    public void simulateDay(){
//        for (Animal animal : animalList){
//            if (animal.getStatus() == Animal.Status.Alive){
//                for (Animal neighbor : animalList){
//                    if (neighbor != animal){
//                        animal.bite(neighbor);
//                    }
//                }
//            }
//        }
//        removeDeadAnimals();
//    }

}











