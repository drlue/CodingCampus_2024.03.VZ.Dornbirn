package gyula.week12.model;

public class Continent {
    private String name;
    private float area;

    private World world;

    public Continent(){
        name = null;
        area = 0;
        world = null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public void printStructure(){
        System.out.printf("   Continent: %s (%.0f km2)%n", name, area);
    }
}
