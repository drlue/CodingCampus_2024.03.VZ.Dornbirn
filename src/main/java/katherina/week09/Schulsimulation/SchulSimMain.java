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

        Person lehrperson = new Lehrperson("Professor Wagner", "Deutsch");
        Person lehrperson2 = new Lehrperson("Professor Auer", "Mathe");
        Person lehrperson3 = new Lehrperson("Professor Eder", "Latein");
        Person lehrperson4 = new Lehrperson("Professor Aigner", "Turnen");
        Person lehrperson5 = new Lehrperson("Professor Bauer", "Informatik");
        Person lehrperson6 = new Lehrperson("Professor Wolf","Kunst");
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
        Person lernt10 = new Lernende("Blue Kraus",Lernende.Klasse.DREI);
        Person lernt11 = new Lernende("Gaio Weber",Lernende.Klasse.ZWEI);
        Person lernt12 = new Lernende("Josiah Maier",Lernende.Klasse.ZWEI);
        Person lernt13 = new Lernende("Keith Ebner",Lernende.Klasse.VIER);
        Person lernt14 = new Lernende("Filiz Winkler",Lernende.Klasse.EINS);
        Person lernt15 = new Lernende("Imilian Lehner",Lernende.Klasse.DREI);
        Person lernt16 = new Lernende("Fernando Müller",Lernende.Klasse.DREI);
        Person lernt17 = new Lernende("Emirhan Maier",Lernende.Klasse.VIER);
        Person lernt18 = new Lernende("Dick Huber",Lernende.Klasse.EINS);
        Person lernt19 = new Lernende("Anil Schuster-Walter",Lernende.Klasse.ZWEI);
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
            for (int fifteen = 0;fifteen<=22;fifteen++){
                for (int index = 0; index <6 ; index++) {

                }
            }
            borgandelsbuch.simulateDay(day);
        }
    }

    //        for (int day = 1; day <= 10; day++) {
    //            System.out.printf("Day %d begin:%n", day);
    //            for (int hour = 0; hour < 24; hour++) {
    //                for (int i = 0; i < d.length; i++) {
    //                    d[i].activity(hour);
    //                }
    //                sleep(250);
    //            }
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
