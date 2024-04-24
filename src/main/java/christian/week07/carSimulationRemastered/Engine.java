package christian.week07.carSimulationRemastered;

public class Engine {
    private double kW;
    private int kilometerCounter;

    enum DriveType {GASOLINE, DIESEL, GAS, ELECTRIC}

    private DriveType driveType;

    enum Status {BROKE, INTACTRUNNING, INTACTSTOP}

    private Status status;

    public Engine(double kW, DriveType driveType) {
        this.kW = kW;
        this.kilometerCounter = 0;
        this.driveType =driveType;
        this.status = Status.INTACTSTOP;
    }
    //==================================================================================================================get

    public double getkW() {
        return kW;
    }

    //==================================================================================================================set
    //==================================================================================================================alter
    //==================================================================================================================simulate
}
