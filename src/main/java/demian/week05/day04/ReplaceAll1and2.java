package demian.week05.day04;

public class ReplaceAll1and2 {

    public static void main(String[] args) {

        //UEBUNG: Ersetze im String
        //
        //"Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!"
        //
        //wird durch war und ist und gib ihn aus.


        String Text = "Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!";
        System.out.println(Text);
        System.out.println("Wird ersetzen durch: war und ist");
        Text = Text.replace("wird", "war und ist");

        System.out.println(Text);

        // UEBUNG 2: Lösche im String
        //
        //"Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!"
        //
        //Jeden Kleinbuchstaben und gib ihn aus
        //Jeden Großbuchstaben und gib ihn aus
        //Jedes Leerzeichen und gib ihn aus
        //Jedes Ausrufezeichen ! und gib ihn aus

        System.out.println("Alle Kleinbuchstaben löschen:");
        String KeineKleinbuchstaben = Text.replaceAll("[a-z]","");
        System.out.println(KeineKleinbuchstaben);

        System.out.println("Alle Großbuchstaben löschen:");
        String KeineGrossbuchstaben = Text.replaceAll("[A-Z]", "");
        System.out.println(KeineGrossbuchstaben);

        System.out.println("Alle Leerzeichen löschen:");
        String KeineLeerzeichen = Text.replaceAll("[ ]", "");
        System.out.println(KeineLeerzeichen);

        System.out.println("Alle Ausrufezeichen löschen:");
        String KeineAusrufezeichen = Text.replaceAll("[!]", "");
        System.out.println(KeineAusrufezeichen);
    }
}
