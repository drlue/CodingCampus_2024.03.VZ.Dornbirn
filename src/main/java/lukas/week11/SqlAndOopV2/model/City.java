package lukas.week11.SqlAndOopV2.model;

public class City {
    private String name;
    private Country country;
    private String province;
    private int population;
    private float longitude;
    private float latitude;


    public City(String name, Country country, String province, int population, float longitude, float latitude) {
        this.name = name;
        this.country = country;
        this.province = province;
        this.population = population;
        this.longitude = longitude;
        this.latitude = latitude;
    }
    public void printStructure(){
        System.out.printf("   |--%s (%d Einwohner)%n", name, population);
    }
}
