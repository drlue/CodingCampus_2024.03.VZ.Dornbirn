package katherina.week7.day01.zoo;


public class Pfleger {
    private String name;
    private String liebling;
    private Zoo zoo;
    private Gehege gehege;

    public Pfleger(String name, String liebling) {
        this.name = name;
        this.liebling = liebling;
    }


    public void setZooIntern(Zoo zoo) {
        this.zoo = zoo;
    }

    public Gehege getGehege() {
        return gehege;
    }

    public void setGehege(Gehege gehege) {
        if (gehege != null) {
            gehege.addPersonal(this);
        } else if (this.gehege != null) {
            this.gehege.removePersonal(null);
        }
    }

    @Override
    public String toString() {
        return "│            ├── zuständig: " + name + "\n";
    }


}

