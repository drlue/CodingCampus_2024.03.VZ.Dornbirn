package katherina.zoocopyforexperiments;

public class Tierfutter {

    private String bezeichnung;
    private String einheit;
    private float preisProUnit;

    public Tierfutter(String bezeichnung, String einheit, float preisProUnit) {
        this.bezeichnung = bezeichnung;
        this.einheit = einheit;
        this.preisProUnit = preisProUnit;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public float getPreisProUnit() {
        return preisProUnit;
    }

}
