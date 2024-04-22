package samet.week07.ZooSimulation;

public class ZooMain {

    public static void main(String[] args) {

        Zoo zoo = new Zoo("Tiergarten Dornbirn ", 2022);

        Enclosure meadow = new Enclosure("Meadow");
        Enclosure predatorEnclosure = new Enclosure("Predator Enclosure");
        Enclosure terrarium = new Enclosure("Terrarium (warm)");
        Enclosure aquarium = new Enclosure("Aquarium");
        Enclosure birdHouse = new Enclosure("Bird House");
        zoo.addEnclosure(meadow);
        zoo.addEnclosure(predatorEnclosure);
        zoo.addEnclosure(terrarium);
        zoo.addEnclosure(aquarium);
        zoo.addEnclosure(birdHouse);

        Food hay = new Food("Hay", "kg", 0.16f);
        Food meat = new Food("Meat", "kg", 4.99f);
        Food mouse = new Food("Mouse", "Stück", 0.49f);
        Food fish = new Food("Fish","kg",1.25f);

        Animal boss = new Animal("Boss", "Cow", hay, 20f,150,150,25);
        Animal gandalf = new Animal("Gandalf", "Cow", hay, 20f,150,150,25);
        Animal apples = new Animal("Apples", "Cow", hay, 20f,150,150,25);
        meadow.addAnimal(boss);
        meadow.addAnimal(gandalf);
        meadow.addAnimal(apples);

        Animal pasha = new Animal("Pasha", "Tiger", meat, 10f,300,300,60);
        Animal hugo = new Animal("Hugo", "Tiger", meat, 15f,300,300,60);
        Animal johnny = new Animal("Johnny", "Tiger", meat, 12f,300,300,60);
        predatorEnclosure.addAnimal(pasha);
        predatorEnclosure.addAnimal(hugo);
        predatorEnclosure.addAnimal(johnny);

        Animal king = new Animal("King", "Snake", mouse, 1f,200,200,40);
        Animal queen = new Animal("Queen", "Snake", mouse, 1f,200,200,40);
        Animal prince = new Animal("Prince", "Snake", mouse, 1f,200,200,40);
        terrarium.addAnimal(king);
        terrarium.addAnimal(queen);
        terrarium.addAnimal(prince);

        Animal skipper = new Animal("Skipper","Dolphin",fish,4f,250,250,50);
        Animal flipper = new Animal("Flipper","Dolphin",fish,4f,250,250,50);
        aquarium.addAnimal(skipper);
        aquarium.addAnimal(flipper);

        Keeper gunter = new Keeper("Günter", "Kuh");
        Keeper stefan = new Keeper("Stefan", "Tiger");
        Keeper josef = new Keeper("Josef", "Schlange");
        zoo.addGuardianAndTask(gunter, meadow);
        zoo.addGuardianAndTask(stefan, predatorEnclosure);
        zoo.addGuardianAndTask(josef, terrarium);


        zoo.printZooStructure();
        zoo.printFoodCost();



        sleep(1000);

        System.out.println();
        for (int day = 1; day <= 7; day++) {
            zoo.simulatedDay(day);
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








