package christian.week06.zooEnglish;

import java.util.Random;
import java.util.Vector;

public class Main {

    public static Random rnd = new Random();

    public static void main(String[] args) {
        FinalZoo zoo = new FinalZoo("HappyZoo3", 2024);
        Food meat = new Food("Meat", "kg", 8.50f);
        Food hay = new Food("Hay", "kg", 0.60f);
        Enclousure sheepEnc = new Enclousure("SheepEnclousure");
        Enclousure lionEnc = new Enclousure("LionEnclousure");
        Enclousure duckEnc = new Enclousure("DuckEnclousure");
        Enclousure foxEnc = new Enclousure("FoxEnclousure");
        Animal sheep1 = new Animal("Berti", "Sheep", hay, 6f, 120f, 10);
        Animal sheep2 = new Animal("Brutus", "Sheep", hay, 6f, 120f, 10);
        Animal sheep3 = new Animal("Herta", "Sheep", hay, 6f, 120f, 10);
        Animal sheep4 = new Animal("Britta", "Sheep", hay, 6f, 120f, 10);
        Animal sheep5 = new Animal("Mauli", "Sheep", hay, 6f, 120f, 10);
        Animal duck1 = new Animal("Bibi", "Duck", hay, 1f, 40f, 3);
        Animal duck2 = new Animal("Susi", "Duck", hay, 1f, 40f, 3);
        Animal lion1 = new Animal("Hans", "Lion", meat, 1.6f, 150f, 30);
        Animal lion2 = new Animal("Paul", "Lion", meat, 1.6f, 150f, 30);
        Animal lion3 = new Animal("Jörg", "Lion", meat, 1.6f, 150f, 30);
        Animal lion4 = new Animal("Peter", "Lion", meat, 1.6f, 150f, 30);
        Animal fox1 = new Animal("Herbert", "Fox", meat, 0.7f, 60f, 10);
        Animal fox2 = new Animal("Klaus", "Fox", meat, 0.7f, 60f, 10);
        Guardian guardian1 = new Guardian("Jonathan", "Fox");
        Guardian guardian2 = new Guardian("Abraham", "Lion");
        Vetenary vetenary1 = new Vetenary("Dr.Hasenbein");

        zoo.addEnclousureToList(sheepEnc);
        zoo.addEnclousureToList(lionEnc);
        zoo.addEnclousureToList(duckEnc);
        zoo.addEnclousureToList(foxEnc);
        zoo.addGuardianToList(guardian1);
        zoo.addGuardianToList(guardian2);
        zoo.addVetenaryToList(vetenary1);
        sheepEnc.addAnimalToList(sheep1);
        sheepEnc.addAnimalToList(sheep2);
        sheepEnc.addAnimalToList(sheep3);
        sheepEnc.addAnimalToList(sheep4);
        sheepEnc.addAnimalToList(sheep5);
        lionEnc.addAnimalToList(lion1);
        lionEnc.addAnimalToList(lion2);
        lionEnc.addAnimalToList(lion3);
        lionEnc.addAnimalToList(lion4);
        duckEnc.addAnimalToList(duck1);
        duckEnc.addAnimalToList(duck2);
        foxEnc.addAnimalToList(fox1);
        foxEnc.addAnimalToList(fox2);

        zoo.printStructure();
        zoo.printStatistics();


        for (int days = 1; days < 30; days++) {
            System.out.printf("Day: %d\n", days);

            Vector<Enclousure> remainingWork = zoo.getRemainingWork();
            zoo.animalActivities();
            for (int hour = 0; hour < 24; hour++) {
                System.out.printf("Hour: %d\n", hour);
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
               zoo.workHour(hour, remainingWork);
            }
            zoo.resetDay();
        }
    }
}
