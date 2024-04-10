package ardijanla.week06.FotoApparatExtended;

import gyula.week06.example2.Car;

public class Objektiv {
    int brennweiteMin;
    int brennweiteMax;

    private Fotoapparat fotoapparat;

    public Objektiv(int brennweiteMin, int brennweiteMax) {
        this.brennweiteMin = brennweiteMin;
        this.brennweiteMax = brennweiteMax;
        this.fotoapparat = null;
    }


    public Fotoapparat getFotoapparat() {
        return fotoapparat;
    }

    public void setFotoapparat(Fotoapparat fotoapparat) {
        if ((fotoapparat != null) && (fotoapparat.getObjektiv() == null)) {
            fotoapparat.setObjektiv(this);
        } else if (fotoapparat == null && this.fotoapparat != null) {
            this.fotoapparat.setObjektiv(null);
            System.out.println("Objektiv wurde in " + FotoLabor.getInstance() + " abmontiert.");
        }
    }

    public void setFotoapparatIntern(Fotoapparat fotoapparat) {
        this.fotoapparat = fotoapparat;
    }


    public String toString(){
        return "brennweite" + brennweiteMin + brennweiteMax;
    }
}