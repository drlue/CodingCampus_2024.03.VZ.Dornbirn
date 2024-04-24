package franco.week08.CarSimulation;

public class Car {
    private String manufacturer;
    private String model;
    private double kW;

    private double weight;
    private double tankCapacity;

    enum MotorPowered {PETROL, DIESEL, GAS, ELECTRIC}

    ;
    private MotorPowered motorPowered;

    public Car(String manufacturer, String model, double kW, MotorPowered motorPowered) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.kW = kW;
        this.motorPowered = motorPowered;

    }

    public int drive(int kilometer) {
        int distanceCovered = 0;
        while (distanceCovered < kilometer && tankCapacity > 0) {
            double comsumption = (weight / kW) * 0.01;
            switch (motorPowered) {
                case PETROL -> tankCapacity -= comsumption * 1.2;
                case DIESEL -> tankCapacity -= comsumption * 1.3;
                case GAS -> tankCapacity -= comsumption * 1.1;
                case ELECTRIC -> tankCapacity -= comsumption * 1.6;
            }
            distanceCovered++;
        }
        return distanceCovered;
    }

    public void refuel(double fuelAmount) {
        tankCapacity += fuelAmount;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }
}
