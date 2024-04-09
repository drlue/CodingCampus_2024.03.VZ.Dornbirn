package demian.week07.day02.Fotoapparat;

public class Objektiv {

    // Erweitere das vorhergehende Beispiel um die Klassen Objektiv und Speicherkarte.
    // Die Brennweite der Kamera fällt demnach weg.
    // Das Objektiv und die Speicherkarte sollen getauscht werden können.
    // Erstelle Methoden um zu erfragen wieviele Fotos bereits aufgenommen wurden
    // und wieviel Speicher noch frei ist. Für die Berechnung speicherplatz pro bild,
    // kann ein wert von 0.3mb pro Megapixel angenommen werden.[1]

    private float Brennweite;


    public Objektiv(float Brennweite){
        this.Brennweite = Brennweite;
    }

    //GETTERS:


    public float getBrennweite() {
        return Brennweite;
    }

    //SETTERS:


    public void setBrennweite(float brennweite) {
        Brennweite = brennweite;
    }

    @Override
    public String toString() {
        return "Objektivdaten: " + Brennweite + "/" +
                "\n=======================" +
                "\nBrennweite=" + Brennweite;
    }
}
