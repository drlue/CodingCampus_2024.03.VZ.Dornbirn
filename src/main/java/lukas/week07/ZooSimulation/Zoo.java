package lukas.week07.ZooSimulation;

import ardijanla.ConsoleColors;

import java.time.Year;
import java.util.HashMap;
import java.util.Random;
import java.util.Vector;

import static lukas.Helper.sleep;

public class Zoo {

    public static Random random = new Random();
    private String name;
    private Year foundingYear;
    private Vector<Enclosure> enclosures;
    private Vector<Food> foods;
    private Vector<Keeper> keepers;
    private Vector<Keeper> remainingKeepers;
    private Vector<Doctor> doctors;
    private Vector<Doctor> remainingDoctors;
    private Vector<Animal> injuredAnimals;


    //---constructor---
    public Zoo(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = Year.of(foundingYear);
        enclosures = new Vector<>();
        foods = new Vector<>();
        keepers = new Vector<>();
        remainingKeepers = new Vector<>();

    }


    //---methods---
    public void addEnclosure(Enclosure enclosure) {
        if (enclosure != null) {
            for (Enclosure enc : enclosures) {
                if (enclosure.equals(enc)) {
                    System.out.println("Enclosure already exists and not added");
                    break;
                }
            }
            enclosures.add(enclosure);
        } else {
            System.out.println("Enclosure is null!");
        }
    }


    private void getFoodStat(HashMap<Food, Double> foodStat) {
        for (Enclosure enc : enclosures) {
            enc.getFoodStat(foodStat);
        }
    }

    private String getKeepersString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < keepers.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(keepers.get(i).getColoredName(ConsoleColors.GREEN));
        }
        return sb.toString();
    }

    public void addKeeper(Keeper keeper) {
        keepers.add(keeper);
    }

    private Animal getMaxInjuredAnimal() {
        Animal animal = null;
        //int minHealth = Integer.MAX_VALUE;
        for (Enclosure enc : enclosures) {
            if (animal == null || enc.getMaxInjuredAnimal().getRelativeHealth() < animal.getRelativeHealth()) {
                animal = enc.getMaxInjuredAnimal();
            }
        }
        return animal;
    }

    private void getAllInjuredAnimals() {
        for (Enclosure enc : enclosures) {
            injuredAnimals.addAll(enc.getInjuredAnimals());
        }
    }

    private void sortInjuredAnimalsByHealthPercent() {
        for (int i = 0; i < injuredAnimals.size(); i++) {
            for (int j = 0; j < injuredAnimals.size() - i - 1; j++) {
//TODO: BubbleSort
            }
        }
    }

    public void startSimulationDynamic() {
        for (int day = 1; day <= 10; day++) {
            reset();
            System.out.printf("----------TAG %d----------%n", day);
            for (int hour = 0; hour < 24; hour++) {
                if (hour == 8) {
                    System.out.printf("%s Uhr: %s beginnen den Arbeitstag mit einem gemeinsamen Kaffee.%n", hour, getKeepersString());
                }
//               //V1
//                for (Keeper kee : keepers) {
//                    //kee.startWorking();
//                    kee.activitySim1(hour);
//                }
                //V2 damit nicht immer mit dem gleichen keeper begonnen wird
                while (!remainingKeepers.isEmpty()) {
                    Keeper kee = remainingKeepers.remove(random.nextInt(remainingKeepers.size()));
                    kee.activitySim1(hour);
                }
                remainingKeepers = new Vector<>(keepers);

                for (Enclosure enc : enclosures) {
                    enc.activityInEnclosure(hour);
                }

                while (!remainingDoctors.isEmpty()) {
                    Doctor doc = remainingDoctors.remove(random.nextInt(remainingKeepers.size()));
                    doc.activityOfDoc(hour);
                }

                //TODO Doctor Bob im Zoo anstellen

                sleep(100);
            }
        }
    }


    public void reset() {
        remainingKeepers = new Vector<>(keepers);
        for (Enclosure enc : enclosures) {
            enc.reset();
        }
        for (Keeper kee : keepers) {
            kee.reset();
        }

    }

    //---print methods

    public void printStructure() {
        System.out.println("|-- Zoo: " + name + ", gegründet " + foundingYear.toString());
        if (enclosures.isEmpty()) {
            System.out.println("|   |-- (leer)");
        } else {
            for (Enclosure e : enclosures) {
                System.out.print("|   ");
                e.printEnclosureStructure(keepers);
            }
        }
    }

    public void printFoodStats() {
        HashMap<Food, Double> foodStat = new HashMap<>();
        getFoodStat(foodStat);
        double total = 0;
        System.out.println();
        System.out.println("Täglicher Futterbedarf '" + name + "'");
        for (Food food : foodStat.keySet()) {
            double amount = foodStat.get(food);
            total += amount * food.getPricePerUnit();
            System.out.printf("%-10s %10.2f %-10s a %7.2f Eur %10.2f Eur \n", food.getName() + ":", amount, food.getUnit(), food.getPricePerUnit(), amount * food.getPricePerUnit());
        }
        System.out.println("-".repeat(62));
        System.out.printf("%-46s %10.2f Eur\n", "TOTAL", total);

    }


}

