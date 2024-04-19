package franco.week07.ZooV1Package;

public class ZooV1Main {
    public static void main(String[] args) {


        ZooV1 zoo1 = new ZooV1("St Paulo Animal Refuge", 1930);


        FoodV1 grass = new FoodV1("grass", 3.3);
        FoodV1 bird = new FoodV1("birdy", 11);
        FoodV1 meat = new FoodV1("Meat", 12);
        FoodV1 hal = new FoodV1("Hal", 10);

        CaretakerV1 carlos = new CaretakerV1("Carlos");
        CaretakerV1 samet = new CaretakerV1("Samet");
        CaretakerV1 dummy = new CaretakerV1("Dummy");

        EnclosureV1 alpenwiese = new EnclosureV1("Alpenwiese");
        EnclosureV1 ried=new EnclosureV1("Ried");
        EnclosureV1 wildness= new EnclosureV1("Wildness");

        zoo1.addCarerAndTask(carlos, alpenwiese);
        zoo1.addCarerAndTask(samet,ried);
        zoo1.addCarerAndTask(dummy,wildness);

        zoo1.addNewAnimalAndCheckIfExist("Alpenwiese", "Rijiska", "Cow", grass, "grass", 12.2, 5);
        zoo1.addNewAnimalAndCheckIfExist("Ried", "Bolos", "Horse", grass, "grass", 12.2, 3);
        zoo1.addNewAnimalAndCheckIfExist("Alpenwiese", "Bosko", "Snake", bird, "birdy", 12.2, 5);
        zoo1.addNewAnimalAndCheckIfExist("Ried", "Idaxis", "Elephant", grass, "grass", 20, 15);
        zoo1.addNewAnimalAndCheckIfExist("Alpenwiese", "Lonzo", "Giraffe", grass, "grass", 12.2, 5);
        zoo1.addNewAnimalAndCheckIfExist("Alpenwiese", "BigSmall", "Elephant", grass, "grass", 12.2, 20);
        zoo1.addNewAnimalAndCheckIfExist("Ried", "DMX", "Dog", meat, "meat ball", 12.2, 5);
        zoo1.addNewAnimalAndCheckIfExist("Alpenwiese", "Doggo", "Cat", bird, "birdy", 12.2, 5);
        zoo1.addNewEnclosureAndCheckIfExist("Terrarium (Warm)");
        zoo1.addNewAnimalAndCheckIfExist("Wildness", "Rosco", "Crocodile", meat, "meat", 15, 5);

        zoo1.printStructure();
        //  terra.printStructure();
        sleep(1500);

        System.out.println();
        for (int day = 1; day <= 7; day++) {
            zoo1.simulation(day);
            sleep(1500);
        }
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

