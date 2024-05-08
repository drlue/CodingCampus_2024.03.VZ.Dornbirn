package katherina.week10.objectOrientationAndMySQL;

import java.util.Vector;

public class Country {
    private String name;
    private String code;
    private City capital;
    private float area;
    private int population;

    private Vector<City> cities;

    public Country(String name, String code, City capital, float area, int population) {
        this.name = name;
        this.code = code;
        this.capital = capital;
        this.area = area;
        this.population = population;
        cities = new Vector<>();
    }

    public void printStructure() {
        System.out.printf("│        ├── %s, %s, %s, %f, %d %n", name, code, capital, area, population);
    }

    public void printObject() {
        System.out.printf("Country %s = new country(\"%s\",\"%s\", %d);%n", code.toLowerCase(), name, code, population);
    }

}