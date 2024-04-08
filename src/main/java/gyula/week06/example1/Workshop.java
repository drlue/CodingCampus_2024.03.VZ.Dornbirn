package gyula.week06.example1;

public class Workshop {
    private String name;
    private int countHours;
    private int price;

    public Workshop(String name){
        this(name, 500, 8250);
    }

    public Workshop(String name, int countHours, int price){
        this.name = name;
        this.countHours = countHours;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isBlank()){
            this.name = name;
        } else {
            System.out.println("\"" + name + "\" is not a valid name.");
        }
    }

    @Override
    public String toString() {
        return "Workshop: " + name;
    }
}
