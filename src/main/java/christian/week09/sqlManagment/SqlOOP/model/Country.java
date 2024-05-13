package christian.week09.sqlManagment.SqlOOP.model;

import java.util.ArrayList;

public class Country {
    private String name;
    private int population;
    private String code;
    private static int printcounter = 0;

    private ArrayList<City> listOfCities;

    public Country(String name, int population, String code) {
        this.name = name;
        this.population = population;
        this.code = code;
        listOfCities = new ArrayList<>();
    }


    //================================================================================================get=========
    //================================================================================================set=========
    //================================================================================================create=========
    //================================================================================================alter=========
    //================================================================================================remove=========
    //================================================================================================SQL=========
    //================================================================================================print=========
    public void printStructure() {
        printcounter++;
        int counterTimesTen = 9 * printcounter;
        if (printcounter == 3) {
            printcounter = 0;
        } else if (printcounter > 1) {
            System.out.printf("%" +counterTimesTen+ "s (%d pop),%n", name,population);
        } else {
            System.out.printf("%" +counterTimesTen+ "s (%d pop),", name,population);
        }


        for (City city : listOfCities) {

        }
    }
}
