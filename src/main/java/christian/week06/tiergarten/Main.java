package christian.week06.tiergarten;

import christian.week06.tiergarten.hilfsKlassen.Futter;
import christian.week06.tiergarten.hilfsKlassen.Statistik;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean hauptMenue = true;
    public static boolean simLoop = false;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // Futterarten in futterListe

        Futter fruechte =  new Futter("Fruechte", "kg",1.5f);
        Futter heu = new Futter("heu","Heuballen",10.50f);
        Futter fleisch = new Futter("Fleisch", "kg", 8.5f);
        List<Futter>futterListe =  new ArrayList<>();
        futterListe.add(fruechte);
        futterListe.add(heu);
        futterListe.add(fleisch);

        // add Affenstall

        Gehege affenstall = new Gehege("Affengehege");
        Tier kapuzinerAffe1 = new Tier("Herbert","Kapuzineraffe",fruechte,1,20);
        Tier kapuzinerAffe2 = new Tier("Edeltraud", "Kapuzineraffe", fruechte,1,30);
        affenstall.tierListe.add(kapuzinerAffe1);
        affenstall.tierListe.add(kapuzinerAffe2);


        // add Elefantengehege

        Gehege elefantenGehege = new Gehege("Elefantengehege");
        Tier Elefant1 = new Tier("Alfred", "Elefant", heu,1.2f,240);
        Tier Elefant2 =  new Tier("Manni","Elefant", heu , 1.4f,240);
        elefantenGehege.tierListe.add(Elefant1);
        elefantenGehege.tierListe.add(Elefant2);


        List<Tier> tierListe = new ArrayList<>();
        tierListe.addAll(elefantenGehege.tierListe);
        tierListe.addAll((affenstall.tierListe));

        Zoo zoo = new Zoo("happyAnimalZoo",2024,20000);
        zoo.gehegeListe.add(elefantenGehege);
        zoo.gehegeListe.add(affenstall);
        Statistik statistik = new Statistik(futterListe,tierListe, zoo.getVermoegen());


        System.out.println("Herzlich Willkommen im Zoo am " + LocalDate.now());
        System.out.printf("Die derzeitigen Kosten des Zoo belaufen sich auf:\n" +
                "FutterKosten: %35f" +
                "\nPersonalKosten: %33f" +
                "\nInstandhaltungsKosten: %26f" +
                "\nVermoegen der Firma: %28f" +
                "\nTage bis zum Bankrott: %26f" +
                "\n"
                ,statistik.getFutterKosten()
                ,statistik.getPersonalkosten()
                ,statistik.getGehegeInstandhaltung()
                ,statistik.getKapital()
                ,statistik.getDaysUntilBroke());

        while(hauptMenue) {
            System.out.println("Informationen zu den Gehegen:\n" + zoo.toString());
            System.out.println("Möchten Sie die Simulation starten? Y/N eingeben!!");
            if (scanner.next().equalsIgnoreCase("y")){
                simLoop = true;
            } else if (scanner.next().equalsIgnoreCase("n")) {
                hauptMenue = false;
                break;
            }else {
                System.out.println("Ungültige Eingabe!");
                scanner.reset();

        }
            while(simLoop){
                System.out.println("funktioniert");
            }
        }




    }

}
