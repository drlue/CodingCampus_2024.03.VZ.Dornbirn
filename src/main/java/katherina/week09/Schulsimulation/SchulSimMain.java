package katherina.week09.Schulsimulation;

public class SchulSimMain {
    public static void main(String[] args) {

        Schule borgandelsbuch = new Schule("BORG Andelsbuch", "Andelsbuch", 2024);

        Schuldirex direx = new Schuldirex("Mag. Patrizia Prinzipalia");
        borgandelsbuch.addPerson(direx);

        Raum klassenzimmer1 = new Klassenzimmer("Raum 0-1", 31);
        Raum klassenzimmer2 = new Klassenzimmer("Raum 0-2", 31);
        Raum klassenzimmer3=new Klassenzimmer("Raum 1-0",31);
        Raum edv = new Klassenzimmer("EDV-Raum 0-3", 31);
        Raum kunstraum = new Klassenzimmer("Kunstsaal 1-3", 31);


        Raum konferenzzimmer = new Konferenzzimmer("Konferenzzimmer 1-1", 50);
        Raum turnhalle = new Turnhalle("Allgemeine Turnhalle 1-2", 62);
        //Das Anlegen von Konferenzzimmern und Turnhallen als spezielle Raumtypen erlaubt
        //Erweiterungen, wie beispielsweise das Anlegen von Kustodiaten oder Gymnastikräumen.

        borgandelsbuch.addRaum(klassenzimmer1);
        borgandelsbuch.addRaum(klassenzimmer2);
        borgandelsbuch.addRaum(klassenzimmer3);
        borgandelsbuch.addRaum(edv);
        borgandelsbuch.addRaum(kunstraum);

        borgandelsbuch.addRaum(konferenzzimmer);

        borgandelsbuch.addRaum(turnhalle);

        Lehrperson lehrperson = new Lehrperson("Professor Wagner", "Deutsch");
        Lehrperson lehrperson2 = new Lehrperson("Professor Auer", "Mathe");
        Lehrperson lehrperson3 = new Lehrperson("Professor Eder", "Latein");
        Lehrperson lehrperson4 = new Lehrperson("Professor Aigner", "Turnen");
        Lehrperson lehrperson5 = new Lehrperson("Professor Bauer", "Informatik");
        Lehrperson lehrperson6 = new Lehrperson("Professor Wolf","Kunst");
        borgandelsbuch.addPerson(lehrperson);
        lehrperson.setRaum(klassenzimmer1);
        borgandelsbuch.addPerson(lehrperson2);
        lehrperson2.setRaum(klassenzimmer2);
        borgandelsbuch.addPerson(lehrperson3);
        lehrperson3.setRaum(klassenzimmer3);
        borgandelsbuch.addPerson(lehrperson4);
        lehrperson4.setRaum(turnhalle);
        borgandelsbuch.addPerson(lehrperson5);
        lehrperson5.setRaum(edv);
        borgandelsbuch.addPerson(lehrperson6);
        lehrperson6.setRaum(kunstraum);


        Lernende lernt = new Lernende("Findus Pichler", Lernende.Klasse.VIER);
        Lernende lernt1 = new Lernende("Dian Müller", Lernende.Klasse.DREI);
        Lernende lernt2 = new Lernende("Isbert Weiß", Lernende.Klasse.EINS);
        Lernende lernt3 = new Lernende("Luisa Holzer", Lernende.Klasse.EINS);
        Lernende lernt4 = new Lernende("Bente Schmid", Lernende.Klasse.VIER);
        Lernende lernt5 = new Lernende("Goddard Wimmer", Lernende.Klasse.ZWEI);
        Lernende lernt6 = new Lernende("Andy Weber", Lernende.Klasse.EINS);
        Lernende lernt7 = new Lernende("Gefion Fischer", Lernende.Klasse.VIER);
        Lernende lernt8 = new Lernende("Armin Wagner", Lernende.Klasse.ZWEI);
        Lernende lernt9 = new Lernende("Isidor Pirker", Lernende.Klasse.VIER);
        Lernende lernt10 = new Lernende("Blue Kraus",Lernende.Klasse.DREI);
        Lernende lernt11 = new Lernende("Gaio Weber",Lernende.Klasse.ZWEI);
        Lernende lernt12 = new Lernende("Josiah Maier",Lernende.Klasse.ZWEI);
        Lernende lernt13 = new Lernende("Keith Ebner",Lernende.Klasse.VIER);
        Lernende lernt14 = new Lernende("Filiz Winkler",Lernende.Klasse.EINS);
        Lernende lernt15 = new Lernende("Imilian Lehner",Lernende.Klasse.DREI);
        Lernende lernt16 = new Lernende("Fernando Müller",Lernende.Klasse.DREI);
        Lernende lernt17 = new Lernende("Emirhan Maier",Lernende.Klasse.VIER);
        Lernende lernt18 = new Lernende("Dick Huber",Lernende.Klasse.EINS);
        Lernende lernt19 = new Lernende("Anil Schuster-Walter",Lernende.Klasse.ZWEI);
        //Nur eine Person in der dritten Schulstufe ^^. Zum Testen tut es schon, aber auf lange Sicht muss ich meine Random-Namenslisten etc. eh überarbeiten.
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
        borgandelsbuch.addPerson(lernt10);
        borgandelsbuch.addPerson(lernt11);
        borgandelsbuch.addPerson(lernt12);
        borgandelsbuch.addPerson(lernt13);
        borgandelsbuch.addPerson(lernt14);
        borgandelsbuch.addPerson(lernt15);
        borgandelsbuch.addPerson(lernt16);
        borgandelsbuch.addPerson(lernt17);
        borgandelsbuch.addPerson(lernt18);
        borgandelsbuch.addPerson(lernt19);


        System.out.println();
        for (int day = 1; day <= 1; day++) {
//            for (int fifteen = 0;fifteen<=22;fifteen++){
//                for (int index = 0; index <personenliste.size() ; index++) {
//                   personenliste(index).activity(fifteen);
//                }
//            }
            borgandelsbuch.simulateDay(day);
        }
    }

    //Eine Schulstunde = 3*fifteen -> 18 für 6 Schulstunden
    //Pause = fifteen ->4 Pausen
    //Ein Schultag = 22 fifteens

    //Stundenplan:
    //Montag: Erste Klasse:
    //Deutsch, Latein, Kunst, Turnen, Informatik
    //        Zweite Klasse:
    //Latein, Kunst, Turnen, Informatik, Deutsch
    //        Dritte Klasse:
    //Kunst, Turnen, Informatik, Deutsch, Latein
    //        Vierte Klasse:
    //Turnen, Informatik, Deutsch, Latein, Kunst






}
