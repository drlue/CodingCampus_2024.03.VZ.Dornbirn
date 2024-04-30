package christian.week08.SchuleSimulationV1;

import christian.week08.SchuleSimulationV1.personV1.Direktor;
import christian.week08.SchuleSimulationV1.personV1.Lehrer;
import christian.week08.SchuleSimulationV1.personV1.Schueler;
import christian.week08.SchuleSimulationV1.personV1.Schulklasse;
import christian.week08.SchuleSimulationV1.raeume.KlassenZimmer;

import java.util.Random;

public class Main {
    public static Random rnd = new Random();

    public static void main(String[] args) {
        Direktor direktor = new Direktor("Guntram Zoppel");
        Schule schule1 = new Schule("Baumschule", direktor);

        KlassenZimmer raum1 = new KlassenZimmer("Raum101");
        KlassenZimmer raum2 = new KlassenZimmer("Raum102");
        KlassenZimmer raum3 = new KlassenZimmer("Raum103");

        Schulklasse klasse1A = new Schulklasse("1A");
        Schulklasse klasse1B = new Schulklasse("1B");
        Schulklasse klasse2A = new Schulklasse("2A");
        Schulklasse klasse2B = new Schulklasse("2B");

        Lehrer matheLehrer = new Lehrer("Paul", Lehrer.Fach.MATHE, Lehrer.Fach.GESCHICHTE);
        Lehrer deutschLehrer = new Lehrer("Hans", Lehrer.Fach.DEUTSCH, Lehrer.Fach.SPORT);
        Lehrer englischLehrer = new Lehrer("Jordan", Lehrer.Fach.ENGLISCH, Lehrer.Fach.MATHE);
        Lehrer lateinLehrer = new Lehrer("Julius", Lehrer.Fach.LATEIN, Lehrer.Fach.WERKEN);
        Lehrer geschichteLehrer = new Lehrer("Franz", Lehrer.Fach.GESCHICHTE, Lehrer.Fach.WERKEN);


        Schueler schueler1 = new Schueler("Jörg", klasse1A);
        Schueler schueler2 = new Schueler("Aileen", klasse1A);
        Schueler schueler3 = new Schueler("Mehmet", klasse1A);
        Schueler schueler4 = new Schueler("Lukas", klasse1A);
        Schueler schueler5 = new Schueler("Ahmet", klasse1A);
        Schueler schueler6 = new Schueler("Klaus", klasse2A);
        Schueler schueler7 = new Schueler("August", klasse2A);
        Schueler schueler8 = new Schueler("Jakob", klasse2A);
        Schueler schueler9 = new Schueler("Jonas", klasse2A);
        Schueler schueler10 = new Schueler("Leonie", klasse2A);
        Schueler schueler11 = new Schueler("Alex", klasse1B);
        Schueler schueler12 = new Schueler("Elias", klasse1B);
        Schueler schueler13 = new Schueler("Kathi", klasse1B);
        Schueler schueler14 = new Schueler("Julia", klasse1B);
        Schueler schueler15 = new Schueler("Janek", klasse1B);
        Schueler schueler16 = new Schueler("Alina", klasse2B);
        Schueler schueler17 = new Schueler("Herbert", klasse2B);
        Schueler schueler18 = new Schueler("Hubert", klasse2B);
        Schueler schueler19 = new Schueler("Stefan", klasse2B);
        Schueler schueler20 = new Schueler("Marnia", klasse2B);

        klasse1A.addSchuelerToKlasse(schueler1);
        klasse1A.addSchuelerToKlasse(schueler2);
        klasse1A.addSchuelerToKlasse(schueler3);
        klasse1A.addSchuelerToKlasse(schueler4);
        klasse1A.addSchuelerToKlasse(schueler5);
        klasse2A.addSchuelerToKlasse(schueler6);
        klasse2A.addSchuelerToKlasse(schueler7);
        klasse2A.addSchuelerToKlasse(schueler8);
        klasse2A.addSchuelerToKlasse(schueler9);
        klasse2A.addSchuelerToKlasse(schueler10);
        klasse1B.addSchuelerToKlasse(schueler11);
        klasse1B.addSchuelerToKlasse(schueler12);
        klasse1B.addSchuelerToKlasse(schueler13);
        klasse1B.addSchuelerToKlasse(schueler14);
        klasse1B.addSchuelerToKlasse(schueler15);
        klasse2B.addSchuelerToKlasse(schueler16);
        klasse2B.addSchuelerToKlasse(schueler17);
        klasse2B.addSchuelerToKlasse(schueler18);
        klasse2B.addSchuelerToKlasse(schueler19);
        klasse2B.addSchuelerToKlasse(schueler20);

        raum1.addToLehrerPlan(matheLehrer);
        raum1.addToLehrerPlan(deutschLehrer);
        raum1.addToLehrerPlan(geschichteLehrer);
        raum1.addToLehrerPlan(englischLehrer);
        raum1.addToLehrerPlan(lateinLehrer);

        raum2.addToLehrerPlan(deutschLehrer);
        raum2.addToLehrerPlan(geschichteLehrer);
        raum2.addToLehrerPlan(englischLehrer);
        raum2.addToLehrerPlan(lateinLehrer);
        raum2.addToLehrerPlan(matheLehrer);

        raum3.addToLehrerPlan(geschichteLehrer);
        raum3.addToLehrerPlan(englischLehrer);
        raum3.addToLehrerPlan(lateinLehrer);
        raum3.addToLehrerPlan(matheLehrer);
        raum3.addToLehrerPlan(deutschLehrer);

        raum1.addToklassenPlan(klasse1A);
        raum1.addToklassenPlan(klasse2A);
        raum1.addToklassenPlan(klasse1B);
        raum1.addToklassenPlan(klasse2B);
        raum1.addToklassenPlan(klasse1A);

        raum2.addToklassenPlan(klasse2A);
        raum2.addToklassenPlan(klasse1A);
        raum2.addToklassenPlan(klasse1A);
        raum2.addToklassenPlan(klasse1B);
        raum2.addToklassenPlan(klasse2B);

        raum3.addToklassenPlan(klasse1B);
        raum3.addToklassenPlan(klasse2B);
        raum3.addToklassenPlan(klasse2A);
        raum3.addToklassenPlan(klasse1A);
        raum3.addToklassenPlan(klasse2A);

        schule1.addRaumToList(raum1);
        schule1.addRaumToList(raum2);
        schule1.addRaumToList(raum3);

        schule1.addKlasseToList(klasse1A);
        schule1.addKlasseToList(klasse2A);
        schule1.addKlasseToList(klasse1B);
        schule1.addKlasseToList(klasse2B);

        for (int day = 0; day < 30; day++) {
            System.out.println("Tag " + day + " beginnt!");
            for (int hour = 0; hour < 23; hour++) {
                for (int minute = 0; minute < 60; minute++) {
                    schule1.simulateSchool(hour, minute);
                }
            }
            System.out.println("Tag " + day + " endet!");
        }
    }
}
