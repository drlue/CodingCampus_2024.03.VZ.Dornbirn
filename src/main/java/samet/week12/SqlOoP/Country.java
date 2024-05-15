package samet.week12.SqlOoP;


import java.util.List;

public class Country {

    private String countryName;
    private String code;
    private String capital;
    private String province;
    private float area;
    private int population;
    private World world;
    private List<City> cityList;


    public Country(){
        countryName = null;
        code = null;
        capital = null;
        province = null;
        area = 0;
        population = 0;
        world = null;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public void addCity(City city) {
        if (!cityList.contains(city)) {
            cityList.add(city);
        }
        city.setCountry(this);
    }





    public void printStructure() {
        System.out.printf("|---Country: %-35s %-8s %-25s %-35s (%8.0f km²) %15d %n", countryName, code, capital, province, area, population);

    }

}
