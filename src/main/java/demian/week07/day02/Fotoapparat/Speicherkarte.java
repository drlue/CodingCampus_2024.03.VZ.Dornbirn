package demian.week07.day02.Fotoapparat;

public class Speicherkarte {
    private int speicherplatzGesamt;
    private int freierSpeicher;

    public Speicherkarte(int speicherplatz){
        this.speicherplatzGesamt = speicherplatz;
        this.freierSpeicher = speicherplatz;
    }

    public int getSpeicherplatzGesamt() {
        return speicherplatzGesamt;
    }

    public int getFreierSpeicher() {
        return freierSpeicher;
    }

    public void setFreierSpeicher(int freierSpeicher) {
        this.freierSpeicher = freierSpeicher;
    }

    // Erstelle Methoden um zu erfragen wieviele Fotos bereits aufgenommen wurden und wieviel Speicher noch frei ist:
    public String getPhotostaken() {
        //Für die Berechnung speicherplatz pro bild, kann ein wert von 0.3mb pro Megapixel angenommen werden
        String s = "Fotos gemacht: " + (int) (speicherplatzGesamt-freierSpeicher / 0.3f);
        return s;
    }


    @Override
    public String toString() {
        return "Speicherkarte: " + (speicherplatzGesamt/1000) + "GB" +
                "\n=====================" +
                "\nspeicherplatzGesamt=" + speicherplatzGesamt + "MB" +
                "\nfreierSpeicher=" + freierSpeicher + "MB" +
                "\n";
    }
}
