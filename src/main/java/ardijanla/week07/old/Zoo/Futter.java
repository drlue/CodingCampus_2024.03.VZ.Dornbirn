package ardijanla.week07.old.Zoo;

import java.util.HashMap;

public class Futter {
    private String name;
    private String einheit;
    private double einheitspreis;

    public Futter(String name, String einheit, double einheitspreis) {
        this.name = name;
        this.einheit = einheit;
        this.einheitspreis = einheitspreis;
    }

    public double getKosten(int menge) {
        return menge * einheitspreis;
    }

    @Override
    public String toString() {
        return name + " (" + einheit + ")";
    }
}



