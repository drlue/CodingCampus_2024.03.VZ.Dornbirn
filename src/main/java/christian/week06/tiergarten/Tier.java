package christian.week06.tiergarten;

public class Tier {
    private String name;
    private String gattung;

    public Tier(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;

    }

    public String toString() {
        return "|---" + name + ", " + gattung;
    }
}
