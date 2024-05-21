package irem.week09.schule;


enum RaumTyp {
    KLASSENRAUM, SPORTHALLE, TECHNIKRAUM, LEHRERZIMMER, DIREKTORZIMMER
}
class Raum {
    private RaumTyp typ;
    private String name;

    public Raum(RaumTyp typ, String name) {
        this.typ = typ;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public RaumTyp getTyp() {
        return typ;
    }

    // Methode zur Überprüfung des Zugriffs auf den Raum
    public boolean hatZugriff(Person person) {
        if (typ == RaumTyp.LEHRERZIMMER || typ == RaumTyp.DIREKTORZIMMER) {
            return person instanceof Lehrer || person instanceof Schuldirektor;
        }
        return true;  // Alle anderen Räume sind für alle Personen zugänglich
    }

    @Override
    public String toString() {
        return name + " (" + typ + ")";
    }


}