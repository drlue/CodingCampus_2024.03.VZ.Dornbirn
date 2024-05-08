package lukas.week08.Museum.Art;

public abstract class Artwork {

    private String name;
    private int value;
    private int year;

    public Artwork(String name, int value, int year){

        this.name = name;
        this.value = value;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%s (%s - %d, %d EUR", name,getClass().getSimpleName(), year, value);
    }
}
