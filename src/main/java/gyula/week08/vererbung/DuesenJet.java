package gyula.week08.vererbung;

public class DuesenJet extends Flugzeug {
    private int thrust;

    public DuesenJet(String name, int gewicht, int spannweite, int thrust){
        super(name, gewicht, spannweite);
        this.thrust = thrust;
    }

    public int getThrust() {
        return thrust;
    }

    @Override
    public String getName() {
        return super.getName().toUpperCase();
    }

    @Override
    public String toString() {
        return String.format("Jet: %s with a weight %d", getName(), gewicht);
    }
}
