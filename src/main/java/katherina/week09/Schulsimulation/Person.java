package katherina.week09.Schulsimulation;

public class Person {
    String name;

    public Person(String name) {
        this.name=name;
    }


    public String getName() {
        return this.name;
    }
    public void unterricht(Person lehrperson){
        System.out.printf("%s betritt das Klassenzimmer, und beginnt den Unterricht.%n",lehrperson.getName());
    }
}
