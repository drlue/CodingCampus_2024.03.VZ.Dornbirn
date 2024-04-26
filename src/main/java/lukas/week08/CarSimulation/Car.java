package lukas.week08.CarSimulation;

import ardijanla.ConsoleColors;
import franco.radioactive.ConsoleInput;

import java.util.Random;

public class Car {
    public static Random random = new Random();
    private static double avgSpecificConsumption = 5d / 1500 / 80;
    // 5l/100km for a car with 80kw and 1500kg
    private String manufacturer;
    private String model;
    private int kW;
    private Engine engine;
    private int tankCapacity;
    private Tank tank;
    private int weight;
    private MotorType motorType;

    public static enum MotorType {PETROL, DIESEL, GAS, ELECTRIC;}

    private int currentTank;
    private double avgConsumption;

    private int kmCounter;

    public Car(String manufacturer, String model, int kW, int tankCapacity, int weight, MotorType motorType) {

        this.manufacturer = manufacturer;
        this.model = model;
        this.kW = kW;
        this.tankCapacity = tankCapacity;
        this.weight = weight;
        this.motorType = motorType;
        this.currentTank = tankCapacity;
        //5l/100km = 14kWh/100km
        avgConsumption = avgSpecificConsumption * weight * kW * (motorType == MotorType.ELECTRIC ? 14 / 5f : 1);
        kmCounter = 0;
    }


    //---methods

    private String energyUnit(){
        return motorType == MotorType.ELECTRIC ? "kWh" : "l";
    }
    private String currTankUnit(){
        return motorType == MotorType.ELECTRIC ? "%" : "l";
    }

    private int currTankAmount(){
        return motorType == MotorType.ELECTRIC ? currentTank / tankCapacity *100 : currentTank ;
    }

    private String tankString(){
        return motorType == MotorType.ELECTRIC ? "Batterie Kapazität" : "max Tankfüllung";
    }

    private String currTankString(){
        return  motorType == MotorType.ELECTRIC ? "Ladezustand" : "Tankinhalt";
    }

    private int drive(int kilometer) {
        double neededFuel = kilometer * avgConsumption / 100;
        int drivenDistance = 0;
        if (currentTank > neededFuel) { //enough fuel
            currentTank -= (int) neededFuel;
            drivenDistance = kilometer;
            System.out.printf("%s ist %d km gefahren - noch %d Liter im Tank%n", this, drivenDistance, currentTank);
        } else { //not enough fuel
            drivenDistance = (int) (currentTank / avgConsumption * 100);
            currentTank -= drivenDistance * avgConsumption / 100;
            System.out.printf("%s ist nur %d km gefahren - %sTank ist leer%s bitte Tanken!%n", this, drivenDistance, ConsoleColors.RED, ConsoleColors.RESET);
        }
        kmCounter += drivenDistance;
        return drivenDistance;
    }

    private void refuel(int amount) {
        currentTank += amount;
        System.out.printf("%s%s hat %d Liter getankt.%s Neuer Tankinhalt: %d Liter%n",ConsoleColors.YELLOW, this, amount, ConsoleColors.RESET, currentTank);
    }

    public void simulate(int i) {
        int distance = random.nextInt(1000);
        System.out.printf("%s macht eine Reise von %d km%n", this, distance);
        int drivenDistance = drive(distance);
        while (distance - drivenDistance > 0) {
            System.out.printf("%s macht einen Tankstopp%n", this);
            int amount = random.nextInt(10,tankCapacity);
            refuel(amount);
            int newDistance = distance - drivenDistance;
            System.out.printf("Reise wird bei km %d fortgesetzt%n",drivenDistance);
            drivenDistance += drive(newDistance);
        }
        System.out.printf("%s%s hat die Reise von %d km beendet%s%n", ConsoleColors.GREEN, this, drivenDistance, ConsoleColors.RESET);

    }

    //--- print

    public void print() {

        System.out.println(this);
        System.out.printf("|-- Leistung:           %4d kW%n", kW);
        System.out.printf("|-- %-20s%4d %s%n",tankString()+":", tankCapacity, energyUnit());
        System.out.printf("|-- %-20s%4d %s%n",currTankString()+":", currTankAmount(), currTankUnit());
        System.out.printf("|-- Gewicht:            %4d kg%n", weight);
        System.out.printf("|-- Gewicht:            %4d kg%n", weight);
        System.out.printf("|-- Antriebsart:        %s%n", motorType);
        System.out.printf("|-- Verbrauch:          %4.0f %s/100km%n", avgConsumption, energyUnit());
    }

    @Override
    public String toString() {
        return String.format("%s-%s", manufacturer, model);
    }
}
