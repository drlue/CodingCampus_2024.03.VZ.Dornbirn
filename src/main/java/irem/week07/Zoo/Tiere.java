package irem.week07.Zoo;

public class Tiere {

    private String name;
    private String gattung;

    public Tiere(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;

    }
    public String toString() {
        return name + " ," + gattung;
    }
}

