package irem.week08.DolceVita;

import java.util.ArrayList;
import java.util.List;

class Hauptkellner extends Kellner {
    List<Kellner> kellnerListe;

    public Hauptkellner(String name, int id) {
        super(name, id);
        kellnerListe = new ArrayList<>();
    }

    public void addKellner(Kellner kellner) {
        kellnerListe.add(kellner);
    }

    public Kellner ermittleTopKellnerNachUmsatz() {
        return kellnerListe.stream().max((k1, k2) -> Double.compare(k1.gesamtumsatz, k2.gesamtumsatz)).orElse(null);
    }

    public Kellner ermittleTopKellnerNachAnzahlGaste() {
        return kellnerListe.stream().max((k1, k2) -> Integer.compare(k1.bedienteGaste, k2.bedienteGaste)).orElse(null);
    }
}
