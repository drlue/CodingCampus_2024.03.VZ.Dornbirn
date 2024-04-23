package samet.week07.ZooSimulation;

public class Food {

    private String foodName;
    private String units;
    private float price;


    public Food(String foodName, String units, float price) {
        this.foodName = foodName;
        this.units = units;
        this.price = price;
    }

    public String getFoodName() {
        return foodName;
    }

    public float getPrice() {
        return price;
    }

}
