package aki.week08.zoo;

public class Main {
    public static void main(String[] args) {
        //Zoo Name und gründungs Datum
        Zoo zoo = new Zoo();

        //Gehegen:
        Enclosure pentagon = zoo.searchAndCreateEnclosure("Pentagon");
        Enclosure villa = zoo.searchAndCreateEnclosure("Villa");
        Animal rijska = new Animal("Leopold", "(Katze)");
        villa.addAnimal(rijska);
        zoo.printZooStructure();

    }
}
