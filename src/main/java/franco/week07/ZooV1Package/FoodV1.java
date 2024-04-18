package franco.week07.ZooV1Package;

public class FoodV1 {
    private String name;
    private double pricePerUnit;
    private int unit;

    public FoodV1(String name,double pricePerUnit){
        this.name= name;
        this.pricePerUnit=pricePerUnit;

    }
    public String getName() {
        return name;
    }
}
