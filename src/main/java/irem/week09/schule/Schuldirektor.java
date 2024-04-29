package irem.week09.schule;

class Schuldirektor extends Person {
    private Raum direktorenzimmer;

    public Schuldirektor(String name, Raum direktorenzimmer) {
        super(name);
        this.direktorenzimmer = direktorenzimmer;
        this.setRaum(direktorenzimmer);
    }


    @Override
    public void setRaum(Raum neuerRaum) {
        if (neuerRaum.getTyp() == RaumTyp.DIREKTORZIMMER) {
            super.setRaum(neuerRaum);
        } else {
            System.out.println(name + " kann seinen Raum nicht wechseln. Direktoren bleiben im Direktorenzimmer.");
        }
    }
}