package christian.week06.zooEnglish;

public class Food {

    private String name;
    private String physicalUnit;
    private float pricePerUnit;

    public Food(String name, String physicalUnit,float pricePerUnit){
        this.name = name;
        this.physicalUnit = physicalUnit;
        this.pricePerUnit = pricePerUnit;
    }

    //====================getter and setter====================================

    public String getName() {
        return name;
    }

    public float getPricePerUnit() {
        return pricePerUnit;
    }

    public String getPhysicalUnit() {
        return physicalUnit;
    }
    //==========================================================================
}
