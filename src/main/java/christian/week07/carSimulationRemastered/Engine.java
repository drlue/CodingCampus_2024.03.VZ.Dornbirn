package christian.week07.carSimulationRemastered;

import static christian.week07.carSimulationRemastered.Main.rnd;

public class Engine {
    private double kW;
    private int kilometerCounter;

    enum DriveType {GASOLINE, DIESEL, GAS, ELECTRIC}

    private DriveType driveType;

    enum Status {BROKE, INTACTRUNNING, INTACT}

    private Status status;

    public Engine(double kW, DriveType driveType) {
        this.kW = kW;
        this.kilometerCounter = 0;
        this.driveType = driveType;
        this.status = Status.INTACT;
    }
    //==================================================================================================================get

    public double getkW() {
        return kW;
    }

    public Status getStatus() {
        return status;
    }

    //=======================================================================set
    //===========================================================================alter
    public void incrKmCounter() {
        kilometerCounter++;
    }

    public void repair() {
        status = Status.INTACTRUNNING;
    }

    public void possibleDamage() {
        if (rnd.nextInt((600000 - kilometerCounter)) < kilometerCounter/1000){
            status = Status.BROKE;
        }
    }

    //============================================================================simulate

    public void start(Tank tank) {
        if (tank.getTankLevel() > 0) {
            status = Status.INTACTRUNNING;
        }
    }
}
