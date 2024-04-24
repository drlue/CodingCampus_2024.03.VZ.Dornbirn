package christian.week07.carSimulationRemastered;

import ardijanla.ConsoleColors;

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

    //===================================================================================get
    public double fuelUsagePerKilometer() {
        return (weight * 0.004 + engine.getkW() * 0.02) / 100;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModell() {
        return modell;
    }

    //======================================================================================set
    //====================================================================================alter
    public int drive(int kmRest, double fuelForKm) {
        tank.burnFuel(fuelForKm);
        engine.possibleDamage();
        return --kmRest;
    }
    //==================================================================================simulate

    public void drivingSimulation(int kmRest, GasStation gasStation, Repairstation repairstation) {
        int kmDriven = 0;
        double fuelused=0;

        double fuelForKm = fuelUsagePerKilometer();
        engine.start(tank);
        while (kmRest > 0) {
            if (tank.getTankLevel()<fuelForKm){
                tank.refillTank(gasStation, this, kmDriven);
            }
            if (tank.getTankLevel() > fuelForKm && engine.getStatus() == Engine.Status.INTACTRUNNING) {
                kmRest = drive(kmRest, fuelForKm);
                kmDriven++;
                engine.incrKmCounter();
                fuelused+=fuelForKm;
            }
            if (engine.getStatus() == Engine.Status.BROKE) {
                engine.repair();
                System.out.printf("The Engine broke down  at kilometer %d and had to be repared in %s%s%s%n", kmDriven,ConsoleColors.RED, repairstation.getName(), ConsoleColors.RESET);
            }
        }
        System.out.printf("We reached our goal! We drove %d kilometers and used %.2f liters of fuel!%n", kmDriven,fuelused);

    }
}
