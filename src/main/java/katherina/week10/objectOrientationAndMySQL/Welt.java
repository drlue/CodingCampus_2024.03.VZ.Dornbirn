package katherina.week10.objectOrientationAndMySQL;

import java.util.Vector;

public class Welt {
    private String name;
    private Vector<Country> countrylist;
    private Vector<City> citylist;

    public Welt(String name) {
        this.name = name;
        countrylist = new Vector<>();
        citylist = new Vector<>();
    }

    public void printStructure() {
        System.out.printf("├── %s %n", name);
        for (Country country : countrylist) {
            for (City city : citylist) {
                city.printStructure();
            }
            country.printStructure();
        }
    }
}
