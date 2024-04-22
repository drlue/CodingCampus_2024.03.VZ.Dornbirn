package samet.week07.ZooSimulation;

public class Food {

    private String feed;
    private String units;
    private float foodprice;


    public Food(String feed, String units, float foodprice) {
        this.feed = feed;
        this.units = units;
        this.foodprice = foodprice;
    }

    public String getFeed() {
        return feed;
    }

    public float getFoodprice() {
        return foodprice;
    }

}
