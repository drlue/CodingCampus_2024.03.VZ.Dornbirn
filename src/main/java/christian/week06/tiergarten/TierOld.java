package christian.week06.tiergarten;

import christian.week06.tiergarten.hilfsKlassen.FutterOld;

public class TierOld {
    private String name;
    private String gattung;
    private FutterOld futterOld;
    private float futterMenge;

    private boolean gefuettert;

    private int maxHP;
    private int hp;

    public TierOld(String name, String gattung, FutterOld futterOld, float futterMenge, int maxHP) {
        this.name = name;
        this.gattung = gattung;
        this.futterOld = futterOld;
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

    public FutterOld getFutter() {
        return futterOld;
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
