package samet.week07.ZooSimulation;

import ardijanla.ConsoleColors;

import java.util.*;

public class Zoo {
    public static Random random = new Random();

    private String zooName;
    private int openingYear;
    private List<Enclosure> enclosureList;
    private List<Keeper> keeperList;
    private List<AnimalVet> vetList;


    public Zoo(String zooName, int openingYear) {
        this.zooName = zooName;
        this.openingYear = openingYear;
        this.enclosureList = new ArrayList<>();
        this.keeperList = new ArrayList<>();
        this.vetList = new ArrayList<>();
    }

    public void addKeeperAndTask(Keeper keeper, Enclosure enclosure) {
        keeper.addTask(enclosure);
        if (!keeperList.contains(keeper)) {
            keeperList.add(keeper);
        }
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosureList.add(enclosure);
    }
    public void addAnimalVet(AnimalVet animalVet){
        vetList.add(animalVet);
    }

    public float calculateFoodCost(Map<Food, Float> neededFood) {
        float food = 0;
        for (Map.Entry<Food, Float> entry : neededFood.entrySet()) {
            System.out.printf("\"\nFood: %10s    --->    required Food: %.2f    --->    Cost: %6.2f €/Tag\"" , entry.getKey().getFoodName(), entry.getValue(), entry.getValue() * entry.getKey().getPrice());
            food += entry.getValue() * entry.getKey().getPrice();
        }
        return food;
    }

    public void printFoodCost() {
        Map<Food, Float> foodFloatMap = new HashMap<>();
        for (Enclosure enclosure : enclosureList) {
            enclosure.getFoodneed(foodFloatMap);
        }
        System.out.printf(ConsoleColors.RED + "\nThe Daily Food Cost belongs to : %15.2f €/Day\n" + ConsoleColors.RESET, calculateFoodCost(foodFloatMap));
    }

    public void printZooStructure() {
        System.out.println("|-- Zoo: " + zooName + ", established " + openingYear);
        for (Keeper keeper : keeperList) {
            keeper.printZooStructure();
        }
        for (Enclosure enc : enclosureList) {
            List<Keeper> workersOfEnclosure = new ArrayList<>();
            for (Keeper kep : keeperList) {
                if (kep.isResponsibleFor(enc)) {
                    workersOfEnclosure.add(kep);
                }
            }
            enc.printZooStructure(workersOfEnclosure);
        }
    }

    public void simulatedDay(int day) {
        List<Animal> animals = getAnimal();
        System.out.printf("Day %d beginns at 07:00 Morning%n", day);
        System.out.println();
        for (Keeper keeper : keeperList) {
            keeper.simulatedDay();
        }

        for (AnimalVet vet : vetList) {
            vet.healAnimal(animals);
        }
    }

    private List<Animal> getAnimal(){
        List<Animal> animals = new ArrayList<>();
        for (Enclosure enclosure : enclosureList) {
            animals.addAll(enclosure.getAnimalList());
        }
        return animals;

    }
}























