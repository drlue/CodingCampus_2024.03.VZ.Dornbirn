package irem.week08.CarSimulation;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan", "Skyline R34 GT-R", 280, Car.FuelType.PETROL, 50.0, 1.540);
        System.out.println("Gefahrene Kilometer: " + myCar.drive(100));
        System.out.println("Tanken...");
        myCar.refuel(20);
        System.out.println("Gefahrene Kilometer nach dem Tanken: " + myCar.drive(200));
    }
}

