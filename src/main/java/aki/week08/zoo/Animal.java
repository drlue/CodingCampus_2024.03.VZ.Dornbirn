package aki.week08.zoo;

public class Animal {
    String name;
    String species;

    public Animal(String name, String gattung) {
        this.name = name;
        this.species = gattung;
    }

    public void printStructure() {
        System.out.printf("│        ├── %s %s%n", name, species);
    }
}
