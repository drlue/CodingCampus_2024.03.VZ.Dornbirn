package samet.week08;

public class Car {

    private String manufacturer;
    private String model;
    private double kW;
    private double tankCapacity;
    private double weight;

    enum DriveArt {PETROL, DIESEL, GAS, ELECTRIC}

    private DriveArt driveArt;


    public Car(String manufacturer, String model, double kW, double weight, DriveArt driveArt) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.kW = kW;
        this.tankCapacity = tankCapacity;
        this.weight = weight;
        this.driveArt = driveArt;
    }

    public int drive(int kilometer) {
        if (tankCapacity <= 0) {
            return 0;
        } else {
            double consumption = (kW / weight) / 100;
            double distance = tankCapacity / consumption;
            if (distance >= kilometer) {
                return kilometer;
            } else {
                tankCapacity = 0;
                return (int) distance;
            }
        }
    }
    public void refillTank(double fuel){
        tankCapacity += fuel;
    }
}


