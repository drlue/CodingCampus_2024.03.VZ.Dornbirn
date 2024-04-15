package katherina.week7.day01.zoo;

public class Zoo {
    private String name;
    private int year;
    private Gehege gehege;

    public Zoo(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setGehege(Gehege gehege) {
        if (gehege != null) {
            if (gehege.getZoo() != null) {
                gehege.getZoo().gehege = null;
            }
            gehege.setZooIntern(this);
        }
        this.gehege = gehege;
    }

    public Gehege getGehege() {
        return gehege;
    }

    @Override
    public String toString() {
        return "├── Zoo: " + name + " gegründet " + year
        +gehege;
    }
}
