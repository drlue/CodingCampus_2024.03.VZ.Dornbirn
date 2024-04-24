package christian.week07.carSimulationRemastered;

public class Car {
    private String hersteller;
    private String modell;
    private Engine engine;
    private Tank tank;

    public Car(String hersteller, String modell, Engine engine, Tank tank) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.engine = engine;
        this.tank = tank;
    }
    //==================================================================================================================get
    //==================================================================================================================set
    //==================================================================================================================alter
    //==================================================================================================================simulate
}
