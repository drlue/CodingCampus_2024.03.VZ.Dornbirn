package lukas.week08.Museum.Art;

import lukas.week08.Museum.Art.Artwork;

public class Drawing extends Artwork {

    private String artist;

    public Drawing(String name, String artist, int value, int year) {
        super(name, value, year);
        this.artist = artist;
    }
}
