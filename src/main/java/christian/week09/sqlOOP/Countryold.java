package christian.week09.sqlOOP;

import java.util.ArrayList;

public class Countryold {
    private String name;
    private String code;
    private int population;
    private ArrayList<Cityold>listOfCities;

    public Countryold(String name, String code, int population){
        this.name = name;
        this.code = code;
        this.population = population;
        listOfCities = new ArrayList<>();
    }
    //======================================================================================================get=========
    //======================================================================================================set=========
    //======================================================================================================add/remove==

    public void addCityToList(Cityold cityold){
        if(!listOfCities.contains(cityold)){
            listOfCities.add(cityold);
        }
    }
    //======================================================================================================alter=======
    //======================================================================================================print=======
    public void printCountry(){
        System.out.printf("Country: %s",name);
        for(Cityold cityold : listOfCities){
            cityold.printCity();
        }
    }
}
