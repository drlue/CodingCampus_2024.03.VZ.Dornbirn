package ardijanla.week12.models;

import java.util.ArrayList;
import java.util.List;

public class World {

    private List<Country> countries;


    public World() {
        countries = new ArrayList();
    }




    public void addCountry(Country country) {

        countries.add(country);
    }


    public void printStructure() {

        for (Country x : countries) {
            x.printStructure();

            for (City y : x.cities){
                x.cities.add(y);
            }
        }
    }


}
