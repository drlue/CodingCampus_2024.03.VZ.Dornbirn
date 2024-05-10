package christian.week09.sqlOOP;

import java.util.ArrayList;

public class Country {
    private String name;
    private String code;
    private int population;
    private ArrayList<City>listOfCities;

    public Country(String name, String code, int population){
        this.name = name;
        this.code = code;
        this.population = population;
        listOfCities = new ArrayList<>();
    }
    //======================================================================================================get=========
    //======================================================================================================set=========
    //======================================================================================================add/remove==

    public void addCityToList(City city){
        if(!listOfCities.contains(city)){
            listOfCities.add(city);
        }
    }
    //======================================================================================================alter=======
    //======================================================================================================print=======
    public void printCountry(){
        System.out.printf("Country: %s",name);
        for(City city : listOfCities){
            city.printCity();
        }
    }
}
