package christian.week07.carSimulationRemastered;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    Engine engine1 = new Engine(70, Engine.DriveType.DIESEL);
    Tank tank1 = new Tank(70);

    @Test
    public void driveWithoutEngineOrTank() {
        Car car1 = new Car("Hoppla", "mega", 1200, null, null);
        assertEquals(-1, car1.drive(300, 0.75));
    }
    @Test
    public void driveWithoutEngine() {
        Car car1 = new Car("Hoppla", "mega", 1200, null, tank1);
        assertEquals(-1, car1.drive(300, 0.75));
    }
    @Test
    public void driveWithoutTank() {
        Car car1 = new Car("Hoppla", "mega", 1200, engine1, null);
        assertEquals(-1, car1.drive(300, 0.75));
    }
    @Test
    public void drive1Kilometer() {
        Car car1 = new Car("Hoppla", "mega", 1200, engine1, tank1);
        assertEquals(299, car1.drive(300, 0.75));
    }
    @Test
    public void driveWithNegativeKilometers() {
        Car car1 = new Car("Hoppla", "mega", 1200, engine1, tank1);
        assertEquals(-2, car1.drive(-1, 0.75));
    }
    @Test
    public void driveWithNegativeFuelConsumption() {
        Car car1 = new Car("Hoppla", "mega", 1200, engine1, tank1);
        assertEquals(-2, car1.drive(300, -0.75));
    }
}
