package ardijanla.week08.NewCarSimulation;

import ardijanla.ConsoleColors;

public class Tank {
    public Tank(double fuelTank) {
        this.fuelTank = fuelTank;
    }

    private double fuelTank; // Tank capacity in liters for fuel, kWh for electric


    public void addFuel(int fuel,Engine engine) {
        fuelTank += fuel;
        System.out.println("Tank aufgefüllt um " + ConsoleColors.PURPLE + fuel + (engine.getDriveType() == Engine.DriveType.ELECTRIC ? " kWh" : " Liter") + ConsoleColors.RESET);
    }

    public double getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(double fuelTank) {
        this.fuelTank = fuelTank;
    }
}
