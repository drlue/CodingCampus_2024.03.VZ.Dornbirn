package aki.week08.zoo;

public class Main {
    public static void main(String[] args) {
        //Zoo Name und gründungs Datum
        Zoo zoo = new Zoo();


        //Gehegen erstellen
        Enclosure pentagon = zoo.searchAndCreateEnclosure("Pentagon");
        Enclosure villa = zoo.searchAndCreateEnclosure("Villa");


        //Tiere anmelden
        Animal rijska = new Animal("Leopold", "(Katze)");
        Animal kuh = new Animal("Astra", "Kuh");


        //Tiere zur gewünschten Gehege hinzufügen
        villa.addAnimal(rijska);
        pentagon.addAnimal(kuh);


        //Ausdruck des Zoo's
        zoo.printZooStructure();

    }
}
