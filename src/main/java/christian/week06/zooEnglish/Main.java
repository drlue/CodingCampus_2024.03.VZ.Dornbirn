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
        Animal sheep1 = new Animal("Berti", "Sheep", meat, 1.6f);
        Animal lion1 = new Animal("Hans", "Lion", hay, 6f);
        zoo.addEnclousureToList(sheepEnc);
        zoo.addEnclousureToList(lionEnc);
        sheepEnc.addAnimalToList(sheep1);
        lionEnc.addAnimalToList(lion1);

        zoo.printStructure();
        zoo.printStatistics();


        for (int days = 1; days < 30; days++) {
            System.out.printf("Day: %d\n", days);
            for (int hour = 23; hour < 24; hour++) {
                System.out.printf("Hour: %d\n", hour);
            }
        }
    }
}
