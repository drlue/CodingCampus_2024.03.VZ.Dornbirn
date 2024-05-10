package lukas.week10.SqlAndOop;

public class City {

    private String name;
    private String country;
    private String province;
    private int population;
    private float longitude;
    private float latitude;

    public City(String name, String country, String province, int population, float longitude, float latitude) {
        this.name = name;
        this.country = country;
        this.province = province;
        this.population = population;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
