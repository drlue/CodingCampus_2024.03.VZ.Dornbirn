package lukas.week11.SqlAndOopV2.model;


import java.util.Vector;

public class Country {
    private String name;
    private String code;
    private String capital;
    private String province;
    private float area;
    private int population;
    private World world;

    private Vector<City> cities;

    public Country(String name, String code, String capital, String province, float area, int population) {
        this.name = name;
        this.code = code;
        this.capital = capital;
        this.province = province;
        this.area = area;
        this.population = population;
        this.world = null;
        this.cities = new Vector<>();
    }

    //---  GET / SET ----
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public float getArea() {
        return area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public String getProvince() {
        return province;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    //---  METHODS ----

    public void addCityToCities(City city) {
        if (!cities.contains(city))
            cities.add(city);
    }



    //---  PRINT ----
    public void printStructure() {
        System.out.printf("|--%s (%d Einwohner)%n", name, population);
        if (!cities.isEmpty()) {
            for (City city : cities) {
                city.printStructure();
            }
        }
    }


}
