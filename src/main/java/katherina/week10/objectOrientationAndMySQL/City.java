package katherina.week10.objectOrientationAndMySQL;

public class City {
    private String name;
    private Country country;
    private String province;
    private int population;

    public City(String name, String province, int population){
        this.name=name;
        this.country=country;
        this.province=province;
        this.population=population;
    }

    public void printStructure() {
        System.out.printf("│               ├── %s, %s, %d %n", name, province,population);
    }

    public void printObject() {
        System.out.printf("City %s = new City(\"%s\",\"%s\", %d);%n", name.toLowerCase().replaceAll("", "x"), name, province,population);
    }
}
