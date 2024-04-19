package christian.week06.zooEnglish;

import java.util.Random;

public class Main {

    public static Random rnd = new Random();

    public static void main(String[] args) {
        FinalZoo zoo = new FinalZoo("HappyZoo3", 2024);
        Food meat = new Food("Meat", "kg", 8.50f);
        Food hay = new Food("Hay", "kg", 0.60f);
        Enclousure sheepEnc = new Enclousure("SheepEnclousure");
        Enclousure lionEnc = new Enclousure("LionEnclousure");
        Enclousure duckEnc = new Enclousure("LionEnclousure");
        Enclousure foxEnc = new Enclousure("LionEnclousure");
        Animal sheep1 = new Animal("Berti", "Sheep", hay, 6f);
        Animal sheep2 = new Animal("Brutus", "Sheep", hay, 6f);
        Animal sheep3 = new Animal("Herta", "Sheep", hay, 6f);
        Animal duck1 = new Animal("Bibi", "Duck", hay, 1f);
        Animal duck2 = new Animal("Susi", "Duck", hay, 1f);
        Animal lion1 = new Animal("Hans", "Lion", meat, 1.6f);
        Animal lion2 = new Animal("Paul", "Lion", meat, 1.6f);
        Animal lion3 = new Animal("Jörg", "Lion", meat, 1.6f);
        Animal fox1 = new Animal("Herbert", "Fox", meat, 0.7f);
        Animal fox2 = new Animal("Klaus", "Fox", meat, 0.7f);
        Guardian guardian1 = new Guardian("Jonathan");
        Guardian guardian2 = new Guardian("Abraham");

        zoo.addEnclousureToList(sheepEnc);
        zoo.addEnclousureToList(lionEnc);
        zoo.addEnclousureToList(duckEnc);
        zoo.addEnclousureToList(foxEnc);
        zoo.addGuardianToList(guardian1);
        zoo.addGuardianToList(guardian2);
        sheepEnc.addAnimalToList(sheep1);
        sheepEnc.addAnimalToList(sheep2);
        sheepEnc.addAnimalToList(sheep3);
        lionEnc.addAnimalToList(lion1);
        lionEnc.addAnimalToList(lion2);
        lionEnc.addAnimalToList(lion3);
        duckEnc.addAnimalToList(duck1);
        duckEnc.addAnimalToList(duck2);
        foxEnc.addAnimalToList(fox1);
        foxEnc.addAnimalToList(fox2);

        zoo.printStructure();
        zoo.printStatistics();


        for (int days = 1; days < 30; days++) {
            System.out.printf("Day: %d\n", days);
            for (int hour = 0; hour < 24; hour++) {
                System.out.printf("Hour: %d\n", hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                zoo.workDay(hour);
            }
            zoo.resetDay();
        }
    }
}
