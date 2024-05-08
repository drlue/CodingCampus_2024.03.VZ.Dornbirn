package irem.week08.DolceVita;

public class RestaurantMain {
    public static void main(String[] args) {
        Hauptkellner hauptkellner = new Hauptkellner("Sinem", 1);

        Kellner kellner1 = new Kellner("Selin", 2);
        Kellner kellner2 = new Kellner("Aleyna", 3);


        hauptkellner.addKellner(kellner1);
        hauptkellner.addKellner(kellner2);

        Tisch tisch1 = new Tisch(101, 4);
        Tisch tisch2 = new Tisch(102, 2);

        tisch1.zuweisenKellner(kellner1);
        tisch2.zuweisenKellner(kellner2);

        Speise speise1 = new Speise("Schnitzel", 15.50, 8.00);
        Speise speise2 = new Speise("Pommes", 4.00, 1.50);


        kellner1.aufnehmenBestellung(tisch1);
        tisch1.rechnung.fugePostenHinzu(speise1, 2);
        tisch1.rechnung.fugePostenHinzu(speise2, 3);

        kellner1.servierenBestellung(tisch1);

        Rechnung rechnungTisch1 = kellner1.abrechnenTisch(tisch1);

        System.out.println("Gesamtumsatz von " + kellner1.name + ": " + kellner1.gesamtumsatz + " Euro");

        Kellner topKellner = hauptkellner.ermittleTopKellnerNachUmsatz();
        System.out.println("Top Kellner nach Umsatz: " + topKellner.name + " mit einem Umsatz von " + topKellner.gesamtumsatz + " Euro");

        Kellner Gaste = hauptkellner.ermittleTopKellnerNachAnzahlGaste();
        System.out.println("Top Kellner nach bedienten Gästen: " + Gaste.name + " mit " + Gaste.bedienteGäste + " Gästen");
    }
}
