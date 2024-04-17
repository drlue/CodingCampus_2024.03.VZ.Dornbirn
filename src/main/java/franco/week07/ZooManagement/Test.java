package franco.week07.ZooManagement;

public class Test {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Abercrombie Nat. Zoo", 1945);

        Enclosure alpenwiese = new Enclosure("Alpenwiese");
        Enclosure ried = new Enclosure("Ried");
        Enclosure terrarium = new Enclosure("Terrarium");

//        alpenwiese.addAnimal(new Animal("Rijska", "Kuh"));
//        ried.addAnimal(new Animal("Garmond", "Storh"));
//        ried.addAnimal(new Animal("Hugo", "Storh"));
//        ried.addAnimal(new Animal("Idaxis", "Storh"));

        zoo.addEnclosure(alpenwiese);
        zoo.addEnclosure(ried);
        zoo.addEnclosure(terrarium);
        //food
        Food grass= new Food("grass",20.50);
        Food fish= new Food("fish",3.50);
        Food hay = new Food("hay",15);
        Food meat = new Food("meat",22);


        Animal bird= new Animal("Birdy","Bird");
        Animal cow= new Animal("Karla","Cow");
        Animal lion=new Animal("Simba", "lion");
        Animal kuh1= new Animal("Rijska","Kuh");

        kuh1.addFood(hay,5.0);
        cow.addFood(grass,6.0);
        lion.addFood(meat,5.0);
        bird.addFood(fish,5.0);
        ried.addAnimal(kuh1);
        ried.addAnimal(lion);
        alpenwiese.addAnimal(cow);
        alpenwiese.addAnimal(bird);

        Caretaker carer= new Caretaker("Kiyan");
        Caretaker carer2= new Caretaker("Azaya");

        System.out.println(zoo);

    }
}
