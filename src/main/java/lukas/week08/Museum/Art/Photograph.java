package lukas.week08.Museum.Art;

public class Photograph extends Artwork{

    private String artist;
    private Type type;
    public enum Type {BW, COLORED};
    public Photograph(String name, String artist, int value, int year, Type type) {
        super(name, value, year);
        this.artist = artist;
        this.type = type;
    }
}
