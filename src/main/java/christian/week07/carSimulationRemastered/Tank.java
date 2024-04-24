package christian.week07.carSimulationRemastered;

public class Tank {
    private double tankLevel;
    private double tankMax;

    public Tank(double tankMax){
        this.tankMax = tankMax;
        this.tankLevel = 5;
    }

    //==================================================================================================================get

    public double getTankLevel() {
        return tankLevel;
    }

    //==================================================================================================================set
    //==================================================================================================================alter
    //==================================================================================================================simulate
    public void refillTank(GasStation gasStation, Car car, int kmDriven){
        double fuel = tankMax-tankLevel;
        tankLevel=tankMax;
        System.out.printf("After %d kilometers, %s stops at %s to refuel with %.2f liter of gasoline.%n",kmDriven,car.getHersteller()+" "+car.getModell(),gasStation.getName(),fuel);
    }
    public void burnFuel(double fuel){
        tankLevel-=fuel;
    }
}
