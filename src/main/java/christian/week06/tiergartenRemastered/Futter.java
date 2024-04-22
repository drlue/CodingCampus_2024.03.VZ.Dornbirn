package christian.week06.tiergartenRemastered;

public class Futter {
    private String name;
    private String einheit;
    private float einheitsPreis;

    public Futter(String name, String einheit, float einheitsPreis) {
        this.name = name;
        this.einheit = einheit;
        this.einheitsPreis = einheitsPreis;
    }

    public String getName() {
        return name;
    }

    public float getEinheitsPreis() {
        return einheitsPreis;
    }
}
