package christian.week07.carSimulationRemastered;

public class Car {
    private String hersteller;
    private String modell;
    private double weight;
    private Engine engine;
    private Tank tank;

    public Car(String hersteller, String modell, double weight, Engine engine, Tank tank) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.weight = weight;
        this.engine = engine;
        this.tank = tank;
    }

    //==================================================================================================================get
    //==================================================================================================================set
    //==================================================================================================================alter
    //==================================================================================================================simulate
    public double FuelUsagePerKilometer() {
        return (weight * 0.004 + engine.getkW() * 0.02) / 100;
    }
}
