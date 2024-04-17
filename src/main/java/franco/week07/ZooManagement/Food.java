package franco.week07.ZooManagement;

import java.util.HashMap;

public class Food {
    private String foodName;
    private double unit;
    private double unitPrice;

    public Food(String foodName,double unitPrice){

        this.foodName=foodName;
        this.unitPrice= unitPrice;
    }


    public String getFoodName() {
        return foodName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
