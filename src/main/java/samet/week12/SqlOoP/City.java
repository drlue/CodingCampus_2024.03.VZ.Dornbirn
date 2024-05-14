package samet.week12.SqlOoP;

public class City {

    private String cityName;
    // private String countryname;
    //   private String province;
    private int population;
    private Country country;


    public City() {

        cityName = null;
        //      countryname = null;
        //      province = null;
        population = 0;
        country = null;


    }


    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setCountry(Country country) {
        this.country = country;
    }



    public void printStructure() {
        System.out.printf("|------City: %-35s %-8s %n", cityName, population);

    }
}




