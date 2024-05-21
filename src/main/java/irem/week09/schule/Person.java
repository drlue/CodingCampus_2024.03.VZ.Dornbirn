package irem.week09.schule;


abstract class Person {

    protected String name;
    private Raum raum;

    public Person(String name) {

        this.name = name;

    }
    public String getName() {
        return name;
    }

    public void setRaum(Raum raum) {
        if (raum.hatZugriff(this)) {
            this.raum = raum;
            System.out.println(name + " hat Zugang zu " + raum.getName());
        } else {
            System.out.println(name + " hat keinen Zugang zu " + raum.getName());
        }
    }
}