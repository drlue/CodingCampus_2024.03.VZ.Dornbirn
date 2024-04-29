package irem.ZooNew;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Straw Hat Pirates Zoo", 1997);

        //zoo.addEnclosure(new Enclosure("Alpine Meadow"));
        zoo.addEnclosure(new Enclosure("Marshland"));
        zoo.addEnclosure(new Enclosure("Warm Terrarium"));
        zoo.addEnclosure(new Enclosure("Wild"));

        Feed grass = new Feed("Grass", "kg");
        Feed fish = new Feed("Fish", "kg");

        Animal Cow= new Animal("Law", "Cow",  grass, 5.0, 100,20);
        Animal Stork = new Animal("Sanji", "Stork", fish, 1,100,20);
        Animal Bear = new Animal("Zoro", "Bear", fish, 1,100,20);
        Animal Bison = new Animal("Brook", "Stork", fish, 1,100,20);
        Animal Reindeer = new Animal("Chopper", "Reindeer", grass, 1,100,20);


        zoo.findEnclosure("Wild").addAnimal(Cow);
        zoo.findEnclosure("Marshland").addAnimal(Stork);
        zoo.findEnclosure("Marshland").addAnimal(Stork);
        zoo.findEnclosure("Wild").addAnimal(Bison);
        zoo.findEnclosure("Wild").addAnimal(Reindeer);

        Keeper keeper1 = new Keeper("Musty", "Wild");
        Keeper keeper2 = new Keeper("Milos", "Marshland");

        keeper1.addEnclosure(zoo.findEnclosure("Wild"));
        keeper1.addEnclosure(zoo.findEnclosure("Marshland"));
        keeper2.addEnclosure(zoo.findEnclosure("Wild"));
        keeper2.addEnclosure(zoo.findEnclosure("Warm Terrarium"));


        zoo.addKeeper(keeper1);
        zoo.addKeeper(keeper2);

        zoo.printStructure();

        System.out.println();
        for (int day = 1; day <= 7; day++) {
            zoo.simulateDay();
            sleep(1000);

        }

    }
    public static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
