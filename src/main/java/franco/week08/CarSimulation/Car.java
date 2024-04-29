package franco.week08.CarSimulation;

public class Car {
    private String manufacturer;
    private String model;
    private double kW;
    private double weight;
    private double tankCapacity;

    enum MotorPowered {PETROL, DIESEL, GAS, ELECTRIC}

    private Tank tank;
    private Engine engine;
    private MotorPowered motorPowered;

    public Car(String manufacturer, String model, double kW,double weight, MotorPowered motorPowered, double tankCapacity) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.kW = kW;
        this.weight=weight;
        this.motorPowered = motorPowered;
        this.tankCapacity = tankCapacity;
    }

    public int drive(int kilometer) {
        int distanceCovered = 0;
        while (distanceCovered < kilometer && tankCapacity > 0) {
            double consumption = (weight / kW) * 0.01;
            switch (motorPowered) {
                case PETROL -> tankCapacity -= consumption * 1.3;
                case DIESEL -> tankCapacity -= consumption * 1.4;
                case GAS -> tankCapacity -= consumption * 1.2;
                case ELECTRIC -> tankCapacity -= consumption * 1.6;
            }
            distanceCovered++;
        }
        if (tankCapacity <= 0) {
            System.out.println("Run out fuel buddy, you drove " + distanceCovered + " km...");
            System.out.println("Refill the tank you have "+(kilometer-distanceCovered)+" left...");

        } else {
            System.out.println("We drove " + distanceCovered + " km and there is " + tankCapacity + " litre left...");
        }
        return distanceCovered;
    }

    public void refuel(double fuelAmount) {
        tankCapacity += fuelAmount;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public  void simulationDay(){

    }

}
