package demian.week09.museum;

public abstract class AbstrakteKlasse {

    private String kuenstler;

    public AbstrakteKlasse(String kuenstler) {
        this.kuenstler = kuenstler;
    }

    public abstract void Blabbla();

    public String getKuenstler() {
        return kuenstler;
    }
}
