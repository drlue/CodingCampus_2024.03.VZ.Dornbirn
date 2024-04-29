package katherina.week09.Schulsimulation;

public class SchulSimMain {
    public static void main(String[] args) {

        Schule borgandelsbuch = new Schule("BORG Andelsbuch", "Andelsbuch", 2024);

        Raum klassenzimmer1 = new Klassenzimmer("Raum 0-1", 31);
        Raum klassenzimmer2 = new Klassenzimmer("Raum 0-2", 31);
        Raum edv = new Klassenzimmer("EDV-Raum 0-3", 31);
        Raum kunstraum = new Klassenzimmer("Kunstsaal 1-3",31);

        Raum konferenzzimmer = new Konferenzzimmer("Konferenzzimmer 1-1", 50);
        Raum turnhalle = new Turnhalle("Allgemeine Turnhalle 1-2", 62);
        //Das Anlegen von Konferenzzimmern und Turnhallen als spezielle Raumtypen erlaubt
        //Erweiterungen, wie beispielsweise das Anlegen von Kustodiaten oder Gymnastikräumen.
        borgandelsbuch.addRaum(klassenzimmer1);
        borgandelsbuch.addRaum(klassenzimmer2);
        borgandelsbuch.addRaum(edv);
        borgandelsbuch.addRaum(konferenzzimmer);
        borgandelsbuch.addRaum(turnhalle);
    }
}
