package ardijanla.week08.NewCarSimulation;

import ardijanla.ConsoleColors;

import static ardijanla.week08.NewCarSimulation.moin.rnd;

public class Car {
    // Attributes of the class
    private boolean isDefect;
    private String manufacturer;
    private String model;
    private double weight; // Weight in kilograms
    private Engine engine;
    private Tank tank;


    // Constructor
    public Car(String manufacturer, String model, double weight, Engine engine, Tank tank) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.weight = weight;
        this.engine = engine;
        this.tank = tank;
        this.isDefect = false;
    }

    // Methode zum Fahren
    public int drive(int kilometers) {
        double consumptionPerKm = (weight / 1000.0) * (engine.getkW() / 100.0);
        double maxDistance = tank.getFuelTank() / consumptionPerKm;
        boolean carOn = engine.turnCarOn(this, true);


        if (kilometers <= maxDistance && carOn) {

            tank.setFuelTank(tank.getFuelTank() - kilometers * consumptionPerKm);
            System.out.println(ConsoleColors.YELLOW + kilometers + " km gefahren" + ConsoleColors.RESET);
            return kilometers;
        } else {
            tank.setFuelTank(0);
            System.out.printf(ConsoleColors.RED + "Tank leer... %d km gefahren%n" + ConsoleColors.RESET, (int) maxDistance);

            return (int) maxDistance;

        }
    }

    public void leftCapacity() {
        System.out.println("Verbleibende Kapazität: " + ConsoleColors.CYAN + tank.getFuelTank() + (engine.getDriveType() == Engine.DriveType.ELECTRIC ? " kWh" : " Liter") + ConsoleColors.RESET);
    }

    public void carDefect() {
        if (rnd.nextDouble() < 0.4) {
            isDefect = true;
        }
    }

    public void fillCar(int fuel) {
        this.tank.addFuel(fuel, this.engine);
    }


}
