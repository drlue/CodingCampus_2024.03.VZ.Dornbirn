package christian.week09.sqlManagment.SqlOOP.model;

import ardijanla.ConsoleColors;

import java.util.ArrayList;

public class Continent {
    private String name;
    private ArrayList<Country> listOfCountries;
    private float area;

    public Continent(String name, float area) {
        this.name = name;
        this.area = area;
        listOfCountries = new ArrayList<>();

    }


    //================================================================================================get=========

    public String getName() {
        return name;
    }

    //================================================================================================set=========
    //================================================================================================create=========
    public void addCountryToList(Country country){
        if(!listOfCountries.contains(country)){
            listOfCountries.add(country);
        }
    }
    //================================================================================================alter=========
    //================================================================================================remove=========
    //================================================================================================SQL=========
    //================================================================================================print=========

    public void printStructure(){
        System.out.printf("%sContinent:%20s (%.0f km² area)%n%s", ConsoleColors.RED,name,area,ConsoleColors.RESET);
        for (Country country:listOfCountries) {
            country.printStructure();

        }
        System.out.println();
    }
}
