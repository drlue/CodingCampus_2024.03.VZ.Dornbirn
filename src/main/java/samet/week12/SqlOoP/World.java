package samet.week12.SqlOoP;


import java.util.ArrayList;
import java.util.List;

public class World {


    private List<Country> countryList;


    public World() {
        this.countryList = new ArrayList<>();
    }

    public void addCountry(Country country) {
        if (!countryList.contains(country)) {
            countryList.add(country);
        }
        country.setWorld(this);
    }

    public void printStructure() {
        System.out.println("World and everything else");
        for (Country c : countryList) {
            c.printStructure();
        }
    }
}
