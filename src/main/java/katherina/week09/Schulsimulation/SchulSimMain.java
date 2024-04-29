package katherina.week09.Schulsimulation;

public class SchulSimMain {
    public static void main(String[] args) {

        Schule borgandelsbuch = new Schule("BORG Andelsbuch", "Andelsbuch", 2024);

        Person direx = new Schuldirex("Mag. Patrizia Prinzipalia");
        borgandelsbuch.addPerson(direx);

        Raum klassenzimmer1 = new Klassenzimmer("Raum 0-1", 31);
        Raum klassenzimmer2 = new Klassenzimmer("Raum 0-2", 31);
        Raum edv = new Klassenzimmer("EDV-Raum 0-3", 31);
        Raum kunstraum = new Klassenzimmer("Kunstsaal 1-3", 31);

        Raum konferenzzimmer = new Konferenzzimmer("Konferenzzimmer 1-1", 50);
        Raum turnhalle = new Turnhalle("Allgemeine Turnhalle 1-2", 62);
        //Das Anlegen von Konferenzzimmern und Turnhallen als spezielle Raumtypen erlaubt
        //Erweiterungen, wie beispielsweise das Anlegen von Kustodiaten oder Gymnastikräumen.

        borgandelsbuch.addRaum(klassenzimmer1);
        borgandelsbuch.addRaum(klassenzimmer2);
        borgandelsbuch.addRaum(edv);
        borgandelsbuch.addRaum(kunstraum);

        borgandelsbuch.addRaum(konferenzzimmer);

        borgandelsbuch.addRaum(turnhalle);

        Person lehrperson = new Lehrperson("Professor Wagner", Lehrperson.Fach.DEUTSCH);
        Person lehrperson2 = new Lehrperson("Professor Auer", Lehrperson.Fach.MATHE);
        Person lehrperson3 = new Lehrperson("Professor Eder", Lehrperson.Fach.LATEIN);
        Person lehrperson4 = new Lehrperson("Professor Aigner", Lehrperson.Fach.TURNEN);
        Person lehrperson5 = new Lehrperson("Professor Bauer", Lehrperson.Fach.INFORMATIK);
        Person lehrperson6 = new Lehrperson("Professor Wolf",Lehrperson.Fach.KUNST);
        borgandelsbuch.addPerson(lehrperson);
        borgandelsbuch.addPerson(lehrperson2);
        borgandelsbuch.addPerson(lehrperson3);
        borgandelsbuch.addPerson(lehrperson4);
        borgandelsbuch.addPerson(lehrperson5);
        borgandelsbuch.addPerson(lehrperson6);


        Person lernt = new Lernende("Findus Pichler", Lernende.Klasse.VIER);
        Person lernt1 = new Lernende("Dian Müller", Lernende.Klasse.DREI);
        Person lernt2 = new Lernende("Isbert Weiß", Lernende.Klasse.EINS);
        Person lernt3 = new Lernende("Luisa Holzer", Lernende.Klasse.EINS);
        Person lernt4 = new Lernende("Bente Schmid", Lernende.Klasse.VIER);
        Person lernt5 = new Lernende("Goddard Wimmer", Lernende.Klasse.ZWEI);
        Person lernt6 = new Lernende("Andy Weber", Lernende.Klasse.EINS);
        Person lernt7 = new Lernende("Gefion Fischer", Lernende.Klasse.VIER);
        Person lernt8 = new Lernende("Armin Wagner", Lernende.Klasse.ZWEI);
        Person lernt9 = new Lernende("Isidor Pirker", Lernende.Klasse.VIER);
        borgandelsbuch.addPerson(lernt);
        borgandelsbuch.addPerson(lernt1);
        borgandelsbuch.addPerson(lernt2);
        borgandelsbuch.addPerson(lernt3);
        borgandelsbuch.addPerson(lernt4);
        borgandelsbuch.addPerson(lernt5);
        borgandelsbuch.addPerson(lernt6);
        borgandelsbuch.addPerson(lernt7);
        borgandelsbuch.addPerson(lernt8);
        borgandelsbuch.addPerson(lernt9);


    }
}
