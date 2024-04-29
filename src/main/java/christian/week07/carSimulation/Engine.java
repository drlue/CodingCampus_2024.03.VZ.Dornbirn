package christian.week07.carSimulation;

public class Engine {
    private int anzahlZylinder;
    private double kW;
    private boolean engineRunning;

    enum Status {BROKE, INTACT}

    private Status status;

    private int kilometerzaehler;

    enum Antriebsart {BENZIN, DIESEL, GAS, STROM}

    private Antriebsart antriebsart;

    public Engine(int anzahlZylinder, double kW,Antriebsart antriebsart) {
        this.anzahlZylinder = anzahlZylinder;
        this.kW = kW;
        this.antriebsart = antriebsart;
        this.kilometerzaehler = 0;
        engineRunning = false;
        status = Status.INTACT;
    }

    //======================================================================================================================get======================
    public double getkW() {
        return kW;
    }

    public Status getStatus() {
        return status;
    }

    public Antriebsart getAntriebsart() {
        return antriebsart;
    }

    public int getKilometerzaehler() {
        return kilometerzaehler;
    }
    //======================================================================================================================set======================
    public void setKilometerzaehler(int modifier){
        kilometerzaehler += modifier;
        motorDamage(kilometerzaehler);
    }

    //======================================================================================================================methods==========================
    public void startMotor(Tank tank) {
        if (tank.getTankLevel() > 0 && !engineRunning) {
            engineRunning = true;
            System.out.printf("Motor has been started!%n");
        }
    }

    public void stopMotor(){
        if(engineRunning){
            engineRunning=false;
        }
    }

    private void motorDamage(int kilometerZaehler) {
        if (Main.rnd.nextInt(0, 300000 - kilometerZaehler) <= kilometerZaehler / 100) {
            System.out.printf("The Engine broke down at %d kilometers!%n", kilometerZaehler);
            status = Status.BROKE;
        }
    }

    public void repair(Car car, String name) {
        if (status == Status.BROKE) {
            status = Status.INTACT;
            System.out.printf("Engine in %s has been repaired in %s!%n", car.getHersteller() + " " + car.getModell(), name);
        }
    }
}
