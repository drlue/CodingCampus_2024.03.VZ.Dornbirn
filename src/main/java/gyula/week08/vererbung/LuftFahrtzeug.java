package gyula.week08.vererbung;

public class LuftFahrtzeug {
    private String name;

    protected int gewicht;

    public LuftFahrtzeug(String name, int gewicht){
        this.name = name;
        this.gewicht = gewicht;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Luftfahrzeug: %s", name);
    }
}
