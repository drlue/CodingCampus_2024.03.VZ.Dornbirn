package christian.week06.tiergarten;

import christian.week06.tiergarten.hilfsKlassen.Futter;

public class test {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("happyAnimalZoo",2024);
        // Futterarten
        Futter fruechte =  new Futter("Fruechte", "kg",1.5f);
        Futter heu = new Futter("Heu","Heuballen",10.50f);
        Futter fleisch = new Futter("Fleisch", "kg", 8.5f);

        // add Affenstall
        Gehege affenstall = new Gehege("Affengehege");
        Tier kapuzinerAffe1 = new Tier("Herbert","Kapuzineraffe",fruechte,1);
        Tier kapuzinerAffe2 = new Tier("Edeltraud", "Kapuzineraffe", fruechte,1);
        affenstall.tierListe.add(kapuzinerAffe1);
        affenstall.tierListe.add(kapuzinerAffe2);
        zoo.gehegeListe.add(affenstall);

        // add Elefantengehege
        Gehege elefantenGehege = new Gehege("Elefantengehege");
        Tier Elefant1 = new Tier("Alfred", "Elefant", heu,1.2f);
        Tier Elefant2 =  new Tier("Manni","Elefant", heu , 1.4f);
        elefantenGehege.tierListe.add(Elefant1);
        elefantenGehege.tierListe.add(Elefant1);
        zoo.gehegeListe.add(elefantenGehege);




       System.out.println(zoo.toString());

    }
}
