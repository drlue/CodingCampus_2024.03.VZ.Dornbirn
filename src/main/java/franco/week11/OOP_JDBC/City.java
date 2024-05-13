package franco.week11.OOP_JDBC;

public class City {
    private String name;
    private int population;

    public City(String name,int population){
        this.name=name;
        this.population=population;

    }
    public void printCity(){
        System.out.printf("|---City: %s, Pop: %d\n", name, population);
    }
}
