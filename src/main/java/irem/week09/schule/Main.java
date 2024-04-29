package irem.week09.schule;

public class Main {
    public static void main(String[] args) {
        Raum klassenraum = new Raum(RaumTyp.KLASSENRAUM, "Raum 101");
        Raum lehrerzimmer = new Raum(RaumTyp.LEHRERZIMMER, "Lehrerzimmer");
        Raum direktorzimmer = new Raum(RaumTyp.DIREKTORZIMMER, "Direktorenzimmer");
        Raum direktorenzimmer = new Raum(RaumTyp.DIREKTORZIMMER, "Direktorenzimmer");



        Schueler schueler = new Schueler("Karamel");
        Lehrer lehrer = new Lehrer("Herr Görkem");
        Schuldirektor direktor = new Schuldirektor("Frau Sinem", direktorenzimmer);


        schueler.setRaum(lehrerzimmer);
        schueler.setRaum(klassenraum);
        lehrer.setRaum(lehrerzimmer);
        direktor.setRaum(direktorzimmer);

        Stundenplan stundenplan = new Stundenplan(lehrer, "Mathematik", klassenraum);
        stundenplan.druckeDetails();
        SchuleSimulation simulation = new SchuleSimulation();
        simulation.starteTagesablauf();

    }
}
