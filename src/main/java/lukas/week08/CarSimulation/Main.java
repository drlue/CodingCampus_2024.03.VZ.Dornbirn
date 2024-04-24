package lukas.week08.CarSimulation;

import java.util.Random;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
       //MotorTypes
        Car.MotorType[] mTypes = Car.MotorType.values();

        //Define Cars
        Vector<Car> cars = new Vector<>();
        for (int i = 0; i < 3; i++) {
            Car c = new Car("Audi",
                    "A" + i,
                    Car.random.nextInt(50, 250), //kW
                    Car.random.nextInt(50, 100),//tank
                    Car.random.nextInt(1200, 2500),//weight
                    mTypes[Car.random.nextInt(0, mTypes.length)]); //motor Type
            cars.add(c);
        }

        for (Car c : cars) {
            c.print();
        }

        //Simulate Drive
        for (int i = 0; i < 3; i++) {
            System.out.printf("------- TAG %d -------%n", i+1);
            for(Car c : cars) {
                c.simulate(i);
            }
        }

        for (Car c : cars) {
            c.print();
        }

    }
}
