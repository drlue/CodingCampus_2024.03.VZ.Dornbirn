package katherina.week09.Schulsimulation;

public class Lehrperson extends Person {
        private Fach fach;

    enum Fach{
        DEUTSCH,
        LATEIN,
        MATHE,
        TURNEN,
        INFORMATIK,
        KUNST,
    };

    public Lehrperson(String name, Fach fach) {
        super(name);
        this.fach = fach;
    }
}
