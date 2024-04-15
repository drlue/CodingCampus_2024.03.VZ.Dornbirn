package christian.week06.tiergarten;

import christian.week06.tiergarten.hilfsKlassen.Futter;

public class Tier {
    private String name;
    private String gattung;
    private Futter futter;
    private float futterMenge;

    private boolean gefuettert;

    private int maxHP;
    private int hp;

    public Tier(String name, String gattung, Futter futter, float futterMenge, int maxHP) {
        this.name = name;
        this.gattung = gattung;
        this.futter = futter;
        this.futterMenge = futterMenge;
        this.hp = maxHP;
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
    public void reset(){
        this.gefuettert = false;
    }
    public void setGefuettert(){
        gefuettert = true;
    }
    public boolean getGefuettert(){
        return gefuettert;
    }
}
