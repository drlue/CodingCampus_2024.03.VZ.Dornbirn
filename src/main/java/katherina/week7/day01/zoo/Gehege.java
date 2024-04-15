package katherina.week7.day01.zoo;

public class Gehege {
    private String name;
    private Zoo zoo;
    private Tier tier;

    public Gehege(String name) {
        this.name = name;
        this.zoo = null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Zoo getZoo() {
        return zoo;
    }

    void setZooIntern(Zoo zoo) {
        this.zoo = zoo;
    }

    public void setZoo(Zoo zoo) {
        if ((zoo != null) && ((zoo.getGehege() == null) || (zoo.getGehege() != null))) {
            zoo.setGehege(this);
        } else if (zoo == null && this.zoo != null) {
            this.zoo.setGehege(null);
        }
    }

    public void setTier(Tier tier) {
        if (tier != null) {
            if (tier.getGehege() != null) {
                tier.getGehege().tier = null;
            }
            tier.setGehegeIntern(this);
        }
        this.tier = tier;
    }

    public Tier getTier() {
        return tier;
    }

    @Override
    public String toString() {
        return "    ├── Gehege: " + name+"\n"
                // +tier
                ;
    }
}
