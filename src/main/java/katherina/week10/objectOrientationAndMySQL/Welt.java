package katherina.week10.objectOrientationAndMySQL;

import java.util.Vector;

public class Welt {
    private String name;
    private Vector<Country> countrylist;

    public Welt(String name) {
        this.name = name;
        countrylist = new Vector<>();
    }

      public void addCountry(Country country) {
            if (!countrylist.contains(country)) {
                countrylist.add(country);
            }
        }



    public void printStructure() {
        System.out.printf("├── %s %n", name);
        for (Country country : countrylist) {
            country.printObject();
            country.printStructure();
        }

    }

}
