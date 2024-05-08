package gyula.week11.sqlOOP;

import java.util.Vector;

public class Country {
    private String name;
    private String code;
    private City capital;
    private int population;

    private Vector<City> cities;

    public Country(String name, String code, String nameOfCapital, int population){
        this.name = name;
        this.code = code;
        this.population = population;
        cities = new Vector<>();
        capital = searchAndCreateCityByName(nameOfCapital);
    }

    public City searchAndCreateCityByName(String name){
        for (City c: cities){
            if (c.getName().equals(name)){
                return c;
            }
        }
        City c = new City(name);
        c.setCountry(this);
        cities.add(c);
        return c;
    }


}
