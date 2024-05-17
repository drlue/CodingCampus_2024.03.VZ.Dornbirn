package ardijanla.week12.models;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;
    private String code;
    private String capital;
    private String province;
    private float area;
    private int population;
    List<City> cities;

    public Country(String name, String code, String capital, String province, float area, int population) {
        this.name = name;
        this.code = code;
        this.capital = capital;
        this.province = province;
        this.area = area;
        this.population = population;
        this.cities = new ArrayList<>();
    }


    public void printStructure() {
        System.out.printf(" %s %s %s %s %s %s%n", name, code, capital, province, area, population);
    }

    public void addCity(City city){
        cities.add(city);
    }


}
