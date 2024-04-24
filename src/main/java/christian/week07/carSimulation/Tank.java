package christian.week07.carSimulation;

public class Tank {
    private double tankLevel;
    private double tankCapacity;

    public Tank(double tankCapacity){
        this.tankLevel=0;
        this.tankCapacity = tankCapacity;
    }
//======================================================================================================================get and set

    public double getTankLevel() {
        return tankLevel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }
    //======================================================================================================================methods

    public void setTankLevel(double tankLevel) {
        this.tankLevel += tankLevel;
    }
}
