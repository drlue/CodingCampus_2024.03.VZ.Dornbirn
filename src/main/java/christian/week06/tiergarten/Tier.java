package christian.week06.tiergarten;

import christian.week06.tiergarten.hilfsKlassen.Futter;

public class Tier {
    private String name;
    private String gattung;
    private Futter futter;
    private float futterMenge;

    public Tier(String name, String gattung, Futter futter, float futterMenge) {
        this.name = name;
        this.gattung = gattung;
        this.futter = futter;
        this.futterMenge = futterMenge;
    }

    public String toString() {
        return "    |---" + name + ", " + gattung + "\n";
    }

    public String getName() {
        return name;
    }

    public String getGattung() {
        return gattung;
    }

    public Futter getFutter() {
        return futter;
    }

    public float getFutterMenge() {
        return futterMenge;
    }
}
