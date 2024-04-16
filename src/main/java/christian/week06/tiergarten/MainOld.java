package christian.week06.tiergarten;

import christian.week06.tiergarten.hilfsKlassen.FutterOld;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainOld {


    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        boolean hauptMenue = true;
        boolean simLoop = false;

        // Futterarten in futterListe

        FutterOld fruechte =  new FutterOld("Fruechte", "kg",1.5f);
        FutterOld heu = new FutterOld("heu","Heuballen",10.50f);
        FutterOld fleisch = new FutterOld("Fleisch", "kg", 8.5f);
        List<FutterOld> futterOldListe =  new ArrayList<>();
        futterOldListe.add(fruechte);
        futterOldListe.add(heu);
        futterOldListe.add(fleisch);

        // add Affenstall

        GehegeOld affenstall = new GehegeOld("Affengehege");
        TierOld kapuzinerAffe1 = new TierOld("Herbert","Kapuzineraffe",fruechte,1,20);
        TierOld kapuzinerAffe2 = new TierOld("Edeltraud", "Kapuzineraffe", fruechte,1,30);



        // add Elefantengehege

        GehegeOld elefantenGehegeOld = new GehegeOld("Elefantengehege");
        TierOld Elefant1 = new TierOld("Alfred", "Elefant", heu,1.2f,240);
        TierOld Elefant2 =  new TierOld("Manni","Elefant", heu , 1.4f,240);




        ZooOld zooOld = new ZooOld("happyAnimalZoo",2024,20000);




        while(hauptMenue) {
            System.out.println("Informationen zu den Gehegen:\n" + zooOld.toString());
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
