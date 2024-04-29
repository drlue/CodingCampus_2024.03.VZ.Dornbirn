package christian.week07.carSimulation;

import ardijanla.ConsoleColors;

public class Car {
    private String hersteller;
    private String modell;
    private Engine engine;
    private Tank tank;
    private double gewicht;



    public Car(String hersteller, String modell, double gewicht, Engine engine, Tank tank) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.engine = engine;
        this.tank = tank;
        this.gewicht = gewicht;

    }
    //=====================================================================================================================get========================================

    public Engine getEngine() {
        return engine;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModell() {
        return modell;
    }

    public Tank getTank() {
        return tank;
    }

    //======================================================================================================================set=====================================
    public void setEngine(Engine engine) {
        if (this.engine != engine) {
            this.engine = engine;
        } else {
            System.out.printf("This motor is already in the Car!%n");
        }
    }

    public void setTank(Tank tank) {
        if (this.tank != tank) {
            this.tank = tank;
        } else {
            System.out.printf("This tank is already in the Car!%n");
        }
    }


    //==================================================================================================================methods=======================================
    public void driveByGyula(int kilometer, Repairstation repairstation, GasStation gasStation) {
        int restKM = kilometer;
        gasStation.refillTank(this);

        engine.startMotor(tank);
        double consumePerKM = 0.0575;
        while (restKM > 0) {
            if (tank.getTankLevel() > consumePerKM){
                tank.setTankLevel(-1 * consumePerKM);
                engine.setKilometerzaehler(1);
                --restKM;
            } else {
                System.out.printf("Tank is empty after %d kilometers and has to be refilled in %s%n",kilometer - restKM, gasStation.getName());
                gasStation.refillTank(this);
            }
            if (engine.getStatus() != Engine.Status.INTACT) {
                System.out.printf("The Car %s %s has to be repaired in %s!%n", this.hersteller, this.getModell(), repairstation.getName());
                repairstation.repairCar(this);
            }
        }
        System.out.printf("Everything went fine and %s %s drove %s%d kilometers%s with %.2f liters left in the tank!%n", hersteller, modell, ConsoleColors.GREEN, kilometer, ConsoleColors.RESET,tank.getTankLevel());
    }


    public void drive(int kilometer, Repairstation repairstation, GasStation gasStation) {
        int strecke = 0;
        gasStation.refillTank(this);
        while (tank.getTankLevel() > 0 && kilometer > 0 && engine.getStatus() == Engine.Status.INTACT) {

            engine.startMotor(tank);

            switch (engine.getAntriebsart()) {
                case GAS -> tank.setTankLevel(((gewicht / engine.getkW()) / 1.1 / 100) * -1);
                case BENZIN -> tank.setTankLevel(((gewicht / engine.getkW()) / 1.2 / 100) * -1);
                case DIESEL -> tank.setTankLevel(((gewicht / engine.getkW()) / 1.3 / 100) * -1);
                case STROM -> tank.setTankLevel(((gewicht / engine.getkW()) / 1.6 / 100) * -1);
            }
            kilometer--;
            strecke++;
            engine.setKilometerzaehler(1);
            //engine.motorDamage(engine.getKilometerzaehler());
        }
        if (engine.getStatus() != Engine.Status.INTACT) {
            System.out.printf("The Car %s %s has to be repaired in %s!%n", this.hersteller, this.getModell(), repairstation.getName());
            repairstation.repairCar(this);
        } else if (tank.getTankLevel() <= 0) {
            System.out.printf("Tank is empty after %d kilometers and has to be refilled in %s%n",strecke, gasStation.getName());
            gasStation.refillTank(this);
        } else {
            if (kilometer == 0) {
                System.out.printf("Everything went fine and %s %s drove %s%d kilometers%s with %.2f liters left in the tank!%n", this.getHersteller(), this.getModell(), ConsoleColors.GREEN, strecke, ConsoleColors.RESET,tank.getTankLevel());
            } else {
                System.out.printf("%s Something else went wrong%s%n", ConsoleColors.RED, ConsoleColors.RESET);
            }
        }
        engine.stopMotor();
    }
}
