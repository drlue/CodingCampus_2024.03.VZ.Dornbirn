package katherina.week06.day01.BeispielNachGyula;

//Hier sammle ich sozusagen die Methoden, die notwendig sind, um ene Teilnahmeliste auszugeben und zu formatieren.

public class Participant {
    private String name;
    private Workshop workshop;

    public Participant(String name){
        this.name = name;
        this.workshop = null;
    }
    //Das ist der Konstruktor der Klasse "Participant".
    //Die this.-Deklarationen bilden eine Parameterliste.

    public Workshop getWorkshop() {
        return workshop;
    }

    public void setWorkshop(Workshop workshop) {
        this.workshop = workshop;
    }

    @Override
    //Ich sage dem Programm hier direkt und wortwörtlich: Überschreib mir das mal.
    public String toString() {
        return "Die Person " + name + " nimmt an " + workshop.getName() +" teil.";
    }
}
