package samet.week08;

import java.util.ArrayList;
import java.util.List;

public class CarMain {

    public static void main(String[] args) {

        Car car = new Car("Mercedes", "C 200 ", 150, 1695, Car.DriveArt.PETROL);
        Car car1 = new Car("BMW", "435d", 230, 1700, Car.DriveArt.DIESEL);
        Car car2 = new Car("Audi", "A4", 125, 1672, Car.DriveArt.GAS);
        Car car3 = new Car("Tesla", "Model S", 330, 1835, Car.DriveArt.ELECTRIC);

        Car[] cars = {car, car1, car2, car3};

    }
    static void carSimulation(Car[] cars, int distance){
        for (Car car : cars){
            int distanceLeft = distance;
            while (distanceLeft > 0){
                int distanceDriven = car.drive(distanceLeft);
                System.out.println(car);
            }
        }
    }

}