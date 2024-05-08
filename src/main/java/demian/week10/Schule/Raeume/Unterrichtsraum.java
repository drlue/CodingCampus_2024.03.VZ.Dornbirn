package demian.week10.Schule.Raeume;

public class Unterrichtsraum extends Raeume{
    private String Fachgebiet;

    public Unterrichtsraum(String Fachgebiet) {
        this.Fachgebiet = Fachgebiet;
    }

    @Override
    public String toString() {
        return  Fachgebiet;
    }
}
