package katherina.week09.Schulsimulation;

public class Lernende extends Person {
    private Klasse klasse;

    enum Klasse {
        EINS,
        ZWEI,
        DREI,
        VIER,
    };

    public Lernende(String name, Klasse klasse) {
        super(name);
        this.klasse = klasse;
    }
}
