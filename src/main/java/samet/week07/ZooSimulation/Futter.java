package samet.week07.ZooSimulation;

public class Futter {

    private String feed;
    private int units;
    private float price;

    public Futter (String feed, int units, float price){
        this.feed = feed;
        this.units = units;
        this.price = price;
    }

    public String getFeed(){
        return feed;
    }
    public float getPrice(){
        return price;

    }

}
