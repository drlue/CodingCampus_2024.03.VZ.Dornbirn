package irem.week09.schule;


class Stundenplan {
    private Lehrer lehrer;
    private String thema;
    private Raum raum;
    private int kursDauer = 25; // in Minuten
    private int pause = 15; // in Minuten

    public Stundenplan(Lehrer lehrer, String thema, Raum raum) {
        this.lehrer = lehrer;
        this.thema = thema;
        this.raum = raum;
    }

    public void druckeDetails() {
        System.out.println("Kurs: " + thema + " | Lehrer: " + lehrer.getName() + " | Raum: " + raum + " | Dauer: " + kursDauer + " Minuten | Pause: " + pause + " Minuten");
    }
}