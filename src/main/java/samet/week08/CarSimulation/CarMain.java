package samet.week08.CarSimulation;

import samet.week08.CarSimulation.Car;

public class CarMain {

    public static void main(String[] args) {

        Car car = new Car("Mercedes", "C 200 ", 150, 1695, Car.DriveArt.PETROL);
        Car car1 = new Car("BMW", "435d", 230, 1700, Car.DriveArt.DIESEL);
        Car car2 = new Car("Audi", "A4", 125, 1672, Car.DriveArt.GAS);
        Car car3 = new Car("Tesla", "Model S", 330, 1835, Car.DriveArt.ELECTRIC);

        Car[] cars = {car, car1, car2, car3};

        carSimulation(cars, 500);

    }

    static void carSimulation(Car[] cars, int distance) {
        for (Car car : cars) {
            int distanceLeft = distance;
            while (distanceLeft > 0) {
                int distanceDriven = car.drive(distanceLeft);
                System.out.println(car.getManufacturer() + " " + car.getModel() + " fährt " + distanceDriven + " km. ");
                distanceLeft -= distanceDriven;
                if (car.getTankCapacity() <= 0) {
                    System.out.println("Tank von " + car.getManufacturer() + " " + car.getModel() + "ist leer und wird aufgefüllt. ");
                    car.refillTank(50);
                    System.out.println("Tank von " + car.getManufacturer() + " " + car.getModel() + " wurde aufgefüllt. ");

                }
            }
        }
    }
}