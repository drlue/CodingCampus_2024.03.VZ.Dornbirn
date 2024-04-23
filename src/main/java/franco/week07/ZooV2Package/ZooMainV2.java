package franco.week07.ZooV2Package;

public class ZooMainV2 {
    public static void main(String[] args) {
        ZooV2 zoo1 = new ZooV2("WIlD PARK ST JOSE", 1990);


        EnclosureV2 alpine = new EnclosureV2("Alpine");
        EnclosureV2 wildPark = new EnclosureV2("Wild Park");
        EnclosureV2 ried = new EnclosureV2("Ried");
        EnclosureV2 terrarium = new EnclosureV2("Terrarium Warm)");

        AnimalV2 doggo= new AnimalV2("Doggo","Dog");
        AnimalV2 rosco= new AnimalV2("Rosco","Crocodile");
        AnimalV2 bosco = new AnimalV2("Bolos","horse");
        AnimalV2 rudolf = new AnimalV2("Rudolf","Wolf");
        AnimalV2 idaxis = new AnimalV2("Idaxis","Elephant");
        AnimalV2 lonzo = new AnimalV2("Lonzo","Giraffe");
        AnimalV2 chien = new AnimalV2("Chien","Dog");
        AnimalV2 chat = new AnimalV2("Chat","Cat");
        AnimalV2 cheval = new AnimalV2("Cheval","horse");
        AnimalV2 oiseau = new AnimalV2("Oiseau","Bird");
        AnimalV2 bigSmall = new AnimalV2("Biggy","Elephant");
        AnimalV2 king = new AnimalV2("King","Lion");
        AnimalV2 simba = new AnimalV2("Simba","Lion");
        AnimalV2 birdy = new AnimalV2("Birdy","Bird");
        AnimalV2 rijiska = new AnimalV2("Rijiska","Cow");
//
//        zoo1.addAnimalAndEnclosure(alpine,doggo);
//        zoo1.addAnimalAndEnclosure(alpine,rosco);
//        zoo1.addAnimalAndEnclosure(wildPark,bosco);
//        zoo1.addAnimalAndEnclosure(wildPark,bigSmall);
//        zoo1.addAnimalAndEnclosure(wildPark,simba);
//        zoo1.addAnimalAndEnclosure(wildPark,king);
//        zoo1.addAnimalAndEnclosure(ried,birdy);
//        zoo1.addAnimalAndEnclosure(ried,cheval);
//        zoo1.addAnimalAndEnclosure(ried,rijiska);
//        zoo1.addAnimalAndEnclosure(alpine,oiseau);
//        zoo1.addAnimalAndEnclosure(alpine,rudolf);
//        zoo1.addAnimalAndEnclosure(wildPark,idaxis);
//        zoo1.addAnimalAndEnclosure(ried,chat);
//        zoo1.addAnimalAndEnclosure(wildPark,chien);
//        zoo1.addAnimalAndEnclosure(wildPark,lonzo);
        zoo1.addAnimalAndEnclosure(alpine,new AnimalV2("Dog","Dog"));

        alpine.addAnimal(doggo);

        zoo1.addEnclosure(terrarium);
        zoo1.addEnclosure(alpine);

        zoo1.printStructure();
    }
}
