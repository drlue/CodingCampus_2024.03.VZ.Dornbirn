package ardijanla.week12.models;

public class City {
    private String name;
    private String countryCode;
    private String province;
    private int population;
    private float longitude;
    private float latitude;

    public City(String name, String countryCode, String province, int population, float longitude, float latitude) {
        this.name = name;
        this.countryCode = countryCode;
        this.province = province;
        this.population = population;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public void printStructure() {
        System.out.printf(" %s %s %s %s %s %s%n", name, countryCode, province,population, longitude, latitude);
    }



}
