package franco.week11.OOP_JDBC;

import java.util.ArrayList;

public class Country {
    private String name;
    private String code;
    private String capital;
    private int population;
    private ArrayList<City> citiesArrayList;

    public Country() {
        name = null;
        code = null;
        capital = null;
        population = 0;
        citiesArrayList = new ArrayList<>();
    }

    //==============================Getters and Setters==================================
    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode(String cde) {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCapital(String capital) {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public ArrayList<City> getCitiesArrayList() {
        return citiesArrayList;
    }

    public void setCitiesArrayList(ArrayList<City> citiesArrayList) {
        this.citiesArrayList = citiesArrayList;
    }

    //=====================Method==================
    public void printStructure() {
        System.out.printf("Country: %-35s %-8s %-25s %15d %n", name, code, capital, population);

    }
}
