package christian.week06.tiergarten.hilfsKlassen;

public class FutterOld {

    private String name;
    private String einheit; // kg/g/liter
    private float einheitsPreis; //Preis pro einheit

    public FutterOld(String name, String einheit, float einheitsPreis) {
        this.name = name;
        this.einheit = einheit;
        this.einheitsPreis = einheitsPreis;
    }

    public String getName() {
        return name;
    }

    public String getEinheit() {
        return einheit;
    }

    public float getEinheitsPreis() {
        return einheitsPreis;
    }
    public void setEinheitsPreis(float neuerPreis){
        this.einheitsPreis = neuerPreis;
    }
    public String toString(){
        return "Futter: "+name+"in " + einheit+ "\n Preis pro Einheit in Euro: " + einheitsPreis;
    }
}
