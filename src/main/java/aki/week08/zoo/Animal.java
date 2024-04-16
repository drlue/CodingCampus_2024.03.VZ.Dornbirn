package aki.week08.zoo;

public class Animal {
    private String name;
    private String species;

    public Animal(String name, String gattung) {
        this.name = name;
        this.species = gattung;
    }
    //Wird in Enclosure benutzt
    public void printStructure() {
        System.out.printf("│        ├── %s, %s%n", name, species);
    }
}
