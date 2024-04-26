package irem.week08.CarSimulation;

public class Car {

    private Object fuelType = null;
    private String manufacturer;
    private String model;
    private int power; // Leistung in kW
    private double fuelTankCapacity; // Tankinhalt in Litern
    private double weight; // Gewicht in kg
    private double fuelLevel; // Aktueller Kraftstoffstand in Litern


    enum FuelType {
        PETROL, DIESEL, GAS, ELECTRIC{
        };
    }
    public <fuelType> Car(String manufacturer, String model, int power, FuelType fuelType, double fuelTankCapacity, double weight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.power = power;
        this.fuelType = fuelType;
        this.fuelTankCapacity = fuelTankCapacity;
        this.weight = weight;
        this.fuelLevel = fuelTankCapacity;
    }

    public int drive(int kilometers) {
        double fuelConsumption = calculateFuelConsumption();
        double requiredFuel = kilometers * fuelConsumption;

        if (fuelLevel >= requiredFuel) {
            fuelLevel -= requiredFuel;
            return kilometers;
        } else {
            int possibleDistance = (int) (fuelLevel / fuelConsumption);
            fuelLevel = 0;
            return possibleDistance;
        }
    }
    private double calculateFuelConsumption() {
        return (weight / 1.540) * (power / 280) * 0.1;
    }

    // Methode zum Tanken
    public void refuel(double amount) {
        if (amount > 0 && (fuelLevel + amount) <= fuelTankCapacity) {
            fuelLevel += amount;
        }
    }
}
