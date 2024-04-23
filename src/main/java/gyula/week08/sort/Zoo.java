package gyula.week08.sort;

public class Zoo implements IObjectComp {
    private String name;
    private int established;

    public Zoo(String name, int established){
        this.name = name;
        this.established = established;
    }

    @Override
    public int compare(IObjectComp b) {
        if (b instanceof Zoo) {
            return this.established - ((Zoo) b).established;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%s (Est: %d)", name, established);
    }
}
