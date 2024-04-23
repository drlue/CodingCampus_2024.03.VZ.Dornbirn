package gyula.week08;

import gyula.week07.zoo.Animal;
import gyula.week07.zoo.Enclosure;
import gyula.week07.zoo.Zoo;

import java.util.Random;

public class NamesGenerator {
    public static void main(String[] args) {
        Zoo tierpark = new Zoo("Tierpark Dornbirn", 2024);
        Zoo cirkus = tierpark;
        Zoo apfelsaftladen = cirkus;

        Enclosure enc = new Enclosure("Arena");
        tierpark.addEnclosure(enc);
        for (int i = 0; i < 20; i++) {
            Animal ani = new Animal("Muecke " + i, "Muecke", 10, 100);
            //System.out.println(ani.getName());
            enc.addAnimal(ani);
        }
        for (int i = 0; i < 20; i++) {
            Animal ani = new Animal(generateAnimalName(), "Muecke", 10, 100);
            //System.out.println(ani.getName());
            enc.addAnimal(ani);
        }
        tierpark.printStructure();
        for (int day = 1; day <= 7; day++) {
            cirkus.simulateDay(day);
        }
        apfelsaftladen.printStructure();
    }

    private static Random rand = new Random();
    private static String[] vorname = new String[]{"Ali", "Beatrix", "Cecil", "Dalton", "Exept"};
    private static String[] descr = new String[]{"big", "tiny", "grey", "young", "the aggressiv"};
    private static String[] species = new String[]{"cow", "ant", "snake", "koi", "leo", "eagle"};

    public static String generateAnimalName() {
        return
              vorname[rand.nextInt(vorname.length)] + " " +
                descr[rand.nextInt(descr.length)] + " the " +
                species[rand.nextInt(species.length)];
    }
}
