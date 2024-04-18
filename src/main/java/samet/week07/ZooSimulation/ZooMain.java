package samet.week07.ZooSimulation;

public class ZooMain {

    public static void main(String[] args) {

        Zoo zoo = new Zoo("Tiergarten Dornbirn ", 2022);
        Enclosure alpenwiese = new Enclosure("Alpenwiese");
        Enclosure ried = new Enclosure("Ried");
        Enclosure terrarium = new Enclosure("Terrarium (warm)");
        zoo.addEnclosure(alpenwiese);
        zoo.addEnclosure(ried);
        zoo.addEnclosure(terrarium);

        Food hay = new Food("Hay", "kg", 0.16f);
        Food meat = new Food("Meat", "kg", 4.99f);
        Food mouse = new Food("Mouse", "Stück", 0.49f);

        Animal rijska = new Animal("Rijska", "Cow", hay, 20f);
        Animal gandalf = new Animal("Gandalf", "Cow", hay, 20f);
        Animal ciquito = new Animal("Ciquito", "Cow", hay, 20f);
        alpenwiese.addAnimal(rijska);
        alpenwiese.addAnimal(gandalf);
        alpenwiese.addAnimal(ciquito);

        Animal garmond = new Animal("Garmond", "Tiger", meat, 10f);
        Animal hugo = new Animal("Hugo", "Tiger", meat, 15f);
        Animal idaxis = new Animal("Idaxis", "Tiger", meat, 12f);
        ried.addAnimal(garmond);
        ried.addAnimal(hugo);
        ried.addAnimal(idaxis);

        Animal king = new Animal("King", "Snake", mouse, 1f);
        Animal queen = new Animal("Queen", "Snake", mouse, 1f);
        Animal prince = new Animal("Prince", "Snake", mouse, 1f);
        terrarium.addAnimal(king);
        terrarium.addAnimal(queen);
        terrarium.addAnimal(prince);

        Keeper gunter = new Keeper("Günter", "Kuh");
        Keeper stefan = new Keeper("Stefan", "Tiger");
        Keeper josef = new Keeper("Josef", "Schlange");
        zoo.addGuardianAndTask(gunter, alpenwiese);
        zoo.addGuardianAndTask(stefan, ried);
        zoo.addGuardianAndTask(josef, terrarium);


        zoo.printZooStructure();
        zoo.printFoodCost();

        System.out.println();
        for (int day = 1; day <= 7; day++) {
            zoo.simulatedDay(day);
        }
    }
}








