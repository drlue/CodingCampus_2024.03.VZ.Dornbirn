package gyula.week11.sqlOOP;

public class City {
    private String name;
    private Country country;
    private int population;

    public City(String name){
        this(name, 0);
    }

    public City(String name, int population){
        this.name = name;
        this.population = population;
        country = null;
    }

    public String getName() {
        return name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setCountry(Country country){
        this.country = country;
    }
}
