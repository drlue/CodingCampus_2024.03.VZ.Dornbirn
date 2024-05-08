package katherina.week10.objectOrientationAndMySQL;

public class City {
    private String name;
    private String country;
    private String province;
    private int population;

    public City(String name, String province, int population){
        this.name=name;
        this.country=country;
        this.province=province;
        this.population=population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return province;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public void printStructure() {
        System.out.printf("│               ├── %s, %s, %d %n", name, province,population);
    }

}
