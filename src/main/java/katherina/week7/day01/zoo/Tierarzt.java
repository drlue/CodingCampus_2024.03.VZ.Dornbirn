package katherina.week7.day01.zoo;


public class Tierarzt {
    private String name;

    public Tierarzt(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setZooIntern(Zoo zoo) {
    }


    public void heal(Tier tier){
        tier.geheilt(this);
    }


    public void printStructure() {
        System.out.printf("│  ├── Tier-Doc: %s%n", name);
    }


}

