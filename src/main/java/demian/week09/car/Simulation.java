package demian.week09.car;

import java.util.Random;

public class Simulation {
    public static void main(String[] args) {
        // Anzahl der Autos in der Simulation
        int numberOfCars = 3;

        // Array zum Speichern der Autoinstanzen
        Car[] cars = new Car[numberOfCars];

        // Autos initialisieren und zufällige Werte zuweisen
        Random random = new Random();
        for (int i = 0; i < numberOfCars; i++) {
            String hersteller = "Hersteller" + (i + 1);
            String modell = "Modell" + (i + 1);
            int kW = random.nextInt(100) + 100; // Zufällige kW zwischen 100 und 200
            double tankinhalt = random.nextDouble() * 50; // Zufälliger Tankinhalt zwischen 0 und 50 Litern
            //BAUSTELLE
//            Car.DriveType =
//            Car.DriveType = Car.DriveTypes.values()[random.nextInt(Car.DriveTypes.values().length)];
            double gewicht = random.nextInt(1000) + 1000; // Zufälliges Gewicht zwischen 1000 und 2000 kg

            cars[i] = new Car(hersteller, modell, kW, (int) tankinhalt, (int) gewicht);
        }

        // Simulationsschleife
        for (int i = 0; i < 100; i++) {
            System.out.println("Runde " + (i + 1) + ":");

            // Autos fahren lassen
            for (Car car : cars) {
                int distance = random.nextInt(50) + 50; // Zufällige Strecke zwischen 50 und 100 km
                int actualDistance = car.roadtrip(distance); // Strecke zurücklegen und tatsächlich zurückgelegte Strecke erhalten

                // Ausgabe des Fahrfortschritts und Tankstands
                System.out.println(car.getManufacturer() + " " + car.getModell() + " ist " + actualDistance + " km gefahren. Tankinhalt: " + car.getFuelAmount() + " Liter");

                // Wenn der Tank leer ist, tanken
                if (actualDistance < distance) {
                    double fuelToRefuel = distance - actualDistance; // Benötigter Kraftstoff zum Auffüllen
                    car.refuel(fuelToRefuel); // Tank auffüllen
                    System.out.println("Tank von " + car.getManufacturer() + " " + car.getModell() + " aufgefüllt um " + fuelToRefuel + " Liter.");
                }
            }

            System.out.println(); // Leerzeile zwischen den Runden
        }
    }
}
