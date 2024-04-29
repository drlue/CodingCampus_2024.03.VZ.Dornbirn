package demian.week09.museum;

public class ErbendeKlasse extends AbstrakteKlasse {

    public ErbendeKlasse(String kuenstler) {
        super(kuenstler);
    }

    @Override
    public void Blabbla() {

    }

    @Override
    public String toString() {
        return "Statue{}" + super.getKuenstler();
    }
}
