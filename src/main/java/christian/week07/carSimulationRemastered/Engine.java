package christian.week07.carSimulationRemastered;

public class Engine {
    private double kW;
    private int kilometerCounter;
    enum DriveType {GASOLINE,DIESEL,GAS,ELECTRIC}
    private DriveType driveType;
    enum Status {BROKE,INTACTRUNNING,INTACTSTOP}
    private Status status;

    public Engine(double kW,DriveType driveType){

    }
}
