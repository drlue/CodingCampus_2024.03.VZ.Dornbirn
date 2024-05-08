package ardijanla.week08.NewCarSimulation;


import static ardijanla.week08.NewCarSimulation.moin.rnd;

public class Engine {

    enum DriveType {GASOLINE, DIESEL, GAS, ELECTRIC}
    private String name;
    private DriveType driveType;
    private int kW;
    private double weight;
    private String manufacturer;
    private boolean carOn;

    public Engine(String name, DriveType driveType, int kW, double weight, String manufacturer) {
        this.name = name;
        this.driveType = driveType;
        this.kW = kW;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.carOn = false;
    }

    public int getkW() {
        return kW;
    }

    public DriveType getDriveType() {
        return driveType;
    }

    public boolean turnCarOn(Car car,boolean onOff){
        if (carOn){
            System.out.printf("%s is on, and ready to drive %n",car.getClass().getSimpleName());
            return true;
        }else{
            System.out.printf("%s is not on, you cannot drive%n",car.getClass().getSimpleName());
            return false;
        }
    }


}
