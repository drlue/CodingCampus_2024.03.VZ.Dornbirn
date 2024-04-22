package gyula.week07.zooWithTick;

public class ZooSim {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Tierpark Feldkirch", 1965);
        Enclosure alpenwiese = new Enclosure("Alpenwiese");
        zoo.addEnclosure(alpenwiese);

        Enclosure ried = new Enclosure("Ried");
        zoo.addEnclosure(ried);

        Enclosure terrarium = new Enclosure("Terrarium (warm)");
        zoo.addEnclosure(terrarium);
        zoo.addEnclosure(alpenwiese);

        Animal rijska = new Animal("Rijska", "Kuh");
        alpenwiese.addAnimal(rijska);

        Animal zuska = new Animal("Zuska", "Ziege");
        alpenwiese.addAnimal(zuska);
        Animal zoltan = new Animal("Zoltan", "Ziege");
        alpenwiese.addAnimal(zoltan);


        Guardian stefan = new Guardian("Stefan-Sigfried", "Kuh");
        zoo.addGuardianAndTask(stefan, alpenwiese);
        zoo.addGuardianAndTask(stefan, ried);

        Guardian tony = new Guardian("Tony", "Elephant");
        zoo.addGuardianAndTask(tony, terrarium);


        zoo.printStructure();

        System.out.println();
        for (int day = 1; day <= 3; day++) {
            zoo.simulateDay(day);
        }
    }
}
