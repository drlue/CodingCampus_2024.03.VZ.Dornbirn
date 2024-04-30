package katherina.week09.Schulsimulation;

public class Raum {
    private String name;
    private int capacity;
    private Lehrperson lehrperson;

    public Raum(String name, int capacity){
        this.name=name;
        this.capacity=capacity;
        //Brauchen wir zwar für die vorliegende Aufgabe nicht, glaube ich, aber falls die Aufgabe erweitert wird, schon.
    }

    public String getName() {
        return this.name;
    }


    public Lehrperson getLehrperson() {
        return lehrperson;
    }

    void setLehrpersonIntern(Lehrperson lehrperson) {
        this.lehrperson = lehrperson;
    }

}
