package lukas.week08.Museum.Art;

import lukas.week08.Museum.Art.Artwork;

public class Painting extends Artwork {

    private String artist;


    public Painting(String name, String artist, int value, int year) {
        super(name, value, year);
        this.artist = artist;
    }
}
